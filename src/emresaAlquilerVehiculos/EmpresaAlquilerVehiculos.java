package emresaAlquilerVehiculos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salva
 */
public class EmpresaAlquilerVehiculos {

    // Atributos de la empresa
    private String cif;
    private String nombre;
    private String paginaWeb;

    /* Atributos para controlar el total de clientes que tiene la
    empresa y array de almacenamiento para los objetos Cliente */
    private int totalClientes;
    private Cliente[] clientes;

    /* Atributos para controlar el total de vehiculos disponibles en
    alquiler que tiene la empresa y array de almacenamiento para los objetos
    Vehiculo */
    private int totalVehiculos;
    private Vehiculo[] vehiculos;

    /* Atributos para controlar el hist�rico de alquileres: total de
    alquileres realizados y array de almacenamiento para los objetos
    vehiculoAlquilado*/
    private int totalAlquileres;
    private VehiculoAlquilado[] alquileres;

    public EmpresaAlquilerVehiculos(String cif, String nombre, String paginaWeb) {
        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        this.totalClientes = 0;

        //no hay clientes creados
        this.clientes = new Cliente[50]; //apunta a null
        this.totalVehiculos = 0;
        this.vehiculos = new Vehiculo[50]; //apunta a null
        this.totalAlquileres = 0;
        this.alquileres = new VehiculoAlquilado[100]; //apunta a null

    }
    
     public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }

    public VehiculoAlquilado[] getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(VehiculoAlquilado[] alquileres) {
        this.alquileres = alquileres;
    }

    //A�ade un nuevo cliente a la lista de
//clientes de la empresa. El m�todo registrarCliente(Cliente cliente)
//almacena un objeto de la clase Cliente en la �ltima posici�n �til del array
//clientes, dada por la variable totalClientes y a continuaci�n incrementa
//la variable totalClientes.
    public void registrarCliente(Cliente nuevo) {
        this.clientes[this.totalClientes] = nuevo;
        this.totalClientes++;
    }

//A�ade un veh�culo al cat�logo
//de veh�culos de la empresa. El m�todo registrarVehiculo(Vehiculo vehiculo)
//almacena un objeto de la clase Vehiculo en la �ltima posici�n del array
//vehiculos, dada por la variable totalVehiculos y a continuaci�n incrementa
//la variable totalVehiculos.
    public void registrarVehiculo(Vehiculo nuevo) {
        this.vehiculos[this.totalVehiculos] = nuevo;
        this.totalVehiculos++;

    }
}
