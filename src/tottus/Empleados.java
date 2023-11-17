package tottus;

import java.util.*;
import GUI.AñadirEmp;
public class Empleados {

    private String nombre;
    private String apellido;
    private String codigo;
    private String contraseña;
    private String puesto;

    private static ArrayList<Empleados> listaEmpleados = new ArrayList<>();

    public Empleados(String nombre, String apellido, String codigo, String contraseña, String puesto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.contraseña = contraseña;
        this.puesto = puesto;

        listaEmpleados.add(this);
    }
    public Empleados(String nombre) {
        this.nombre = nombre;
        
    }

    public static void InicioListaEmpleados() {
        Empleados jefe1 = new Empleados("Alejandro", "Mendoza", "123456", "POOI-2023", "Jefe");
        Empleados cajero1 = new Empleados("Luis", "Angel", "654321", "POOI-USIL1", "Cajero");
        Empleados cajero2 = new Empleados("Miguel", "Miranda", "654312", "POOI-USIL2", "Cajero");
        Empleados cajero3 = new Empleados("Ronald", "Guerrero", "654123", "POOI-USIL3", "Cajero");
        Empleados cajero4 = new Empleados("Oliver", "Gutierrez", "614325", "POOI-USIL4", "Cajero");
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

    public String getCodigo() {
        
        return codigo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getPuesto() {
        return puesto;
    }

    public static ArrayList<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }

    public static Empleados buscarEmpleadoPorCodigo(String codigo) {
        for (Empleados empleado : listaEmpleados) {
            if (empleado.getCodigo().equals(codigo)) {
                return empleado;
            }
        }
        return null;
    }
   

    public static Empleados Login(String codigo, String contraseña) {
        
        for (Empleados empleado : listaEmpleados) {
            if (empleado.getCodigo().equals(codigo) && empleado.getContraseña().equals(contraseña)) {
                
                return empleado;
            }
        }
        return null;
    }

    public static void agregarNuevoEmpleado(String nombre, String apellido, String código, String contraseña, String confirmar, String puesto) {
        boolean codigoExiste;
        int c=0;
        boolean error=true;
        do {
            codigoExiste = false;
            
            
            for (Empleados empleado : listaEmpleados) {
                if (empleado.getCodigo().equals(código)) {
                    codigoExiste = true;
                    c++;
                    if(c >= listaEmpleados.size()){
                    codigoExiste = false;
                    error = false;
                    }
                }
            }
        } while (codigoExiste);
        if(error){
        Empleados nuevoEmpleado = new Empleados(nombre, apellido, código, contraseña, puesto);
        System.out.println("Empleado añadido con exito");
        }else{
        System.out.println("El código existe");
        
        }
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nCódigo: " + codigo + "\nPuesto: " + puesto + "\n";
    }
}
