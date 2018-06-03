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
            if (bilheteAtual.getCodigo().equals(codBilhete)) break;        
        }    
        this.bilhetesAtivos.remove(getBilhete(codBilhete));
        
        System.out.println("Bilhete Removido");
    }
    
    /**
     * Dado os parâmetros, retorna um booleano true para vaga disponível
     * ou false para vaga indisponível
     * 
     * @param local
     * @param vaga
     * @return boolean
     */
    public boolean conferirDisponibilidadeVaga(Local local, ListaVagas vaga){
        
        ArrayList<Bilhete> bilhetes = local.getVeiculosEstacionados();
        
        for (Bilhete bilhete : bilhetes) {
            if (bilhete.getVaga() == vaga) {
                System.out.println("Vaga indisponível");
                return false;
            }
        }
        return true;
    }
    
    public ListaVagas[] vagasDisponiveis(){
        
        ListaVagas[] listaVagas = new ListaVagas[ListaVagas.values().length];
        int i = 0;
        for (ListaVagas vaga : ListaVagas.values()) {
            if (conferirDisponibilidadeVaga(this, vaga)) {
                listaVagas[i++] = vaga;
            }
        }
        
        return listaVagas;
    }
}
