/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.sistema;

import estacionamento.Bilhete;
import estacionamento.local.ListaVagas;
import estacionamento.local.Local;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author chris
 * 
 * Responsável por realizar funções secundárias
 * relacionadas ao sistema, mas que não é responsabilidade direta.
 */
public class AuxiliarSistema {
   
    public AuxiliarSistema(){}
    
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
    
    /**
     *
     * Baseado na data, hora atual e o tipo de vaga ocupado,
     * gera um código para ser atribuído a um bilhete
     * 
     * @param vaga
     * @return código gerado para o bilhete
     */
    public String geraCodigoBilhete(ListaVagas vaga){
        
        String ano = String.valueOf(LocalDate.now().getYear());
        String diaAno = String.valueOf(LocalDate.now().getDayOfYear());
        String hora = String.valueOf(LocalTime.now().toSecondOfDay());
        
        String cod = vaga+ano+diaAno+hora; 
        System.out.println(cod);
        return  cod;
    }
    
    public int calculaTempoCobrar(LocalTime horaInicio){
        
        //usando localtime.of para esfeito de tesste.
        // versao final deve ser substitido por localtime.now
        Duration dur = Duration.between(horaInicio, LocalTime.of(17, 15));
        
        int horasCobrar;
        
        LocalTime lt = LocalTime.ofNanoOfDay(dur.toNanos());
        
        horasCobrar = (lt.getMinute() > 9) ? lt.getHour() + 1 : lt.getHour();
        
        return horasCobrar;
    }
}
