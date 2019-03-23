/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.rc_86182;

import java.util.Scanner;

/**
 *
 * @author rc
 */
public final class Ponto_Gen {
    private double x, y, coord;
    
    Scanner sc = new Scanner(System.in);
    
    public Ponto_Gen() {
        String xText = "Coordenada X: ";
        String yText = "Coordenada Y: ";
        x = reader(xText);
        y = reader(yText);
    }
    
    public double reader(String text){
        System.out.print(text);
        coord = sc.nextDouble();
        return coord;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordenada x: "+ this.getX() + "\n "
                + "Coordenada y: " + this.getY(); 
    }
    
}
