package org.example.fahrzeug;

public class Motorrad extends Fahrzeug{
    String mType;

    public Motorrad(){}
    public Motorrad(String motorradTyp){
        this.mType = motorradTyp;
    }

    @Override
    public String toString() {
        return "Motorrad{" +
                "hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", mType='" + mType + '\'' +
                ", baujahr=" + baujahr +
                '}';
    }
}
