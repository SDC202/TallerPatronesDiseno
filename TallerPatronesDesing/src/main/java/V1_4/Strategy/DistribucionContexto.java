/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1_4.Strategy;

/**
 *
 * @author sebas
 */
public class DistribucionContexto {
    private EstrategiaDistribucion estrategia;

    public void setEstrategia(EstrategiaDistribucion estrategia) {
        this.estrategia = estrategia;
    }

    public void ejecutarDistribucion() {
        if (estrategia != null) {
            estrategia.distribuir();
        } else {
            System.out.println("Estrategia de distribución no seleccionada.");
        }
    }
}
