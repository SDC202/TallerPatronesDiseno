/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1_4;

/**
 *
 * @author ariel
 */
public class Request {
   private String tipo;
    private String producto;
    private double precio;

    public Request(String tipo, String producto, double precio) {
        this.tipo = tipo;
        this.producto = producto;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    } 
}
