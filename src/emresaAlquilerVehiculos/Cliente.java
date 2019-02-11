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
public class Cliente {

    private String nif;
    private String nombre;
    private String apellidos;

    public Cliente(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public static void clienteAleatorio() {
        Random aleatorio = new Random();

        String[] nombre = {"Pepe", "Manolo ", "Maria ", "Ana", "Carol", "Rocio ", "Jesus ", "Diego"};
        String[] apellidos = {"Gomez", "Perez ", "hernander ", "Benitez", "Cazorla", "Molina ", "Santos ", "Gonzalez"};
        String[] apellidos2 = {"Gomez", "Perez ", "hernander ", "Benitez", "Cazorla", "Molina ", "Santos ", "Gonzalez"};

        String[] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        int m1 = aleatorio.nextInt(9);
        int m2 = aleatorio.nextInt(9);
        int m3 = aleatorio.nextInt(9);
        int m4 = aleatorio.nextInt(9);
        int m5 = aleatorio.nextInt(9);
        int m6 = aleatorio.nextInt(9);
        int m7 = aleatorio.nextInt(9);
        int m8 = aleatorio.nextInt(9);
        int m9 = aleatorio.nextInt(9);

        String numDni = m1 + "" + m2 + "" + m3 + "" + m4 + "" + m5 + "" + m6 + "" + m7 + "" + m8 + "" + m9;

        int letraAlea = aleatorio.nextInt(abecedario.length);

        String letra1 = abecedario[letraAlea];

        String dni = numDni + " " + letra1;

        int nomAlea = aleatorio.nextInt(nombre.length);
        int apell1Alea = aleatorio.nextInt(apellidos.length);
        int apell2Alea = aleatorio.nextInt(apellidos2.length);

        String cliente = "Dni cliente: " + dni + "\tNombre: " + nombre[nomAlea] + "\tApellidos: " + apellidos[apell1Alea] + " " + apellidos2[apell2Alea];

        System.out.println(cliente);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return nif + " \t" + apellidos + ",\t" + nombre;
    }
}
