/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Calificaciones {
    private String nombre;
    private String apellido;
    private double ca1;
    private double ca2;
    private double ca3;
    private double promedio;
    
    public Calificaciones(String n, String a, double c1, double c2, double c3){
        apellido=a;
        nombre=n;
        ca1=c1;
        ca2=c2;
        ca3=c3;
        
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerCa1(double ca1) {
        this.ca1 = ca1;
    }

    public void establecerCa2(double ca2) {
        this.ca2 = ca2;
    }

    public void establecerCa3(double ca3) {
        this.ca3 = ca3;
    }
    public void calcularPromedio(){
        promedio=(ca1+ca2+ca3)/3;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerCa1() {
        return ca1;
    }

    public double obtenerCa2() {
        return ca2;
    }

    public double obtenerCa3() {
        return ca3;
    }

    public double obtenerPromedio() {
        return promedio;
    }
     @Override
   public String toString() {
        String reporte = String.format("%s%s\n"
                + "  Calificaciones:\n"
                + "  %.2f\n"
                + "  %.2f\n"
                + "  %.2f\n"
                + "  Promedio: %.2f\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerCa1(),
                obtenerCa2(),
                obtenerCa3(),
                obtenerPromedio());
        return reporte;
    }
    
    
}
