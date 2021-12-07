/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composiçao;

/**
 *
 * @author IFSC
 */
public class Direcao {
    
    String cor;

   public Direcao(){
       cor = "Vermelha";
   }
   public Direcao(String cor){
       this .cor = cor;
   }
   
   void ImprecaoDirecao(){
       System.out.println("");
   }
    
    
    
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
    
    
    
    
    
}
