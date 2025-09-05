public class Lasagna {
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutosCocinando) {
        int tiempoEsperado = expectedMinutesInOven();
        return tiempoEsperado - minutosCocinando;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int capas) {
        return 2 * capas;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int capas, int tiempoEnHorno) {
        int tiempoPreparacion = preparationTimeInMinutes(capas);
        return tiempoPreparacion + tiempoEnHorno; 
    }
}