/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author Voolkia
 */
public class ExpedienteDuplicadoException extends IllegalStateException{
    
    private final static String MESSAGE = "Expediente duplicado";
    
    public ExpedienteDuplicadoException() {
        this(MESSAGE);
    }
    
    public ExpedienteDuplicadoException(String message) {
        super(message);
    }
    
}
    
