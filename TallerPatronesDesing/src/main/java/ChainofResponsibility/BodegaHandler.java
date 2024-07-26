/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainofResponsibility;

/**
 *
 * @author ariel
 */
public class BodegaHandler extends BaseHandler{
    @Override
    public String handle(Request request) {
        if ("bodega".equals(request.getTipo())) {
            return "Producto en bodega: " + request.getProducto();
        } else {
            return super.handle(request);
        }
    }
}

