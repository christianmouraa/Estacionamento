/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.pessoa;

import estacionamento.veiculo.Veiculo;

/**
 *
 * @author chris
 */
public class Cliente extends Pessoa{
    
    private Veiculo veiculo;
    
    public Cliente(String nome, String cpf, Veiculo veiculo) {
        super(nome, cpf);
        
        this.veiculo = veiculo;
    }

    /**
     * @return the veiculo
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    
}
