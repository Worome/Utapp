package com.trianacodes.script.utapp.entidades;

import java.util.Date;

public class caja {

    private Date fecha;
    private String concepto;
    private Double entrada, salida, saldo;

    public caja(Date fecha, String concepto, Double entrada, Double salida, Double saldo) {
        this.fecha = fecha;
        this.concepto = concepto;
        this.entrada = entrada;
        this.salida = salida;
        this.saldo = saldo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Double getEntrada() {
        return entrada;
    }

    public void setEntrada(Double entrada) {
        this.entrada = entrada;
    }

    public Double getSalida() {
        return salida;
    }

    public void setSalida(Double salida) {
        this.salida = salida;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
