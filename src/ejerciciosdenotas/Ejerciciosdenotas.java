/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdenotas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Josué Tejeda
 */
public class Ejerciciosdenotas {
    public static  int Carne; 
public static  String nombre;
public static  double parcialUno;
public static  double parcialDos;
public static  double zona;
public static  double examenFinal;
public static  double total;  
 public static   List<Alumnos> ListAlumnos = new ArrayList();
public static  Scanner sc = new Scanner (System.in);
 
    public static void main(String[] args) {
        
        
        
        int opcion;
       
        do{
            
            System.out.println("Menu");
            
            System.out.println("Opcion 1 = Agregar Alumno");
            System.out.println("Opcion 2 = Ver datos");
            System.out.println("Opcion 3 = Cambiar datos");
            System.out.println("Opcion 4 = Salir");
           
            opcion = sc.nextInt();

    }
