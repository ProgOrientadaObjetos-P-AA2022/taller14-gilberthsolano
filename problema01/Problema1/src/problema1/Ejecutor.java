/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Enlace e= new Enlace();
        Scanner entrada= new Scanner(System.in);
        String cedula, correo, nombre;
        double sueldo;
        int mesSueldo;
        
        int op;
      
        do {            
            System.out.println("Ingrese cedula del trabajador");
            cedula=entrada.nextLine();
            System.out.println("Ingrese nombre del trabajador");
            nombre=entrada.nextLine();
            System.out.println("Ingrese correo del trabajador");
            correo=entrada.nextLine();
            System.out.println("Ingrese sueldo");
            sueldo=Double.parseDouble(entrada.nextLine());
            System.out.println("Ingrese el mes de sueldo");
            mesSueldo=Integer.parseInt(entrada.nextLine());
            SueldoTrabajadores st = new SueldoTrabajadores(cedula, nombre, correo, sueldo, mesSueldo);
            e.insertarSueldoTrabajadores(st);
            
            
            System.out.println("Ingrese 0 para salir");
            op=Integer.parseInt(entrada.nextLine());
            
        } while (op!=0);
        
        
        
    }
    
}
