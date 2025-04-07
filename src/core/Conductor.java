/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author examen
 */
public class Conductor extends Empleado {
    
    private ArrayList<Turno>turnos;

    public Conductor( int id, String nombre, int edad, double Salario) {
        super(id, nombre, edad, Salario);
        this.turnos = new ArrayList<>();
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.Salario = Salario;
    }
    
    
    
}
