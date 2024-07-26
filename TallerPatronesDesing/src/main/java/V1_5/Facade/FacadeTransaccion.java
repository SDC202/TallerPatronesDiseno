/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1_5.Facade;

/**
 *
 * @author jorge
 */
public class FacadeTransaccion {
    private Web webAPI;
    private Movil movilAPI;
    private Telefonico telAPI;

    public FacadeTransaccion() {
        webAPI = new Web();
        movilAPI = new Movil();
        telAPI = new Telefonico();
    }

    public void realizarVenta(String canal) {
        switch (canal) {
            case "web":
                webAPI.venta();
                break;
            case "movil":
                movilAPI.venta();
                break;
            case "tel":
                telAPI.venta();
                break;
            default:
                System.out.println("Canal no reconocido");
        }
    }

    public void consultarSaldo(String canal) {
        switch (canal) {
            case "web":
                webAPI.saldo();
                break;
            case "movil":
                movilAPI.saldo();
                break;
            case "tel":
                telAPI.saldo();
                break;
            default:
                System.out.println("Canal no reconocido");
        }
    }

    public void generarReporte(String canal) {
        switch (canal) {
            case "web":
                webAPI.reporte();
                break;
            case "movil":
                movilAPI.reporte();
                break;
            case "tel":
                telAPI.reporte();
                break;
            default:
                System.out.println("Canal no reconocido");
        }
    }
}
