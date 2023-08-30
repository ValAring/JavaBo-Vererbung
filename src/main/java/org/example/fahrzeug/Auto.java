package org.example.fahrzeug;

public class Auto extends Fahrzeug {
    int anzahlRaeder;
    int anzahlTueren;

    public Auto(){}
    public Auto(int anzahlRaeder, int anzahlTueren){
        this.anzahlRaeder = anzahlRaeder;
        this.anzahlTueren = anzahlTueren;
    }

    public int getAnzahlRaeder() {
        return anzahlRaeder;
    }

    public void setAnzahlRaeder(int anzahlRaeder) {
        this.anzahlRaeder = anzahlRaeder;
    }

    public int getAnzahlTueren() {
        return anzahlTueren;
    }

    public void setAnzahlTueren(int anzahlTueren) {
        this.anzahlTueren = anzahlTueren;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", baujahr=" + baujahr +
                ", anzahlRaeder=" + anzahlRaeder +
                ", anzahlTueren=" + anzahlTueren +
                '}';
    }
}
