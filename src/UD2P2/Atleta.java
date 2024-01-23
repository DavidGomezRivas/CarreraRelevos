package UD2P2;

class Atleta implements Runnable {
    private Testigo testigo;
    private int numeroAtleta;
    private String nombreEquipo;
    //Crear cada atleta
    public Atleta(Testigo testigo, int numeroAtleta, String nombreEquipo) {
        this.testigo = testigo;
        this.numeroAtleta = numeroAtleta;
        this.nombreEquipo = nombreEquipo;
    }
    //Hacer que cada atleta pase el testigo y corra e indicar que atleta de que equipo esta corriendo
    @Override
    public void run() {
        testigo.pasarTestigo();
        System.out.println("Atleta " + numeroAtleta + " del " + nombreEquipo + " está corriendo");
    }
}

