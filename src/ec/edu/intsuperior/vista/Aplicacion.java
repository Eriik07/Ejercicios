/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author Eriik
 */
public class Aplicacion {
     public static void main(String[] args) {
    
    }
       public static void añobisiesto(){
          Scanner sc = new Scanner(System.in);
        int año;
        System.out.println("Introduzca año: ");
        año = sc.nextInt();
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            System.out.println("Es un año bisiesto");
            
        } else {
            System.out.println("No es un año bisiesto");
   
        }
            
        }
        public static void CalculadoraIMC(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su peso en kilogramos:");
        int peso = leer.nextInt();
        System.out.println("Ingrese su altura en metros:");
        int altura = leer.nextInt();
        int imc = peso / (altura * altura);
        System.out.println("Su IMC es" + imc);
    }    
         public static void nombreYsueldodeEmpleado(){
   
        Scanner leer = new Scanner(System.in);
  
        
        String[] empleados = new String[4];
        double[] sueldos = new double[4];
        
        String nombreMayor;
        double mayorSueldo;

        int i = 0;

        
        System.out.println("Lectura de nombres y sueldos de empleados: ");                                        
        System.out.print("Empleado " + (i + 1) + ": ");
        empleados[i] = leer.nextLine();
        System.out.print("Sueldo: ");
        sueldos[i] = leer.nextDouble();

        
        mayorSueldo = sueldos[i];
        nombreMayor = empleados[i];

        
        for (i = 1; i < empleados.length; i++) {
            leer.nextLine(); 
            System.out.print("Empleado " + (i + 1) + ": ");
            empleados[i] = leer.nextLine();
            System.out.print("Sueldo: ");
            sueldos[i] = leer.nextDouble();
            
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                nombreMayor = empleados[i];
            }
        }

      
        System.out.println("Empleado con mayor sueldo: " + nombreMayor );                                         
        System.out.println("Sueldo: " + mayorSueldo);
    }
         public static void verificarNumeroCapicúa(){
        int N, aux, inverso = 0, cifra;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("Introduce un numero >= 10: ");
            N = leer.nextInt();
        } while (N < 10);
        aux = N;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
        if(N == inverso){
            System.out.println("Es capicúa");
        }else{
            System.out.println("No es capicúa");
        }
    }
          public static void millasAkilometros(){
        Scanner leer = new Scanner(System.in);
        int millas;
        double km;
        System.out.println("Convertir millas a kilometros");
        do{
            System.out.println("Introduce millas (0 para finalizar: ");
            millas = leer.nextInt();
            
            if(millas !=0){
                km = millas * 1.6093;
                System.out.printf("%d millas equivalen a %.2f km %n", millas, km);
            }
        }while (millas != 0);
        
    }
    
}
