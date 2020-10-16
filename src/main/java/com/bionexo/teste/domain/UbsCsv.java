package com.bionexo.teste.domain;

import java.math.BigInteger;

public class UbsCsv {

    private BigInteger id;
    private Double vlr_latitude;
    private Double vlr_longitude;
    private String nom_estab;

    public BigInteger getId() {
        return id;
    }

    public Double getVlr_latitude() {
        return vlr_latitude;
    }

    public Double getVlr_longitude() {
        return vlr_longitude;
    }

    public String getNom_estab() {
        return nom_estab;
    }
}
