/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17_1;

/**
 *
 * @author finfanterodal
 */
public class Gato implements IPodeCamiñar,IPodeNadar {
    @Override
    public void camiñar(){
        System.out.println("Pode camiñar.");
    }

    @Override
    public void nadar() {
         System.out.println("Pode nadar.");
    }
    
}
