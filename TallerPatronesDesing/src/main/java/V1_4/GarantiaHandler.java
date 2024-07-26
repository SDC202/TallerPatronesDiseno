/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1_4;

/**
 *
 * @author ariel
 */
public class GarantiaHandler extends BaseHandler{
   @Override
    public String handle(Request request) {
        if ("garantia".equals(request.getTipo())) {
            return "Producto en garantía: " + request.getProducto();
        } else {
            return super.handle(request);
        }
    }
}   
