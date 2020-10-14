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
 *Bryner Bonilla 2000233
 * @author Josué Tejeda 2000256
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
            switch(opcion){
                case 1:
                    IngresodeDatos();
                    break;
                    
                case 2:
                   MostrarDatos();
                    break;
                case 3:
                    CambiarDatos();
                    break; 
            }
        }while(opcion !=4);
       
    }
    public static void MostrarDatos(){
        System.out.println("Los datos son");
                    System.out.println("Numero de alumnos \t NO.Alumno \t NO.Carne \t ParcialUno \t ParcialDos \t zona \t Examen Final \t Total");
                    int posicion = 0;
                    for (Alumnos alumno : ListAlumnos) {
                        System.out.println(posicion+"\t"+alumno.Carne+"\t"+alumno.parcialUno+"\t"+alumno.parcialDos+"\t"+alumno.zona+"\t"+alumno.examenFinal+"\t"+alumno.total);
                        posicion++;
                    }
        
    }

    }
        
