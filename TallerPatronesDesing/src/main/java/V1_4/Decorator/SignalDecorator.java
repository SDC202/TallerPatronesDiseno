/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1_4.Decorator;

/**
 *
 * @author jorge
 */
public class SignalDecorator extends NotificacionDecorator{
    public SignalDecorator(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando notificación por Señal...");
        super.enviarMensaje(mensaje);
        System.out.println("Notificación enviada por Señal.");
    }
}
