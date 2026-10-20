package org.example;

public class EroeNonIdoneoException extends Exception {
    private String nomeEroe;
    private int livelloPotere;

    public EroeNonIdoneoException(String nomeEroe, int livelloPotere) {
        super("L'eroe non è abbastanza forte!");
        this.nomeEroe = nomeEroe;
        this.livelloPotere = livelloPotere;
    }

    public String getNomeEroe() {
        return nomeEroe;
    }

    public int getLivelloPotere() {
        return livelloPotere;
    }
}