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
public class Kwadrat {
     public double a;

    public Kwadrat(double a) {
        this.a = a;
    }
     public void obwod() {
         System.out.println("Obwod wynosi: "+(4*this.a));
    }
     public void pole(){
         System.out.println("Pole wynosi: "+(Math.pow(this.a,2)));
     }
}
