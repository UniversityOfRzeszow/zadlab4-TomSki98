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
public class Prostopadloscian {
     public double a;
     public double b;
     public double h;
     
    public Prostopadloscian(double a,double b,double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }
     public void objetosc(){
         System.out.println("Objetosc wynosi: "+(this.a*this.b*this.h));
     }
     public void pole(){
         System.out.println("Pole wynosi: "+(2*(this.a*this.b)+2*(this.a*this.h)+2*(this.b*this.h)));
     }
}
