package dataStructures;

import java.util.ArrayList;
import java.util.Iterator;

public class SimpleTree {

    No raiz;
    int tamanho;

    public SimpleTree(Object o) {
        raiz = new No(null, o);
        tamanho = 1;
    }

    public No root() {
        return raiz;
    }

    public No parent(No v) {
        return (v.parent());
    }

    public Iterator children(No v) {
        return v.children();
    }

    public boolean isInternal(No v) {
        return (v.childrenNumber() > 0);
    }

    public boolean isExternal(No v) {
        return (v.childrenNumber() == 0);
    }

    public boolean isRoot(No v) {
        return v == raiz;
    }

    public void addChild(No v, Object o) {
        No novo = new No(v, o);
        v.addChild(novo);
        tamanho++;
    }

    // apenas nos externos e que tenham pai
    public Object remove(No v) throws InvalidNoException {
        No pai = v.parent();
        if (pai != null || isExternal(v))
            pai.removeChild(
                    v);
        else
            throw new InvalidNoException();
        Object o = v.element();
        tamanho--;
        return o;
    }

    public void swapElements(No v, No w) {
        Object aux = v.element();
        v.setElement(w.element());
        w.setElement(aux);
    }

    public int depth(No v) {
        int profundidade = profundidade(v);
        return profundidade;
    }

    private int profundidade(No v) {
        if (v == raiz)
            return 0;
        else
            return 1 + profundidade(v.parent());
    }

    public int height() {
        int profundidade = 0;

        Iterator el = Nos();

        while (el.hasNext()) {
            No v = (No) el.next();
            if (profundidade(v) > profundidade)
                profundidade = profundidade(v);
        }

        return profundidade;
    }

    public Iterator elements() {
        ArrayList<Object> lista = new ArrayList<Object>();

        treeObjectsToList(raiz, lista);

        return lista.iterator();
    }

    public void treeObjectsToList(No v, ArrayList<Object> lista) {
        lista.add(v.element());
        Iterator it = v.children();
        while (it.hasNext()) {
            No no = (No) it.next();
            treeObjectsToList(no, lista);
        }
    }

    public void treeNodesToList(No v, ArrayList<Object> lista) {
        lista.add(v);
        Iterator it = v.children();
        while (it.hasNext()) {
            No no = (No) it.next();
            treeNodesToList(no, lista);
        }
    }

    public void printLinear()
    {
        Iterator elements = elements();
        while (elements.hasNext())
            System.out.print(elements.next() + " ");      
        System.out.println();
    }

    public Iterator Nos() {
        // M�todo que serve de exerc�cio
        ArrayList<Object> lista = new ArrayList<Object>();

        treeNodesToList(raiz, lista);

        return lista.iterator();
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return false;
    }

    public Object replace(No v, Object o) {
        v.setElement(o);
        return v.element();
    }

    public class No {

        private Object o;
        private No pai;
        private ArrayList filhos = new ArrayList();

        public No(No pai, Object o) {
            this.pai = pai;
            this.o = o;
        }

        public Object element() {
            return o;
        }

        public No parent() {
            return pai;
        }

        public void setElement(Object o) {
            this.o = o;
        }

        public void addChild(No o) {
            filhos.add(o);
        }

        public void removeChild(No o) {
            filhos.remove(o);
        }

        public int childrenNumber() {
            return filhos.size();
        }

        public Iterator children() {
            return filhos.iterator();
        }
    }
    /* Fim da classe aninhada para armazenar o No */
}
