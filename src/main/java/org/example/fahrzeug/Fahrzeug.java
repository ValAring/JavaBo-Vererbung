package org.example.fahrzeug;

public class Fahrzeug {
    protected String hersteller;
    protected String modell;
    protected int baujahr;

    public Fahrzeug(){}
    public Fahrzeug(String hersteller, String modell, int baujahr){
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
    }
    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }
    public void setAll(String hersteller,String modell,int baujahr){
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", baujahr=" + baujahr +
                '}';
    }
}
