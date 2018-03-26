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
public class Kolo {
     public double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }
     public void obwod() {
         System.out.println("Obwod wynosi: "+(2*Math.PI*this.promien));
    }
     public void pole(){
         System.out.println("Pole wynosi: "+(Math.PI*Math.pow(this.promien,2)));
     }
}
