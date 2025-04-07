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

    private ArrayList<Empleado> empleados;
    private ArrayList<Camion> camiones;
    private ArrayList<Ruta> rutas;
    private ArrayList<Turno> turnos;

    public TrashCity() {
        this.empleados = new ArrayList<>();
        this.camiones = new ArrayList<>();
        this.rutas = new ArrayList<>();
        this.turnos = new ArrayList<>();
    }

    public void addEmpleado(Conductor id) {
        if (!this.empleados.contains(id)) {
            this.empleados.add((id));
        }

    }

    public void addEmpleado(Asistente id) {
        if (!this.empleados.contains(id)) {
            this.empleados.add((id));
        }

    }

    public void addCamion(Camion id) {

        if (!this.camiones.contains(id)) {
            this.camiones.add(id);

        }

    }

    public void puntoAdd() {

    }

    public void addRuta(ArrayList<PuntoGeografico> puntos) {
        Ruta ruta = new Ruta(puntos);
        if(!this.rutas.contains(ruta)){
                this.rutas.add(ruta);
        }
    }

    public Camion getCamion(int id) {
        for (Camion camion : this.camiones) {
            if (camion.getId() == id) {
                return camion;
            }
        }
        return null;
    }

    public Empleado getEmpleado(int id) {
        for (Empleado empleado : this.empleados) {
            if (empleado.id == id) {
                return empleado;
            }
        }
        return null;
    }

    public Ruta getRuta(int id) {
        return this.rutas.get(id);
    }

    public void addTurno(int par, Camion camion, Empleado empleado, Empleado empleado1, Empleado empleado2, Ruta ruta) {
        
    }

    public Turno getTurno(int id) {
        for (Turno turno : this.turnos) {
            if (turno.getId() == id) {
                return turno;
            }

        }
        return null;
    }

    public void showMinMaxTurnoPorResiduo() {
        double menorCantidadVidrio = 3000;
        double mayorCantidadVidrio = -1;

        double menorCantidadPapel = 3000;
        double mayorCantidadPapel = -1;

        double menorCantidadPlastico = 3000;
        double mayorCantidadPlastico = -1;

        double menorCantidadMetal = 3000;
        double mayorCantidadMetal = -1;

        double menorCantidadResiduosOrganicos = 3000;
        double mayorCantidadResiduosOrganicos = -1;

        Turno turnoMaxVidrio = new Turno();
        Turno turnoMinVidrio = new Turno();
        Turno turnoMaxPapel = new Turno();
        Turno turnoMinPapel = new Turno();
        Turno turnoMaxPlastico = new Turno();
        Turno turnoMinPlastico = new Turno();
        Turno turnoMaxMetal = new Turno();
        Turno turnoMinMetal = new Turno();
        Turno turnoMaxResiduosOrganicos = new Turno();
        Turno turnoMinResiduosOrganicos = new Turno();

        for (Turno turno : this.turnos) {
            if (turno.getResiduos().getVidrio() > mayorCantidadVidrio) {
                mayorCantidadVidrio = turno.getResiduos().getVidrio();
            }
            if (turno.getResiduos().getVidrio() < menorCantidadVidrio) {
                menorCantidadVidrio = turno.getResiduos().getVidrio();
            }

            //papel
            if (turno.getResiduos().getPapel() > mayorCantidadPapel) {
                mayorCantidadPapel = turno.getResiduos().getPapel();
            }
            if (turno.getResiduos().getPapel() < menorCantidadPapel) {
                menorCantidadPapel = turno.getResiduos().getPapel();
            }

            //plastico
            if (turno.getResiduos().getPlastico() > mayorCantidadPlastico) {
                mayorCantidadPlastico = turno.getResiduos().getPlastico();
            }
            if (turno.getResiduos().getPlastico() < menorCantidadPlastico) {
                menorCantidadPlastico = turno.getResiduos().getPlastico();
            }

            //metal
            if (turno.getResiduos().getMetal() > mayorCantidadMetal) {
                mayorCantidadMetal = turno.getResiduos().getMetal();
            }
            if (turno.getResiduos().getMetal() < menorCantidadMetal) {
                menorCantidadMetal = turno.getResiduos().getMetal();
            }

            //ResiduosOrganicos
            if (turno.getResiduos().getResiduosOrganicos() > mayorCantidadResiduosOrganicos) {
                mayorCantidadResiduosOrganicos = turno.getResiduos().getResiduosOrganicos();
            }
            if (turno.getResiduos().getResiduosOrganicos() < menorCantidadResiduosOrganicos) {
                menorCantidadResiduosOrganicos = turno.getResiduos().getResiduosOrganicos();
            }

        }

        for (Turno turno : this.turnos) {

            if (turno.getResiduos().getVidrio() == mayorCantidadVidrio) {
                turnoMaxVidrio = turno;
            }

            if (turno.getResiduos().getVidrio() == menorCantidadVidrio) {
                turnoMinVidrio = turno;
            }

            if (turno.getResiduos().getPapel() == mayorCantidadPapel) {
                turnoMaxPapel = turno;
            }

            if (turno.getResiduos().getPapel() == menorCantidadPapel) {
                turnoMinPapel = turno;
            }

            if (turno.getResiduos().getPlastico() == mayorCantidadPlastico) {
                turnoMaxPlastico = turno;
            }

            if (turno.getResiduos().getPlastico() == menorCantidadPlastico) {
                turnoMinPlastico = turno;
            }

            if (turno.getResiduos().getMetal() == mayorCantidadMetal) {
                turnoMaxMetal = turno;
            }

            if (turno.getResiduos().getMetal() == menorCantidadMetal) {
                turnoMinMetal = turno;
            }

            if (turno.getResiduos().getResiduosOrganicos() == mayorCantidadResiduosOrganicos) {
                turnoMaxResiduosOrganicos = turno;
            }

            if (turno.getResiduos().getResiduosOrganicos() == menorCantidadResiduosOrganicos) {
                turnoMinResiduosOrganicos = turno;
            }
        }

        System.out.println("Residuo - Vidrio - Turno Minimo\n"
                + "    : - ID\n"
                + "    : " + turnoMinVidrio.getId() + " - Camion\n"
                + "    : " + turnoMinVidrio.getCamion() + " - Conductor\n"
                + "    :\n"
                + " * " + turnoMinVidrio.getConductor() + "- Asistente 1: " + turnoMinVidrio.getAsistente1() + " - Asistente 2: " + turnoMinVidrio.getAsistente2() + " -\n"
                + " * Fecha Inicio\n"
                + turnoMinVidrio.getFechaInicio() + "\n"
                + " - Fecha Fin\n"
                + "    : "
                + turnoMinVidrio.getFechaFin() + "\n"
                + " - Cantidad\n"
                + "    :\n"
                + " * "
                + menorCantidadVidrio + " - Turno Maximo\n"
                + "    : - ID\n"
                + "    : " + turnoMaxVidrio.getId() + " - Camion\n"
                + "    : " + turnoMaxVidrio.getCamion().getPlaca() + " - Conductor\n"
                + "    : " + turnoMaxVidrio.getConductor() + " -\n"
                + " * Asistente 1: " + turnoMaxVidrio.getAsistente1() + " - Asistente 2: " + turnoMaxVidrio.getAsistente2() + "- Fecha Inicio\n"
                + "    :\n"
                + " * " + turnoMaxVidrio.getFechaInicio() + " - Fecha Fin\n"
                + "    : " + turnoMaxVidrio.getFechaFin() + " - Cantidad\n"
                + "    : " + mayorCantidadVidrio);

        System.out.println("Residuo - Papel - Turno Minimo\n"
                + "    : - ID\n"
                + "    : " + turnoMinPapel.getId() + " - Camion\n"
                + "    : " + turnoMinPapel.getCamion() + " - Conductor\n"
                + "    :\n"
                + " * " + turnoMinPapel.getConductor() + "- Asistente 1: " + turnoMinPapel.getAsistente1() + " - Asistente 2: " + turnoMinPapel.getAsistente2() + " -\n"
                + " * Fecha Inicio\n"
                + turnoMinPapel.getFechaInicio() + "\n"
                + " - Fecha Fin\n"
                + "    : "
                + turnoMinPapel.getFechaFin() + "\n"
                + " - Cantidad\n"
                + "    :\n"
                + " * "
                + menorCantidadPapel + " - Turno Maximo\n"
                + "    : - ID\n"
                + "    : " + turnoMaxPapel.getId() + " - Camion\n"
                + "    : " + turnoMaxPapel.getCamion() + " - Conductor\n"
                + "    : " + turnoMaxPapel.getConductor() + " -\n"
                + " * Asistente 1: " + turnoMaxPapel.getAsistente1() + " - Asistente 2: " + turnoMaxPapel.getAsistente2() + "- Fecha Inicio\n"
                + "    :\n"
                + " * " + turnoMaxPapel.getFechaInicio() + " - Fecha Fin\n"
                + "    : " + turnoMaxPapel.getFechaFin() + " - Cantidad\n"
                + "    : " + mayorCantidadPapel);

        System.out.println("Residuo - Plastico - Turno Minimo\n"
                + "    : - ID\n"
                + "    : " + turnoMinPlastico.getId() + " - Camion\n"
                + "    : " + turnoMinPlastico.getCamion() + " - Conductor\n"
                + "    :\n"
                + " * " + turnoMinPlastico.getConductor() + "- Asistente 1: " + turnoMinPlastico.getAsistente1() + " - Asistente 2: " + turnoMinPlastico.getAsistente2() + " -\n"
                + " * Fecha Inicio\n"
                + turnoMinPlastico.getFechaInicio() + "\n"
                + " - Fecha Fin\n"
                + "    : "
                + turnoMinPlastico.getFechaFin() + "\n"
                + " - Cantidad\n"
                + "    :\n"
                + " * "
                + menorCantidadPlastico + " - Turno Maximo\n"
                + "    : - ID\n"
                + "    : " + turnoMaxPlastico.getId() + " - Camion\n"
                + "    : " + turnoMaxPlastico.getCamion() + " - Conductor\n"
                + "    : " + turnoMaxPlastico.getConductor() + " -\n"
                + " * Asistente 1: " + turnoMaxPlastico.getAsistente1() + " - Asistente 2: " + turnoMaxPlastico.getAsistente2() + "- Fecha Inicio\n"
                + "    :\n"
                + " * " + turnoMaxPlastico.getFechaInicio() + " - Fecha Fin\n"
                + "    : " + turnoMaxPlastico.getFechaFin() + " - Cantidad\n"
                + "    : " + mayorCantidadPlastico);

        System.out.println("Residuo - Metal - Turno Minimo\n"
                + "    : - ID\n"
                + "    : " + turnoMinMetal.getId() + " - Camion\n"
                + "    : " + turnoMinMetal.getCamion() + " - Conductor\n"
                + "    :\n"
                + " * " + turnoMinMetal.getConductor() + "- Asistente 1: " + turnoMinMetal.getAsistente1() + " - Asistente 2: " + turnoMinMetal.getAsistente2() + " -\n"
                + " * Fecha Inicio\n"
                + turnoMinMetal.getFechaInicio() + "\n"
                + " - Fecha Fin\n"
                + "    : "
                + turnoMinMetal.getFechaFin() + "\n"
                + " - Cantidad\n"
                + "    :\n"
                + " * "
                + menorCantidadMetal + " - Turno Maximo\n"
                + "    : - ID\n"
                + "    : " + turnoMaxMetal.getId() + " - Camion\n"
                + "    : " + turnoMaxMetal.getCamion() + " - Conductor\n"
                + "    : " + turnoMaxMetal.getConductor() + " -\n"
                + " * Asistente 1: " + turnoMaxMetal.getAsistente1() + " - Asistente 2: " + turnoMaxMetal.getAsistente2() + "- Fecha Inicio\n"
                + "    :\n"
                + " * " + turnoMaxMetal.getFechaInicio() + " - Fecha Fin\n"
                + "    : " + turnoMaxMetal.getFechaFin() + " - Cantidad\n"
                + "    : " + mayorCantidadMetal);

        System.out.println("Residuo - ResiduosOrganicos - Turno Minimo\n"
                + "    : - ID\n"
                + "    : " + turnoMinResiduosOrganicos.getId() + " - Camion\n"
                + "    : " + turnoMinResiduosOrganicos.getCamion() + " - Conductor\n"
                + "    :\n"
                + " * " + turnoMinResiduosOrganicos.getConductor() + "- Asistente 1: " + turnoMinResiduosOrganicos.getAsistente1() + " - Asistente 2: " + turnoMinResiduosOrganicos.getAsistente2() + " -\n"
                + " * Fecha Inicio\n"
                + turnoMinResiduosOrganicos.getFechaInicio() + "\n"
                + " - Fecha Fin\n"
                + "    : "
                + turnoMinResiduosOrganicos.getFechaFin() + "\n"
                + " - Cantidad\n"
                + "    :\n"
                + " * "
                + menorCantidadResiduosOrganicos + " - Turno Maximo\n"
                + "    : - ID\n"
                + "    : " + turnoMaxResiduosOrganicos.getId() + " - Camion\n"
                + "    : " + turnoMaxResiduosOrganicos.getCamion() + " - Conductor\n"
                + "    : " + turnoMaxResiduosOrganicos.getConductor() + " -\n"
                + " * Asistente 1: " + turnoMaxResiduosOrganicos.getAsistente1() + " - Asistente 2: " + turnoMaxResiduosOrganicos.getAsistente2() + "- Fecha Inicio\n"
                + "    :\n"
                + " * " + turnoMaxResiduosOrganicos.getFechaInicio() + " - Fecha Fin\n"
                + "    : " + turnoMaxResiduosOrganicos.getFechaFin() + " - Cantidad\n"
                + "    : " + mayorCantidadResiduosOrganicos);

    }

    public void showRutaMaxMetal() {
        System.out.println("Los puntos de la ruta con mayor cantidad de metal recogido son: - (2.02691,\n" +
" * -69.37702) - (7.80982, -65.42437) - (-1.75753, -75.93686) - (0.93654,\n" +
" * -71.56523) - (5.1679, -68.86341) - (4.49119, -67.63724) - (7.46559,\n" +
" * -77.04132) - (5.14704, -78.46141) - (5.05173, -74.96543) - (1.573, -72.08537)\n" +
" * - (2.31236, -72.33536) - (2.92271, -72.38302) - (5.05097, -76.1704) -\n" +
" * (7.01966, -70.63856) - (2.54529, -73.41134) - (8.98738, -73.12421) -\n" +
" * (1.82856, -68.95705) - (-1.1964, -71.23951) La cantidad de metal total en la\n" +
" * ruta es: 82.092");
    }
}
