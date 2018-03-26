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
public class Stozek {
     public double promien;
     public double tworzaca;
     public double wysokosc;

    public Stozek(double promien,double tworzaca,double wysokosc) {
        this.promien = promien;
        this.tworzaca = tworzaca;
        this.wysokosc = wysokosc;
    }
     public void objetosc() {
         System.out.println("Objetosc wynosi: "+(1/3*(Math.PI*Math.pow(this.promien,2))*this.wysokosc));
    }
     public void pole(){
         System.out.println("Pole wynosi: "+(Math.PI*Math.pow(this.promien,2)+Math.PI*this.promien*this.tworzaca));
     }
}
