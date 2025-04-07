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
public class TrashCity {
    
    private ArrayList<Empleado>empleados;
    private ArrayList<Camion>camiones;
    private ArrayList<Ruta>rutas;
    private ArrayList<Turno>turnos;

    public TrashCity() {
        this.empleados = new ArrayList<>();
        this.camiones = new ArrayList<>();
        this.rutas = new ArrayList<>();
        this.turnos = new ArrayList<>();
    }
    
    public void  addEmpleado(Conductor id){
     this.empleados.add((id));
    
       }
    
    public void addEmpleado(Asistente id){
        this.empleados.add((id));
 
    }
    
    public void addCamion(Camion id){
        this.camiones.add(id);
        
    }
    
    public void puntoAdd(){
        
    }

    public void addRuta(ArrayList<PuntoGeografico> puntos) {
        this.rutas.add(new Ruta(puntos));
    }
    
      public Camion getCamion(int id) {
        return this.camiones.get(id);
    }
      
        public Empleado getEmpleado(int id) {
        return this.empleados.get(id);
    }
        
          public Ruta getRuta(int id) {
        return this.rutas.get(id);
    }
          
     public void addTurno(int par, Camion camion, Empleado empleado, Empleado empleado1, Empleado empleado2, Ruta ruta){
         
     }
     
      public Turno getTurno(int id) {
        return this.turnos.get(id);
    }
}
