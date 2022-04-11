/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_ficha3;

import my_company.utilitarios.Data;

/**
 *
 * @author dinis
 */
public class Cliente {
    private String nome, enderecoP, numCC, email;
    private Data dataNasc;
    
    private static final String NOME_POR_OMISSAO = "", ENDERECOP_POR_OMISSAO = "", NUMCC_POR_OMISSAO = "", EMAIL_POR_OMISSAO = "";
    private static final Data DATANASC_POR_OMISSAO = new Data(2022, 2, 3);
    
    public Cliente(String nome, String enderecoP, String numCC, String email, Data dataNasc){
        setNome(nome);
        setEnderecoP(enderecoP);
        setNumCC(numCC);
        setEmail(email);
        setDataNasc(dataNasc);
    }
    
    public Cliente(String nome){
        setNome(nome);
        setEnderecoP(ENDERECOP_POR_OMISSAO);
        setNumCC(NUMCC_POR_OMISSAO);
        setEmail(EMAIL_POR_OMISSAO);
        setDataNasc(DATANASC_POR_OMISSAO);
    }
    
    public Cliente(Cliente c){
        setNome(c.nome);
        setEnderecoP(c.enderecoP);
        setNumCC(c.numCC);
        setEmail(c.email);
        setDataNasc(c.dataNasc);
    }
    
    //Nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    //Nome
    public void setEnderecoP(String enderecoP) {
        this.enderecoP = enderecoP;
    }

    public String getEnderecoP() {
        return enderecoP;
    }
    
    //NumCC
    public void setNumCC(String numCC) {
        this.numCC = numCC;
    }

    public String getNumCC() {
        return numCC;
    }
    
    //dataNasc
    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Data getDataNasc() {
        return dataNasc;
    }
    
    //Email
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    //Descrição
    public String toString() {
        return "Nome: " + nome + "\nEndereço de Postal: " + enderecoP + "\nNúmero do C.C.: " + numCC + "\nData de Nascimento: " + dataNasc.toString()+ "\nEmail: " + email;
    }
    
    //Método Equals
    public boolean equals(Cliente c){
        if (this==c) {
            return true;
        }
        if (c==null || getClass() != c.getClass()) {
            return false;
        }
        
        Cliente c1 = (Cliente) c;
        return this.nome.equals(c1.nome) && this.enderecoP.equals(c1.enderecoP) && this.numCC.equals(c1.numCC) && this.dataNasc.equals(c1.dataNasc) && this.email.equals(c1.email); 
    }
}
