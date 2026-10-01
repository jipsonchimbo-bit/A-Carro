package ec.edu.espoch.carro;

import ec.edu.espoch.carro.enumeracion.CarType;
import ec.edu.espoch.carro.enumeracion.Color;
import ec.edu.espoch.carro.enumeracion.FuilType;

public class Carro {

    public static void main(String[] args) {
        Carrito[] automobile;
        automobile = new Carrito[2];

        automobile[0] = new Carrito("Toyota", 2024, "Motor Gasolina", FuilType.GASOLINE, CarType.SUBCOMPACT, 2, 99, 70, Color.BLACK, 100);
        automobile[1] = new Carrito("Izusu", 2025, "Motor Diesel", FuilType.DIESEL, CarType.CITY, 4, 100, 80, Color.BLACK, 100);

        for (int i = 0; i < automobile.length; i++) {
            System.out.println(" Carro " + (i + 1));
            automobile[i].Imprimir();
        }
    }
}
