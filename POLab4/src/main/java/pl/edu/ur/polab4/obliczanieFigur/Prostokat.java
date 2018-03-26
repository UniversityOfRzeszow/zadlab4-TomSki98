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
public class Prostokat {
     public double a;
     public double b;

    public Prostokat(double a,double b) {
        this.a = a;
        this.b = b;
    }
     public void obwod() {
         System.out.println("Obwod wynosi: "+(2*this.a+2*this.b));
    }
     public void pole(){
         System.out.println("Pole wynosi: "+(this.a*this.b));
     }
}
