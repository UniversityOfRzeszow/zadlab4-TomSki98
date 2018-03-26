/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Tomasz
 */
import java.lang.Math;
public class Kula {
     public double promien;

    public Kula(double promien) {
        this.promien = promien;
    }
     public void objetosc() {
         System.out.println("Objetosc wynosi: "+(4/3*(Math.PI*Math.pow(this.promien,3))));
    }
     public void pole(){
         System.out.println("Pole wynosi: "+(4*Math.PI*Math.pow(this.promien,2)));
     }
}
