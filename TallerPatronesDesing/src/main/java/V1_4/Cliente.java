/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1_4;

import V1_4.BodegaHandler;

/**
 *
 * @author ariel
 */
public class Cliente {
    public static void main(String[] args) {
        Handler garantia = new GarantiaHandler();
        Handler fallo = new FalloHandler();
        Handler bodega = new BodegaHandler();
        Handler gerente = new GerenteHandler();

        garantia.setNext(fallo).setNext(bodega).setNext(gerente);

        Request request = new Request("garantia", "Laptop", 1200);
        String result = garantia.handle(request);
        System.out.println(result);
    }
}
