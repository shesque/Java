/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author USER
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Stream flyshed = new Stream();
    flyshed.nome = "Flyshed";
    flyshed.jogo = "Rocketzada";
    flyshed.qualidade = "4K";
    flyshed.status();
    
    Stream arpho = new Stream();
    arpho.nome = "Arpho";
    arpho.jogo = "Jogo Merda";
    arpho.qualidade = "144p";
    arpho.status();
    }
    
}
