package UD2P2;

class Testigo {
    synchronized void pasarTestigo() {
        try {
            // Esperar para simular el tiempo que el atleta corre con el testigo
            Thread.sleep(100);
            //Comprobar si hay error y mostrar que se paro
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Interrupción en el paso del testigo");
        }
    }
}
