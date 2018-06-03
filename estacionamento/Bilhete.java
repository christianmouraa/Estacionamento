/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import estacionamento.local.ListaVagas;
import estacionamento.pessoa.Cliente;
import estacionamento.sistema.AuxiliarSistema;
import estacionamento.veiculo.Veiculo;
import java.time.LocalTime;

/**
 *
 * @author chris
 */
public class Bilhete {
    
    private final String codigo;
    private ListaVagas vaga;
    private Cliente cliente;
    private Veiculo veiculo;
    private final LocalTime horaInicio;
    
    /**
     * Construtor para cliente definido
     * @param cliente
     * @param vaga
     */
    public Bilhete(Cliente cliente, ListaVagas vaga){
        
        this.codigo = new AuxiliarSistema().geraCodigoBilhete(vaga);
        this.cliente = cliente;
        this.horaInicio = LocalTime.now();
        this.veiculo = cliente.getVeiculo();
    }

    /**
     * Construtor para cliente não definido
     * @param veiculo
     * @param vaga
     */
    public Bilhete(Veiculo veiculo, ListaVagas vaga){
        
        this.codigo = new AuxiliarSistema().geraCodigoBilhete(vaga);
        this.veiculo = veiculo;
        this.vaga = vaga;
        this.horaInicio = LocalTime.now();
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the vaga
     */
    public ListaVagas getVaga() {
        return vaga;
    }

    /**
     * @param vaga the vaga to set
     */
    public void setVaga(ListaVagas vaga) {
        this.vaga = vaga;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the horaInicio
     */
    public LocalTime getHoraInicio() {
        return horaInicio;
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
