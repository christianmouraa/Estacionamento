    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import estacionamento.sistema.Sistema;
import estacionamento.local.Local;
import estacionamento.local.ListaVagas;
import estacionamento.veiculo.VeiculoValor;
import estacionamento.veiculo.Veiculo;


/**
 *
 * @author chris
 */
public class Estacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Local local = new Local();
        Sistema sis = new Sistema();
        
        sis.checkInSemCadastro(new Veiculo("aaa1234", VeiculoValor.CARRO), ListaVagas.A1, local);
        sis.checkInSemCadastro(new Veiculo("abc1245", VeiculoValor.CARRO), ListaVagas.A2, local);
            
        //type cast necessario pois metodo get(int index) de ArrayList retorna Object
        Bilhete bilhete = (Bilhete) local.getVeiculosEstacionados().get(0);
        sis.checkOut(bilhete.getCodigo(), local);
        
    }
    
}
