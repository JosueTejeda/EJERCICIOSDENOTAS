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
 * Sergio Reyes 2000061
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
    public static void IngresodeDatos(){
        System.out.println("Ingresa Carne");
                    Carne= sc.nextInt();
                    System.out.println("Ingresa Nombre");
                    nombre = sc.next();
                    System.out.println("Ingresa Parcial Uno");
                    parcialUno = sc.nextDouble();
                    System.out.println("Ingresa Parcial Dos");
                    parcialDos = sc.nextDouble();
                    System.out.println("Ingresa Zona");
                    zona = sc.nextDouble();
                    System.out.println("Ingresa Examen Final");
                    examenFinal = sc.nextDouble();
                    
                    ListAlumnos.add(new Alumnos (Carne, nombre, parcialUno, parcialDos, zona, examenFinal));
                    
    }
  public static void CambiarDatos(){
      int cambio;
                    int indice =0;
                    System.out.println("Cual es el NO.Carne");
                    cambio = sc.nextInt();
                    for (Alumnos alumno: ListAlumnos) {
                        if(alumno.getCarne()== cambio){
                            int seleccionar;
                            System.out.println("Seleccione otra opcion");
                            System.out.println("Opcion 1, cambiar Nombre");
                            System.out.println("Opcion 2, cambiar Parcial Uno");
                            System.out.println("Opcion 3, cambiar Parcial Dos");
                            System.out.println("Opcion 4, cambiar zona");
                            System.out.println("Opcion 5, cambiar examenFinal");
                            seleccionar = sc.nextInt();
                            switch(seleccionar){
                                
                                case 1:
                                    System.out.println("Cambiar Nombre");
                                    nombre = sc.next();
                                    ListAlumnos.get(indice).setNombre(nombre);
                                    break;
                                case 2:
                                    System.out.println("Cambiar parcialUno");
                                    parcialUno = sc.nextDouble();
                                   ListAlumnos.get(indice).setParcialUno(parcialUno);
                                   ListAlumnos.get(indice).setTotal(alumno.getParcialUno()+ alumno.getParcialDos()+alumno.getZona()+ alumno.getExamenFinal());
                                    break;
                                case 3:
                                    System.out.println("Cambiar parcialDos");
                                    parcialDos = sc.nextDouble();
                                    ListAlumnos.get(indice).setParcialDos(parcialDos);
                                    ListAlumnos.get(indice).setTotal(alumno.getParcialUno()+alumno.getParcialDos()+alumno.getZona()+alumno.getExamenFinal());
                                    break;
                                case 4:
                                    System.out.println("Cambiar zona");
                                    zona = sc.nextDouble();
                                    ListAlumnos.get(indice).setZona(zona);
                                    ListAlumnos.get(indice).setTotal(alumno.getParcialUno()+alumno.getParcialDos()+alumno.getZona()+alumno.getExamenFinal());
                                    break;
                                case 5:
                                    System.out.println("Cambiar Examen final");
                                    examenFinal = sc.nextDouble();
                                    ListAlumnos.get(indice).setExamenFinal(examenFinal);
                                    ListAlumnos.get(indice).setTotal(alumno.getParcialUno()+alumno.getParcialDos()+alumno.getZona()+alumno.getExamenFinal());

                                    break;      
                            }
                        }
                        indice++;
                    }

  }
  
                        
}

    
        
