/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17_2;

/**
 *
 * @author finfanterodal
 */
public class Boletin_17_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Implementamos en la clase Gato las dos interfates y por tanto tenemos los dos métodos.
       Gato gato=new Gato();
       gato.camiñar();
       gato.nadar();
       //Implementamos en la clase Papagaio solo la interfaz IPodeCamiñar, por lo tanto solo tenemos el método camiñar.
       Papagaio papagaio=new Papagaio();
       papagaio.camiñar();
    }
    
}
