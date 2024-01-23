package UD2P2;

class Equipo extends Thread {
    private Atleta[] atletas = new Atleta[4];
    private String nombreEquipo;
    private Testigo testigo;

    public Equipo(String nombreEquipo, Testigo testigo) {
        this.nombreEquipo = nombreEquipo;
        //Asignar testigo
        this.setTestigo(testigo);
        //Recorrer array de atletas
        for (int i = 0; i < atletas.length; i++) {
            atletas[i] = new Atleta(testigo, i + 1, nombreEquipo);
        }
    }
    //Recorrer todos los atletas e indicar que el equipo termino
    @Override
    public void run() {
        for (Atleta atleta : atletas) {
            atleta.run();
        }
        System.out.println(nombreEquipo + " ha terminado la carrera");
    }
    //Getters y Setters
	public Testigo getTestigo() {
		return testigo;
	}
	public void setTestigo(Testigo testigo) {
		this.testigo = testigo;
	}
}
