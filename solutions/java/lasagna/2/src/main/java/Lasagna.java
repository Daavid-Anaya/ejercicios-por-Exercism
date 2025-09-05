public class Lasagna {
    
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutosCocinando) {
        int tiempoEsperado = expectedMinutesInOven();
        return tiempoEsperado - minutosCocinando;
    }
    
    public int preparationTimeInMinutes(int capas) {
        return 2 * capas;
    }

    public int totalTimeInMinutes(int capas, int tiempoEnHorno) {
        int tiempoPreparacion = preparationTimeInMinutes(capas);
        return tiempoPreparacion + tiempoEnHorno; 
    }
}