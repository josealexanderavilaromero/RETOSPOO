package Retos.Salud;

import java.util.Scanner;

public class persona {
    //atributos
    private String tipoDoc;
    private String documento;
    private String nombre;
    private String apellido;
    private int peso;
    private int estatura;
    private int edad;
    private String sexo;
    private double pesoActual;
// metodos

    //constructores 
    public persona(){

    }
    
    public persona(String tipoDoc, String documento, String nombre, String apellido, int peso, int estatura, int edad,
            String sexo, double pesoActual) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
        this.pesoActual = pesoActual;
    }
    
    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }
    
    public void pedirDatos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tipo de documento");
        tipoDoc = leer.nextLine();
        System.out.println("ingrese el numero");
        documento = leer.nextLine();
        System.out.println("ingrese su nombre");
        nombre = leer.nextLine();
        System.out.println("ingrese su apellido");
        apellido = leer.nextLine();
        System.out.println("ingrese su peso en kilogramos");
        peso = leer.nextInt();
        System.out.println("ingrese su estatura");
        estatura = leer.nextInt();
        System.out.println("ingrese su edad");
        edad = leer.nextInt();
        System.out.println("ingrese su sexo");
        sexo = leer.next();

        leer.close();
    }

    public void mostrarPersona() {
        System.out.println("su tipo de de documento es \n" + tipoDoc + " con el numero \n " + documento + " \n "
                + nombre + " \n " + apellido + "\n" + peso + " \n " + estatura + " \n " + edad + " \n " + sexo);
    }

    public void calcularlmc() {

        pesoActual = peso / estatura;
        Math.pow(estatura, 2);

        if (peso < 20) {
            System.out.println("peso bajo");

        } else if (peso > 20 && peso < 25) {
            System.out.println("peso ideal");

        } else if (peso > 25) {

            System.out.println("sobrepeso");
        }

    }

    public void mayorEdad() {
        
        if (edad<18){
            System.out.println("menor de edad");
        }

        else if (edad>=18){
            System.out.println("mayor de edad");
        }
    }


    

}
