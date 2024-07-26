/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1_4.Decorator;

/**
 *
 * @author jorge
 */
public class NotificacionSMS extends NotificacionBase {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje enviado por SMS: " + mensaje);
    }
}
