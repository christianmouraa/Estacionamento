/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.local;

import estacionamento.veiculo.VeiculoValor;

/**
 *
 * @author chris
 */
public enum ListaVagas {
    
    A1(VeiculoValor.CARRO), A2(VeiculoValor.CARRO), A3(VeiculoValor.CARRO), A4(VeiculoValor.CARRO), A5(VeiculoValor.CARRO),
    A6(VeiculoValor.CARRO), A7(VeiculoValor.CARRO), B1(VeiculoValor.CARRO), B2(VeiculoValor.CARRO), B3(VeiculoValor.CARRO),
    B4(VeiculoValor.CARRO), B5(VeiculoValor.CARRO), B6(VeiculoValor.CARRO), B7(VeiculoValor.CARRO),
    C1(VeiculoValor.CARRO), C2(VeiculoValor.CARRO), C3(VeiculoValor.CARRO), C4(VeiculoValor.CARRO),
    D1(VeiculoValor.MOTO), D2(VeiculoValor.MOTO), D3(VeiculoValor.MOTO), D4(VeiculoValor.MOTO), D5(VeiculoValor.MOTO),
    E1(VeiculoValor.MOTO), E2(VeiculoValor.MOTO), E3(VeiculoValor.MOTO), E4(VeiculoValor.MOTO), E5(VeiculoValor.MOTO), E6(VeiculoValor.MOTO),
    F1(VeiculoValor.MOTO), F2(VeiculoValor.MOTO), F3(VeiculoValor.MOTO), F4(VeiculoValor.MOTO), F5(VeiculoValor.MOTO), F6(VeiculoValor.MOTO);
    
    
    private final VeiculoValor tipoVaga; 
    
    private ListaVagas(VeiculoValor valor){
        
        this.tipoVaga =  valor;
    }
    
    /**
     *
     * @return tipoVaga associado ao enum
     */
    public VeiculoValor getTipoVaga(){
        
        return this.tipoVaga;
    }
}
