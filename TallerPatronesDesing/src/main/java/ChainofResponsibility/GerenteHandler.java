/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainofResponsibility;

/**
 *
 * @author ariel
 */
public class GerenteHandler extends BaseHandler{
    @Override
    public String handle(Request request) {
        if (request.getPrecio() > 1000) {
            return "Aprobado por Gerente: " + request.getProducto();
        } else {
            return super.handle(request);
        }
    }
}
