package com.iesam.herencia.domain.models;

public class Pizza {
        private String id;
        private String nombre;
        protected String salsa;
        protected String extras;

    public String getId(String id) {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre(String nombre) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }
}
