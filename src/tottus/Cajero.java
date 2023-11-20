package tottus;

import java.util.*;

public class Cajero implements AccionesEmpleados {

    private ListaCompras listaCompras = new ListaCompras();

    public void MostrarAcciones() {
        int opcion;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("1) Añadir Producto a la Lista de Compras");
            System.out.println("2) Eliminar Producto de la Lista de Compras");
            System.out.println("3) Lista de Compras");
            System.out.println("4) Cobrar");
            System.out.println("5) Finalizar");
            System.out.print("Respuesta:\t");
            opcion = s.nextInt();
            switch (opcion) {
                case 1:
                    //AgregarCompra();
                    break;
                case 2:
                    //EliminarCompra();
                    break;
                case 3:
                    listaCompras.MostrarListaCompras();
                    break;
                case 4:
                    listaCompras.Comprar();
                    break;
                case 5:
                    System.out.println("Gracias por su esfuerzo");
                    break;
            }

        } while (opcion != 5);
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
