package com.iesam.herencia.domain.models;

public class Campera extends Pizza{
    private boolean carne;

    public boolean isCarne() {
        return carne;
    }

    public void setCarne(boolean carne) {
        this.carne = carne;
    }
}
