package Retos.Principal;

import java.util.Scanner;

import Retos.Salud.persona;

public class Empleado extends persona {

    Scanner leer = new Scanner(System.in);

    // Atributos
    private String cargo;
    private int valorhora;
    private int horastrabajadas;
    private String tipodoc;
    private String numerodoc;
    private String nombres;
    private String apellidos;
    private int totalapagar;

    // metodos
    /**
     * 
     */
    public void calcularHonorarios() {

        System.out.println("Ingrese su tipo de documento");
        tipodoc = leer.next();
        System.out.println("Ingrese su número de documento");
        numerodoc = leer.next();
        System.out.println("Ingrese su nombre completo");
        nombres = leer.next();
        System.out.println("Ingrese sus apellidos");
        apellidos = leer.next();
        System.out.println("Ingrese su cargo");
        cargo = leer.next();
        System.out.println("Ingrese cantidad de horas trabajadas");
        horastrabajadas = leer.nextInt();
        System.out.println("Ingrese el valor por hora");
        valorhora = leer.nextInt();
        double reteica = 0.966;

        totalapagar = (int) (horastrabajadas * valorhora - reteica);

        System.out.println(" Su tipo de documento es " + tipodoc + " Su número de identificacion es " + numerodoc
                + " Su nombre completo es " + nombres + " Sus apellidos son " + apellidos + " El cargo es " + cargo
                + " Las horas trabajadas son " + horastrabajadas + " El valor por hora es " + valorhora
                + " Y el total a pagar es " + totalapagar);
    }
}
