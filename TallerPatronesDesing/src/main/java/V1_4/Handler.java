/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package V1_4;


/**
 *
 * @author ariel
 */
public interface Handler {
    Handler setNext(Handler handler);
    String handle(Request request);
}
