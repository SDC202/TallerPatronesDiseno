/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1_4.Iterator;
import V1_4.Producto;
import java.util.List;

/**
 *
 * @author sebas
 */
public class IteradorTienda implements IteradorProducto {
    private List<Producto> productos;
    private int index = 0;

    public IteradorTienda(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public boolean hasNext() {
        return index < productos.size();
    }

    @Override
    public Producto next() {
        if (hasNext()) {
            return productos.get(index++);
        }
        return null;
    }
}
