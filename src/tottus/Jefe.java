package tottus;

import java.util.*;

public class Jefe implements AccionesEmpleados {

    private ListaCompras listaCompras = new ListaCompras();

    public void MostrarAcciones() {
        Scanner s = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Acciones del Jefe:");
            System.out.println("1) Añadir Producto a la Lista de Compras");
            System.out.println("2) Eliminar Producto de la Lista de Compras");
            System.out.println("3) Lista de Compras");
            System.out.println("4) Comprar");
            System.out.println("5) Añadir Empleado a Lista");
            System.out.println("6) Añadir Producto a Lista");
            System.out.println("7) Lista de Productos");
            System.out.println("8) Lista de Empleados");
            System.out.println("9) Finalizar");
            System.out.print("Respuesta: ");
            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    AgregarCompra();
                    break;
                case 2:
                    EliminarCompra();
                    break;
                case 3:
                    listaCompras.ListaCompras();
                    break;
                case 4:
                    listaCompras.Comprar();
                    break;
                case 5:
                    //Empleados.agregarNuevoEmpleado();
                    break;
                case 6:
                    //Productos.agregarNuevoProducto();
                    break;
                case 7:
                    System.out.println(Productos.getListaProductos());
                    break;
                case 8:
                    System.out.println(Empleados.getListaEmpleados());
                    break;
                case 9:
                    System.out.println("Gracias por su esfuerzo");
                    break;
            }
        } while (opcion != 9);
    }

    public void AgregarCompra() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el código del producto a añadir a la lista de compras:");
        String codigo = s.nextLine();

        Productos producto = Productos.buscarProductoPorCodigo(codigo);
        if (producto != null) {
            listaCompras.AgregarCompra(producto);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void EliminarCompra() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el código del producto a eliminar de la lista de compras:");
        String codigo = s.nextLine();

        Productos producto = Productos.buscarProductoPorCodigo(codigo);
        if (producto != null) {
            listaCompras.EliminarCompra(producto);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
