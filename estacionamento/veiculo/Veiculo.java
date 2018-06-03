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
public class Veiculo {
    
    private String placa;
    private VeiculoValor tipoVeiculo;

    /**
     *
     * @param placa
     * @param tipoVeiculo
     */
    public Veiculo(String placa, VeiculoValor tipoVeiculo){
        
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the tipoVeiculo
     */
    public VeiculoValor getTipoVeiculo() {
        return tipoVeiculo;
    }

    /**
     * @param tipoVeiculo the tipoVeiculo to set
     */
    public void setTipoVeiculo(VeiculoValor tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
}
