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
public class InventarioGeneral implements Inventario{
    private List<Producto> productos;

    public InventarioGeneral(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public IteradorProducto crearIterador() {
        return new IteradorGeneral(productos);
    }
}
