package com.iesam.herencia.presentacion;

import com.iesam.herencia.domain.models.Barbacoa;
import com.iesam.herencia.domain.models.Campera;
import com.iesam.herencia.domain.models.Carbonara;
import com.iesam.herencia.domain.models.Horno;

public class Main {
    public static void main(String[] args) {
        Barbacoa barbacoa = new Barbacoa();
        barbacoa.setId("1");
        barbacoa.setNombre("Barbacoa");
        barbacoa.setSalsa("Barbacoa");
        barbacoa.setExtras("Mucha carne");
        barbacoa.setPicante(true);

        Campera campera = new Campera();
        campera.setId("1");
        campera.setNombre("Campera");
        campera.setSalsa("Campera");
        campera.setExtras("Mucha carne");
        campera.setCarne(true);

        Carbonara carbonara = new Carbonara();
        carbonara.setId("1");
        carbonara.setNombre("Carbonara");
        carbonara.setSalsa("Carbonara");
        carbonara.setExtras("Mucha carne");
        carbonara.setQueso_azul(true);
        carbonara.setQueso_cabra(true);

        Horno horno1 = new Horno();
        horno1.setId("1");
        horno1.setNombre("Horno Mixto");
        horno1.setMarca("Hornos horneados");
        horno1.setTemperatura(350);
        horno1.getPizzaCampera(campera);
        horno1.getPizzaBarbacoa(barbacoa);
        horno1.getPizzaCarbonara(carbonara);

        Horno horno2 = new Horno();
        horno2.setId("1");
        horno2.setNombre("Horno Barbacoa");
        horno2.setMarca("Hornos horneados");
        horno2.setTemperatura(350);
        horno2.getPizzaBarbacoa(barbacoa);

        Horno horno3 = new Horno();
        horno3.setId("1");
        horno3.setNombre("Horno Campera");
        horno3.setMarca("Hornos horneados");
        horno3.setTemperatura(350);
        horno3.getPizzaCampera(campera);

        Horno horno4 = new Horno();
        horno4.setId("1");
        horno4.setNombre("Horno Carbonara");
        horno4.setMarca("Hornos horneados");
        horno4.setTemperatura(350);
        horno4.getPizzaCarbonara(carbonara);
    }

}