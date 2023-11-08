package tottus;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Jefe jefe = new Jefe();
        Cajero cajero = new Cajero();
        int opcion;
        boolean login = false;
        boolean permiso = false;
        Scanner s = new Scanner(System.in);

        Empleados.InicioListaEmpleados();
        Clientes.InicioListaClientes();
        Productos.InicioListaProductos();

        System.out.println("1 Buscar Datos por código");
        System.out.println("2 Iniciar Cuenta");
        System.out.print("Respuesta: \t");
        opcion = s.nextInt();
        s.nextLine();
        switch (opcion) {
            case 1: {
                System.out.println("Ingrese el código del empleado: ");
                String codigoBuscado = s.nextLine();
                Empleados empleadoEncontrado = Empleados.buscarEmpleadoPorCodigo(codigoBuscado);

                if (empleadoEncontrado != null) {
                    System.out.println("Empleado encontrado:");
                    System.out.println(empleadoEncontrado);
                } else {
                    System.out.println("Empleado no encontrado.");
                }
                break;
            }
            case 2: {
                System.out.println("Ingrese el código: ");
                String codigoIngresado = s.nextLine();
                System.out.println("Ingrese la contraseña: ");
                String contraseñaIngresada = s.nextLine();
                Empleados empleadoEncontrado = Empleados.Login(codigoIngresado, contraseñaIngresada);

                if (empleadoEncontrado != null && empleadoEncontrado.getContraseña().equals(contraseñaIngresada)) {
                    System.out.println("Bienvenido ");
                    System.out.println(empleadoEncontrado.getNombre() + " " + empleadoEncontrado.getApellido());
                    login = true;
                    if (empleadoEncontrado.getPuesto() == "Jefe") {
                        permiso = true;
                    }
                } else {
                    System.out.println("Empleado no encontrado o contraseña incorrecta.");
                }
                break;
            }
        }
        if (login) {
            if (permiso) {
                jefe.MostrarAcciones();
                if (permiso == false) {
                    cajero.MostrarAcciones();
                }
            }
        }
    }
}
