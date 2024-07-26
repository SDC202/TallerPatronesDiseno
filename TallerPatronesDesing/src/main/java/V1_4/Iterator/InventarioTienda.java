/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1_4.Iterator;
import V1_4.Producto;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author sebas
 */
public class InventarioTienda implements Inventario {
    private List<Producto> productos;
    private int tiendaId;

    public InventarioTienda(List<Producto> productos, int tiendaId) {
        this.productos = productos;
        this.tiendaId = tiendaId;
    }

    @Override
    public IteradorProducto crearIterador() {
        List<Producto> productosTienda = productos.stream()
                .filter(p -> p.getEstado().equals("disponible") && p.getId() == tiendaId)
                .collect(Collectors.toList());
        return new IteradorTienda(productosTienda);
    }
}
