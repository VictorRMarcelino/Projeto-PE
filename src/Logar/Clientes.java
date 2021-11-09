/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logar;
import java.io.*;


/**
 *
 * @author victor.marcelino
 */
public class Clientes implements Serializable{
    private String conta;
    private int acesso;
    
    public Clientes(String conta, int acesso) {
        this.conta = conta;
        this.acesso = acesso;
    }

    public boolean equals(Clientes dados)
    {
        return(this.conta.equals(dados.conta) && this.acesso == dados.acesso);
    }
    
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public int getAcesso() {
        return acesso;
    }

    public void setAcesso(int acesso) {
        this.acesso = acesso;
    }
   
}
