package UD2P2;

public class CarreraDeRelevos {
	public static void main(String[] args) {
		//Crear testigo de cada equipo
        Testigo testigoEquipo1 = new Testigo();
        Testigo testigoEquipo2 = new Testigo();
        Testigo testigoEquipo3 = new Testigo();
        Testigo testigoEquipo4 = new Testigo();

        //Crear cada equipo y asignar testigo correspodiente
        Equipo equipo1 = new Equipo("Equipo 1", testigoEquipo1);
        Equipo equipo2 = new Equipo("Equipo 2", testigoEquipo2);
        Equipo equipo3 = new Equipo("Equipo 3", testigoEquipo3);
        Equipo equipo4 = new Equipo("Equipo 4", testigoEquipo4);

        // Empezar hilo de cada equipo
        equipo1.start();
        equipo2.start();
        equipo3.start();
        equipo4.start();
    }
}
