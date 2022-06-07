/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures.Exceptions;

/**
 *
 * @author 20211014040004
 */
public class VectorInvalidIndexException extends RuntimeException {
    public VectorInvalidIndexException(String message){
	super(message);
    }
}
