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
public class InventarioReparacion implements Inventario {
    private List<Producto> productos;

    public InventarioReparacion(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public IteradorProducto crearIterador() {
        List<Producto> productosReparacion = productos.stream()
                .filter(p -> p.getEstado().equals("en reparación"))
                .collect(Collectors.toList());
        return new IteradorReparacion(productosReparacion);
    }
}
