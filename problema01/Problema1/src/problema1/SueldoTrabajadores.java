/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

import java.util.Date;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class SueldoTrabajadores {
    private String cedula;
    private String nombre;
    private String correo;
    private double sueldo;
    private int mesSueldo;
    public SueldoTrabajadores(String c, String n, String co, double sue, int mesS){
        cedula=c;
        nombre=n;
        correo=co;
        sueldo=sue;
        mesSueldo=mesS;
        
    }
    public SueldoTrabajadores(){
        
    }

    public void establecerCedula(String cedula) {
        this.cedula = cedula;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerCorreo(String correo) {
        this.correo = correo;
    }

    public void establecerSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void establecerMesSueldo(int mesSueldo) {
        this.mesSueldo = mesSueldo;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public int obtenerMesSueldo() {
        return mesSueldo;
    }

    @Override
    public String toString() {
        String cadena= String.format("Cedula:%s\n"
                + "Nombre:%s\n"
                + "Correo:%s\n"
                + "Sueldo:%.2f\n"
                + "Mes sueldo:%d\n", 
                obtenerCedula(),
                obtenerNombre(),
                obtenerCorreo(),
                obtenerSueldo(),
                obtenerMesSueldo()
                );
        return cadena;
    }

   
    
    
    
    
    
            
}
