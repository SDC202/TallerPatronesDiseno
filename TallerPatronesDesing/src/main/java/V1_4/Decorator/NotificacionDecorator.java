/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1_4.Decorator;

/**
 *
 * @author jorge
 */
public abstract class NotificacionDecorator extends NotificacionBase {
    private Notificacion notificacion;
    
    public NotificacionDecorator(Notificacion notificacion) {
        this.notificacion = notificacion;
    }
    @Override
    public void enviarMensaje(String mensaje) {
        notificacion.enviarMensaje(mensaje);
    }
}
