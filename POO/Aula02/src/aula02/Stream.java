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
public class Stream {
    String nome;
    String qualidade;
    String jogo;
    
    void status(){
        System.out.println("======== " + this.nome + " ========");
        System.out.println("A qualidade atual é: " + this.qualidade + "!");
        System.out.println("O jogo atual é: " + this.jogo + "! \n");
    }
    
    
    
}
