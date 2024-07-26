/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1_4.Decorator;

/**
 *
 * @author jorge
 */
public class WireDecorator extends NotificacionDecorator {
    public WireDecorator(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando notificación mediante Wire...");
        super.enviarMensaje(mensaje);
        System.out.println("Notificación enviada por Wire.");
    }
}
