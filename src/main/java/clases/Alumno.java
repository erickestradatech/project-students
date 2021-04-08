package clases;

public class Alumno {

    private int coda;
    private String nom;
    private int p1;
    private int p2;
    static int cuenta = 100;

    public Alumno(String nom, int p1, int p2) {
        this.coda = cuenta++;
        this.nom = nom;
        this.p1 = p1;
        this.p2 = p2;
    }

    //alt+insert
    public double prom() {

        return (p1 + p2) / 2;
    }

    public String obser() {

        return prom() > 12 ? "Aprovador" : "Desaprobado";
    }

    public int getCoda() {
        return coda;
    }

    public void setCoda(int coda) {
        this.coda = coda;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

}
