/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1_5.Decorator;

/**
 *
 * @author jorge
 */
public class NotificacionCorreoElectronico extends NotificacionBase{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje enviado por correo electrónico: " + mensaje);
    }
}
