/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.local;

import estacionamento.Bilhete;
import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class Local {
    
    private final ArrayList<Bilhete> bilhetesAtivos;
    
    public Local(){
        
        this.bilhetesAtivos = new ArrayList<>();
    }
    
    
    public ArrayList getVeiculosEstacionados(){
        
        return this.bilhetesAtivos;
    }
    
    public void addBilhete(Bilhete bilhete) {
            
        this.bilhetesAtivos.add(bilhete);
    }
    
    public Bilhete getBilhete(String codBilhete){
        
        for (Bilhete bilhete : bilhetesAtivos) {
            if (bilhete.getCodigo().equals(codBilhete)) {
                System.out.println("Bilhete encontrado!");
                return bilhete;
            }
        }
        System.out.println("Bilhete não encontrado");
        return null;
    }
    
    public void removeBilhete(String codBilhete){
    
        for (Bilhete bilheteAtual : bilhetesAtivos) {
            if (bilheteAtual.getCodigo().equals(codBilhete)) {
                
                if (bilhetesAtivos.remove(bilheteAtual)){
                    System.out.println("bilhete removido");
                    
                }else System.out.println("Erro: Bilhete não removido");
            }
        }
    }
}