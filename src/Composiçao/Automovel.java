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
public class Automovel {
    
   public Motor motor;
     Direcao direcao;
    
    public Automovel(){
        motor = new Motor();
        direcao = new Direcao();
    }
    public Automovel(int potencia, String cor){
        motor = new Motor(potencia);
        direcao = new Direcao(cor);
    }
      public void LigarPelaPrimeiraVez (){
        motor = new Motor();  
        ;
    }
    
    public void LigaPelaPrimeiraVez(int potencia ){
       motor = new Motor(potencia);
       
    }
     public void ImprecaoMotor(){
        
        System.out.println("Potencia do Motor: "+motor.potencia);
        System.out.println("Cor da Direção: "+ direcao.cor);
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }
   
    
    
   
    
}
