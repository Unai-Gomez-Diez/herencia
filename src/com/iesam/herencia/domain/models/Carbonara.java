package com.iesam.herencia.domain.models;

public class Carbonara extends Pizza{
    private boolean queso_azul;
    private boolean queso_cabra;

    public boolean getQueso_azul() {
        return queso_azul;
    }

    public void setQueso_azul(boolean queso_azul) {
        this.queso_azul = queso_azul;
    }

    public boolean getQueso_cabra() {
        return queso_cabra;
    }

    public void setQueso_cabra(boolean queso_cabra) {
        this.queso_cabra = queso_cabra;
    }


}
