package tottus;

import java.util.*;

public class Clientes {

    private String nombre;
    private String apellido;
    private String dni;
    private String teléfono;
    private String tarjeta;
    private double saldo;
    private boolean afiliado;
    private int puntosacumulados;
    private static ArrayList<Clientes> listaClientes = new ArrayList<>();

    public Clientes(String nombre, String apellido, String dni, String teléfono, String tarjeta, double saldo, int puntosacumulados, boolean afiliado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.teléfono = teléfono;
        this.tarjeta = tarjeta;
        this.saldo = saldo;
        this.puntosacumulados = puntosacumulados;
        this.afiliado = afiliado;
        listaClientes.add(this);
    }

    public static void InicioListaClientes() {
        Clientes cliente1 = new Clientes("José", "Miranda", "77777701", "999999901", "111111", 1538.65, 121, true);
        Clientes cliente2 = new Clientes("María", "López", "77777702", "999999902", "222222", 2000.0, 85, true);
        Clientes cliente3 = new Clientes("Juan", "Gómez", "77777703", "999999903", "333333", 800.50, 0, false);
        Clientes cliente4 = new Clientes("Laura", "Perez", "77777704", "999999904", "444444", 500.75, 50, true);
        Clientes cliente5 = new Clientes("Carlos", "Rodríguez", "77777705", "999999905", "555555", 1234.30, 0, false);
        Clientes cliente6 = new Clientes("Ana", "García", "77777706", "999999906", "666666", 300.25, 70, true);
        Clientes cliente7 = new Clientes("Pedro", "Sánchez", "77777707", "999999907", "777777", 750.60, 150, true);
        Clientes cliente8 = new Clientes("Sofía", "Martínez", "77777708", "999999908", "888888", 900.15, 0, false);
        Clientes cliente9 = new Clientes("Miguel", "Torres", "77777709", "999999909", "999999", 600.75, 180, true);
        Clientes cliente10 = new Clientes("Isabel", "Ortiz", "77777710", "999999910", "000000", 1000.50, 200, true);
        Clientes cliente11 = new Clientes("Luis", "Ramírez", "77777711", "999999911", "123456", 450.25, 75, true);
        Clientes cliente12 = new Clientes("Elena", "Cruz", "77777712", "999999912", "234567", 300.40, 0, false);
        Clientes cliente13 = new Clientes("Javier", "Hernández", "77777713", "999999913", "345678", 1800.90, 230, true);
        Clientes cliente14 = new Clientes("Carmen", "Díaz", "77777714", "999999914", "456789", 700.75, 190, true);
        Clientes cliente15 = new Clientes("Alberto", "Gutiérrez", "77777715", "999999915", "567890", 950.20, 55, true);
        Clientes cliente16 = new Clientes("Raquel", "Vargas", "77777716", "999999916", "678901", 1200.30, 95, true);
        Clientes cliente17 = new Clientes("Fernando", "Lara", "77777717", "999999917", "789012", 300.10, 0, false);
        Clientes cliente18 = new Clientes("Marta", "Flores", "77777718", "999999918", "890123", 1600.70, 210, true);
        Clientes cliente19 = new Clientes("Manuel", "Santos", "77777719", "999999919", "901234", 750.45, 100, true);
        Clientes cliente20 = new Clientes("Patricia", "González", "77777720", "999999920", "012345", 1100.80, 0, false);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    public String getTarjeta() {
        return tarjeta;
    }

    public boolean isAfiliado() {
        return afiliado;
    }

    public int getPuntosAcumulados() {
        return puntosacumulados;
    }

    public void setPuntosAcumulados(int puntosacumulados) {
        this.puntosacumulados = puntosacumulados;

    }

    public static ArrayList<Clientes> getListaClientes() {
        return listaClientes;
    }

    public static Clientes buscarClientePorTarjeta(String tarjeta) {
        for (Clientes cliente : listaClientes) {
            if (cliente.getTarjeta().equals(tarjeta)) {
                return cliente;
            }
        }
        return null;
    }

}
