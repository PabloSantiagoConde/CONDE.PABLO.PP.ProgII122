/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;


public class ExpedienteNuloException extends NullPointerException {
    private final static String MESSAGE = "Expediente nulo, agregar un expediente";
    
    public ExpedienteNuloException() {
        this(MESSAGE);
    }
    
    public ExpedienteNuloException(String message) {
        super(message);
    }
    
    
}

