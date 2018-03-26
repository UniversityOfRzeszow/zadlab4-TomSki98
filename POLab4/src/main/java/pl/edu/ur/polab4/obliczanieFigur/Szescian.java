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
public class Szescian {
     public double a;
     
    public Szescian(double a) {
        this.a = a;
    }
     public void objetosc(){
         System.out.println("Objetosc wynosi: "+Math.pow(this.a,3));
     }
     public void pole(){
         System.out.println("Pole wynosi: "+(6*Math.pow(this.a,2)));
     }
}
