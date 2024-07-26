/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainofResponsibility;

/**
 *
 * @author ariel
 */
public class FalloHandler extends BaseHandler{
    @Override
    public String handle(Request request) {
        if ("fallo".equals(request.getTipo())) {
            return "Fallo en producto: " + request.getProducto();
        } else {
            return super.handle(request);
        }
    }
}
