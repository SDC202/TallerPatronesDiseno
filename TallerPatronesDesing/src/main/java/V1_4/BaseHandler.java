/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1_4;

import V1_4.Request;
import V1_4.Handler;

/**
 *
 * @author ariel
 */
public class BaseHandler implements Handler{
     private Handler nextHandler;

    @Override
    public Handler setNext(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    @Override
    public String handle(Request request) {
        if (nextHandler != null) {
            return nextHandler.handle(request);
        }
        return null;
    }

}
