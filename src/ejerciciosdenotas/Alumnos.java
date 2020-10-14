/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdenotas;

/**
 *
 * @author Josué Tejeda
 */
public class Alumnos {
   int Carne;
    String nombre;
    double parcialUno;
    double parcialDos;
    double zona;
    double examenFinal;
    double total;

    public Alumnos() {
    }

    public Alumnos(int Carne, String nombre, double parcialUno, double parcialDos, double zona, double examenFinal) {
        this.Carne = Carne;
        this.nombre = nombre;
        this.parcialUno = parcialUno;
        this.parcialDos = parcialDos;
        this.zona = zona;
        this.examenFinal = examenFinal;
        this.total = parcialUno + parcialDos + zona + examenFinal;
    }

    public int getCarne() {
        return Carne;
    }

    public void setCarne(int Carne) {
        this.Carne = Carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getParcialUno() {
        return parcialUno;
    }

    public void setParcialUno(double parcialUno) {
        this.parcialUno = parcialUno;
    }

    public double getParcialDos() {
        return parcialDos;
    }

    public void setParcialDos(double parcialDos) {
        this.parcialDos = parcialDos;
    }

    public double getZona() {
        return zona;
    }

    public void setZona(double zona) {
        this.zona = zona;
    }

    public double getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(double examenFinal) {
        this.examenFinal = examenFinal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    } 
}
