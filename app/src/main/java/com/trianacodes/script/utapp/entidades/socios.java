package com.trianacodes.script.utapp.entidades;

import java.sql.Blob;
import java.sql.Date;

public class socios {

    private Blob foto;
    private int numero;
    private String nombre, apellidos, nif, profesion, causaAlta, causaBaja, cargo;
    private Date fechaNacimiento, fechaAlta, fechaBaja, fechaTomaPosesion, fechaCese;

    public socios(Blob foto, int numero, String nombre, String apellidos, String nif,
                  String profesion, String causaAlta, String causaBaja, String cargo,
                  Date fechaNacimiento, Date fechaAlta, Date fechaBaja, Date fechaTomaPosesion,
                  Date fechaCese) {
        this.foto = foto;
        this.numero = numero;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.profesion = profesion;
        this.causaAlta = causaAlta;
        this.causaBaja = causaBaja;
        this.cargo = cargo;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.fechaTomaPosesion = fechaTomaPosesion;
        this.fechaCese = fechaCese;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCausaAlta() {
        return causaAlta;
    }

    public void setCausaAlta(String causaAlta) {
        this.causaAlta = causaAlta;
    }

    public String getCausaBaja() {
        return causaBaja;
    }

    public void setCausaBaja(String causaBaja) {
        this.causaBaja = causaBaja;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Date getFechaTomaPosesion() {
        return fechaTomaPosesion;
    }

    public void setFechaTomaPosesion(Date fechaTomaPosesion) {
        this.fechaTomaPosesion = fechaTomaPosesion;
    }

    public Date getFechaCese() {
        return fechaCese;
    }

    public void setFechaCese(Date fechaCese) {
        this.fechaCese = fechaCese;
    }

}
