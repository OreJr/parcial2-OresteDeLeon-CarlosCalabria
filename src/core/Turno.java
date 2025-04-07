/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDateTime;


/**
 *
 * @author examen
 */
public class Turno {
    
    private int id;
    private Camion camion;
    private Conductor conductor;
    private Asistente asistente1;
    private Asistente asistente2;
    private Ruta ruta;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private Residuo residuos;
    
    
    public void ejecutar(LocalDateTime date, int suma) {
        this.fechaFin = date.plusHours(suma);
    }

    public void clasificarResiduos(double vidrio, double papel, double plastico, double metal, double residuosOrganicos) {
        this.residuos = new Residuo(vidrio, papel, plastico, metal, residuosOrganicos);
    }

    public int getId() {
        return id;
    }

    public Camion getCamion() {
        return camion;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Asistente getAsistente1() {
        return asistente1;
    }

    public Asistente getAsistente2() {
        return asistente2;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public Residuo getResiduos() {
        return residuos;
    }
    
    
    
    
}
