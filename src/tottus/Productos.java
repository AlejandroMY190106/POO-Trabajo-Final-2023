package tottus;

import java.util.*;

public class Productos {

    private String nombre;
    private double precio;
    private double precioafiliado;
    private String codigo;
    private String proveedor;
    private String descripcion;
    private int puntosafiliado;

    private static ArrayList<Productos> listaProductos = new ArrayList<>();

    public Productos(String nombre, double precio, double precioafiliado, String codigo, String proveedor, String descripcion, int puntosafiliado) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
        this.precioafiliado = precioafiliado;
        this.puntosafiliado = puntosafiliado;

        listaProductos.add(this);
    }

    public static Productos buscarProductoPorCodigo(String codigo) {
        for (Productos producto : listaProductos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public static void InicioListaProductos() {
        Productos producto1 = new Productos("Coca Cola", 11.40, 10.20, "245028", "Coca-Cola Company", "Bebida Coca Cola de 3L", 3);
        Productos producto2 = new Productos("Pepsi", 10.50, 8.90, "123456", "PepsiCo", "Bebida Pepsi de 2L", 2);
        Productos producto3 = new Productos("Doritos", 3.99, 2.50, "789012", "Frito-Lay", "Bolsa de Doritos de queso", 1);
        Productos producto4 = new Productos("iPhone 13", 999.99, 899.99, "2342387", "Apple Inc.", "Teléfono móvil de Apple", 15);
        Productos producto5 = new Productos("Samsung Galaxy S21", 799.99, 699.99, "2345363", "Samsung Electronics", "Teléfono móvil Samsung", 14);
        Productos producto6 = new Productos("HP Laptop", 799.99, 699.99, "2334523", "HP Inc.", "Portátil HP de 15 pulgadas", 14);
        Productos producto7 = new Productos("Logitech Mouse", 19.99, 15.69, "12167475", "Logitech", "Ratón inalámbrico Logitech", 4);
        Productos producto8 = new Productos("Sony Headphones", 79.99, 62.49, "4236677", "Sony Corporation", "Auriculares Sony con cancelación de ruido", 6);
        Productos producto9 = new Productos("Nike Sneakers", 69.99, 58.50, "58769276", "Nike, Inc.", "Zapatillas deportivas Nike", 6);
        Productos producto10 = new Productos("Adidas T-Shirt", 29.99, 24.60, "387635", "Adidas AG", "Camiseta Adidas para hombre", 5);
        Productos producto11 = new Productos("Panasonic Microwave", 129.99, 115.99, "664398", "Panasonic Corporation", "Horno de microondas Panasonic de 1.2 cu. ft.", 8);
        Productos producto12 = new Productos("LG Smart TV", 499.99, 439.99, "5589386", "LG Electronics", "Televisor LG Smart TV de 55 pulgadas", 10);
        Productos producto13 = new Productos("Nespresso Coffee Machine", 199.99, 169.99, "56345683", "Nestlé Nespresso S.A.", "Máquina de café Nespresso", 7);
        Productos producto14 = new Productos("Canon Camera", 399.99, 359.99, "6456788", "Canon Inc.", "Cámara digital Canon EOS", 9);
        Productos producto15 = new Productos("Bose Speakers", 149.99, 135.99, "33446888", "Bose Corporation", "Altavoces inalámbricos Bose", 6);
        Productos producto16 = new Productos("Sennheiser Microphone", 129.99, 10.99, "34467788", "Sennheiser Electronic GmbH & Co. KG", "Micrófono Sennheiser profesional", 7);
        Productos producto17 = new Productos("LEGO Star Wars Set", 79.99, 65.99, "2666678", "The LEGO Group", "Set de construcción LEGO Star Wars", 5);
        Productos producto18 = new Productos("MacBook Air", 1099.99, 999.99, "346342452", "Apple Inc.", "Portátil MacBook Air de Apple", 18);
        Productos producto19 = new Productos("Samsung Refrigerator", 899.99, 849.99, "59994755", "Samsung Electronics", "Nevera Samsung de 18 cu. ft.", 16);
        Productos producto20 = new Productos("Amazon Echo", 59.99, 45.99, "55482082", "Amazon.com, Inc.", "Altavoz inteligente Amazon Echo", 5);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPrecioAfiliado() {
        return precioafiliado;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPuntosAfiliados() {
        return puntosafiliado;
    }

    public static ArrayList<Productos> getListaProductos() {
        return listaProductos;
    }

    public static void agregarNuevoProducto(String nombre, double precio, double precioafiliado, String codigo, String proveedor, String descripcion, int puntosafiliado) {
        
        boolean codigoExiste;
        int c =0;
        boolean error=true;
        do {
            
            codigoExiste = false;
            for (Productos producto : listaProductos) {
                if (producto.getCodigo().equals(codigo)) {
                    codigoExiste = true;
                    c++;
                    if(c >= listaProductos.size()){
                    codigoExiste = false;
                    error = false;
                    }
                }
            }
        } while (codigoExiste);
        if(error){
        Productos nuevoProductos = new Productos(nombre, precio, precioafiliado, codigo, proveedor, descripcion, puntosafiliado);
        System.out.println("Nuevo producto agregado con éxito.");
        }else{
        System.out.println("El código existe");
        
        }
        

        
        
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nPrecio: " + precio + "\nPrecio Afiliado: " + precioafiliado + "\nCódigo: " + codigo + "\nProveedor: " + proveedor + "\nDescripción: " + descripcion + "\nPuntos Afiliados: " + puntosafiliado;
    }
}
