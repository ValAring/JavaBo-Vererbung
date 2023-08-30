package org.example;

import org.example.fahrzeug.Auto;
import org.example.fahrzeug.Fahrzeug;
import org.example.fahrzeug.Motorrad;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vererbung");

        Fahrzeug f1 = new Fahrzeug("Herbert", "Seifenkiste", 1955);
        System.out.println(f1.toString());

        Auto a1 = new Auto(4,3);
        a1.setAll("Mazda","MX-5",2000);
        System.out.println(a1.toString());

        Motorrad m1 = new Motorrad("Chopper");
        m1.setAll("Harley Davidson", "Iron 883", 2020);
        System.out.println(m1.toString());

    }
}