package tottus;

import java.util.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ListaCompras {

    Scanner s = new Scanner(System.in);
    private Map<Productos, Integer> listaCompras = new HashMap<>();

    public void AgregarCompra(Productos producto) {
        if (listaCompras.containsKey(producto)) {
            listaCompras.put(producto, listaCompras.get(producto) + 1);
        } else {
            listaCompras.put(producto, 1);
        }
        System.out.println("Producto añadido a la lista de compras.");
    }

    public void EliminarCompra(Productos producto) {
        if (listaCompras.containsKey(producto)) {
            int cantidad = listaCompras.get(producto);
            if (cantidad > 1) {
                listaCompras.put(producto, cantidad - 1);
            } else {
                listaCompras.remove(producto);
            }
            System.out.println("Producto eliminado de la lista de compras.");
        } else {
            System.out.println("El producto no está en la lista de compras.");
        }
    }

    public void ListaCompras() {
        System.out.println("Lista de Compras:");
        double costoTotal = 0.0;
        double costoTotalAfiliado = 0.0;
        double puntostotal = 0.0;

        for (Map.Entry<Productos, Integer> entry : listaCompras.entrySet()) {
            Productos producto = entry.getKey();
            int cantidad = entry.getValue();
            double costoProducto = producto.getPrecio() * cantidad;
            double costoProductoAfiliado = producto.getPrecioAfiliado() * cantidad;
            double puntosproducto = producto.getPuntosAfiliados() * cantidad;
            costoTotal += costoProducto;
            costoTotalAfiliado += costoProductoAfiliado;
            puntostotal += puntosproducto;
            System.out.println(producto.getNombre() + " x" + cantidad + " - Precio Unitario: $" + producto.getPrecio() + " - Costo Total: $" + costoProducto);
            System.out.println(producto.getNombre() + " x" + cantidad + " - Precio Unitario (Afiliado): $" + producto.getPrecioAfiliado() + " - Costo Total (Afiliado): $" + costoProductoAfiliado);
        }
        System.out.println("Costo Total de la Compra: $" + costoTotal);
        System.out.println("Costo Total de la Compra (Afiliado): $" + costoTotalAfiliado);
        System.out.println("Puntos Total (Afiliados): " + puntostotal);
    }

    public void BorrarListaCompras() {
        listaCompras.clear();
        System.out.println("Lista de compras borrada.");
    }

    public void Comprar() {
        System.out.println("Ingrese la tarjeta del cliente:");
        String tarjeta = s.nextLine();
        Clientes clienteencontrado = Clientes.buscarClientePorTarjeta(tarjeta);
        if (clienteencontrado == null) {
            System.out.println("Cliente no Encontrado");
        } else {
            boolean afiliado;
            if (clienteencontrado.isAfiliado()) {
                afiliado = true;
            } else {
                afiliado = false;
            }
            System.out.println("Lista de Compras:");
            double costoTotal = 0.0;
            double puntostotal = 0.0;
            if (afiliado == false) {
                for (Map.Entry<Productos, Integer> entry : listaCompras.entrySet()) {
                    Productos producto = entry.getKey();
                    int cantidad = entry.getValue();
                    double costoProducto = producto.getPrecio() * cantidad;
                    costoTotal += costoProducto;
                    System.out.println(producto.getNombre() + " x" + cantidad + " - Precio Unitario: $" + producto.getPrecio() + " - Costo Total: $" + costoProducto);
                }

            } else {
                for (Map.Entry<Productos, Integer> entry : listaCompras.entrySet()) {
                    Productos producto = entry.getKey();
                    int cantidad = entry.getValue();
                    double costoProducto = producto.getPrecioAfiliado() * cantidad;
                    double puntosproducto = producto.getPuntosAfiliados() * cantidad;
                    puntostotal += puntosproducto;
                    costoTotal += costoProducto;
                    System.out.println(producto.getNombre() + " x" + cantidad + " - Precio Unitario: $" + producto.getPrecioAfiliado() + " - Costo Total: $" + costoProducto + " - Puntos por Compra: " + puntosproducto);
                }
                System.out.println("Costo Total de la Compra: $" + costoTotal);
                if (costoTotal > clienteencontrado.getSaldo()) {
                    System.out.println("Saldo insuficiente");
                } else {
                    ZoneId zonaHorariaPeru = ZoneId.of("America/Lima");
                    ZonedDateTime fechaYHoraActualPeru = ZonedDateTime.now(zonaHorariaPeru);
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    String fechaFormateadaPeru = fechaYHoraActualPeru.format(formatter);
                    System.out.println("Hora actual: " + fechaFormateadaPeru);
                    if (afiliado) {
                        int puntosacumulados = clienteencontrado.getPuntosAcumulados();
                        System.out.println("Puntos antes de la compra: " + puntosacumulados);
                        System.out.println("Puntos por la compra : " + puntostotal);
                        puntosacumulados += puntostotal;
                        clienteencontrado.setPuntosAcumulados(puntosacumulados);
                        System.out.println("Puntos Acumulados: " + clienteencontrado.getPuntosAcumulados());
                    }
                }
                if (costoTotal <= clienteencontrado.getSaldo()) {
                    System.out.println("Gracias por su compra");
                    double SC = clienteencontrado.getSaldo();
                    SC -= costoTotal;
                    clienteencontrado.setSaldo(SC);
                    BorrarListaCompras();
                } else {
                    System.out.println("Ingrese otra tarjeta");
                }
            }
        }
    }
}
