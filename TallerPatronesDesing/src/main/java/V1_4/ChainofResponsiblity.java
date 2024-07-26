/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package V1_4;

import V1_4.Request;
import V1_4.Handler;
import V1_4.GerenteHandler;
import V1_4.GarantiaHandler;
import V1_4.FalloHandler;
import V1_4.BodegaHandler;

/**
 *
 * @author ariel
 */
public class ChainofResponsiblity {

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
