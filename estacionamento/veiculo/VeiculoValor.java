/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.veiculo;

/**
 *
 * @author chris
 */
public enum VeiculoValor {
    //enumerados com valores textuais associados
    /*
    CARRO("CR"),
    MOTO("MT"),
    CAMINHAO("CM"),
    CAMINHONETE("CN");
    
    //valor do construtor
    private final String valor;

    private VeiculoValor(String valor) {
        
        this.valor = valor;
    }
    
    //retorna valor do enum

    /**
     *
     * @return valor associado ao enum
     
    public String getValor(){  
        
        return this.valor;
    }*/
    
    CARRO(3), MOTO(1.5), CAMINHONETE(4), CAMINHAO(7);
    
    private final double valor;
    
    private VeiculoValor(double valor){
        
        this.valor = valor;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }
}
