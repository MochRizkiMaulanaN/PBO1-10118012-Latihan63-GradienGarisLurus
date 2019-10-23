/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main3;

/**
 *
 * @author LENOVO
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat k =new Koordinat(2,10,5,7);
        System.out.println("Garis Yang Melalui Titik ("+k.getX1()+","+k.getY1()+") dan ("+k.getX2()+","+k.getY2()+")");
        System.out.println("Memiliki Gradien Sebesar :"+k.hitungGradien());
        System.out.println("");
        Koordinat k1=new Koordinat(5,1,3,12);
        System.out.println("Garis Yang Melalui Titik ("+k1.getX1()+","+k1.getY1()+") dan ("+k1.getX2()+","+k1.getY2()+")");
        System.out.println("Memiliki Gradien Sebesar :"+k1.hitungGradien());
        
    }
    
}
