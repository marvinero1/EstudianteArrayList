/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Estudiante.Estudiante;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Marvinero
 */
public class main {

    public static void main (String[] args){
       Scanner teclado = new Scanner(System.in);
       Estudiante estudiante = new Estudiante("","", 0);
       Estudiante e[] = new Estudiante[2];      
        for(int i = 0; i< e.length; i++){
            System.out.println("Ingrese nombre Estudiante:" +i+ ": ");
            estudiante.setNombre(teclado.next());
            System.out.println("Ingrese su sexo: " +i+ ":");
            estudiante.setSexo(teclado.next());
            System.out.println("Ingrese su nota: ");
            estudiante.setNota(teclado.nextInt());
            estudiante.Calificacion();                 
        }
        for (Estudiante e1 : e) {
            System.out.println("nombre: " + estudiante.getNombre() + "sexo: " + estudiante.getSexo() + "nota: " + estudiante.getNota());
            System.out.println("************************");
        }     
   }  
}
