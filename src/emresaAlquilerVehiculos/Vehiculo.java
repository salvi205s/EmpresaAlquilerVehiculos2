/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emresaAlquilerVehiculos;

import java.util.Random;

/**
 *
 * @author Salva
 */
public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    public static void cocheAleatorio() {
        Random aleatorio = new Random();

        String[] marca = {"Seat Ibiza", "Ford Fiesta", "Fiat Punto", "Opel Corsa", "Seat Altea", "Kia Ceed", "Kia Picanto", "Ford Focus"};
        String[] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] color = {"Rojo", "Azul", "Verde", "Amarillo", "verde"};

        int m1 = aleatorio.nextInt(9);
        int m2 = aleatorio.nextInt(9);
        int m3 = aleatorio.nextInt(9);
        int m4 = aleatorio.nextInt(9);

        String Matricula = m1 + "" + m2 + "" + m3 + "" + m4;

//            int letra1= aleatorio.nextInt(abecedario.length);
//            int letra2= aleatorio.nextInt(abecedario.length);
//            int letra3= aleatorio.nextInt(abecedario.length);
        String letras = abecedario[aleatorio.nextInt(abecedario.length)] + "" + abecedario[aleatorio.nextInt(abecedario.length)] + "" + abecedario[aleatorio.nextInt(abecedario.length)];

        String matricula = Matricula + " " + letras;

        int marcAlea = aleatorio.nextInt(marca.length);
        int colorAlea = aleatorio.nextInt(color.length);

//            System.out.println("Matricula: "+matricula+"\tMarca: "+marca[marcAlea]+"\tColor: "+color[colorAlea]);
        String coche = "Matricula: " + matricula + "\tMarca: " + marca[marcAlea] + "\tColor: " + color[colorAlea];
        System.out.println(coche);

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return matricula + "\t" + marca + " " + modelo + "\t" + color + "\t" + tarifa + "\t" + disponible;
    }

}
