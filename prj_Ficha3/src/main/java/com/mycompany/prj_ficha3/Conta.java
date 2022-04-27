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
public class Conta {

    private int codConta, qtdMov;
    private double saldo;
    private Cliente titular1, titular2;
    private Data dataAbertura, dataUltMov;

    private static final int CODCONTA_POR_OMISSAO = 0, QTDMOV_POR_OMISSAO = 0;
    private static final double SALDO_POR_OMISSAO = 0;
    private static final Cliente TITULAR1_POR_OMISSAO = new Cliente("Dinis"), TITULAR2_POR_OMISSAO = new Cliente("Afonso");
    private static final Data DATAABERTURA_POR_OMISSAO = new Data(2022, 2, 3), DATAULTMOV_POR_OMISSAO = new Data(2022, 2, 3);

    public Conta(int codConta, double saldo, int qtdMov, Cliente c) {
        setCodConta(codConta);
        setSaldo(saldo);
        setQtdMov(qtdMov);
        setTitular1(c);
        setTitular2(TITULAR2_POR_OMISSAO);
        setDataAbertura(DATAABERTURA_POR_OMISSAO);
        setDataUltMov(DATAULTMOV_POR_OMISSAO);
    }

    public Conta(Conta c) {
        setCodConta(c.codConta);
        setSaldo(c.saldo);
        setQtdMov(c.qtdMov);
        setTitular1(c.titular1);
        setTitular2(c.titular2);
        setDataAbertura(DATAABERTURA_POR_OMISSAO);
        setDataUltMov(DATAULTMOV_POR_OMISSAO);
    }

    //codConta
    public void setCodConta(int codConta) {
        this.codConta = codConta;
    }

    public int getCodConta() {
        return codConta;
    }

    //Titular1
    public void setTitular1(Cliente titular1) {
        this.titular1 = titular1;
    }

    public Cliente getTitular1() {
        return titular1;
    }

    //Titular2
    public void setTitular2(Cliente titular2) {
        this.titular2 = titular2;
    }

    public Cliente getTitular2() {
        return titular2;
    }

    //Data Abertura
    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    //Data Último Movimento
    public void setDataUltMov(Data dataUltMov) {
        this.dataUltMov = dataUltMov;
    }

    public Data getDataUltMov() {
        return dataUltMov;
    }

    //Quantidade de Movimentos
    public void setQtdMov(int dataqtdMov) {
        this.qtdMov = qtdMov;
    }

    public int getQtdMov() {
        return qtdMov;
    }

    //Saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    //Descrição
    public String toString() {
        return "Código da Conta: " + codConta + "\n Primeiro Titular: " + titular1 + "\nSegundo Titular: " + titular2 + "\nData de Abertura: " + dataAbertura.toString() + "\nData do Último Movimento: " + dataUltMov.toString() + "\nQuantidade de Movimentos: " + qtdMov + "\nSaldo: " + saldo;
    }

    //Método Clone
    public Conta clone() {
        return new Conta(this);
    }

    //Método Equals
    public boolean equals(Conta c) {
        if (this == c) {
            return true;
        }
        if (c == null || getClass() != c.getClass()) {
            return false;
        }

        Conta c1 = (Conta) c;
        return this.saldo == c1.saldo && this.codConta == c1.codConta && this.titular1.equals(c1.titular1) && this.titular2.equals(c1.titular2) && this.dataAbertura.equals(c1.dataAbertura) && this.dataUltMov.equals(c1.dataUltMov) && this.qtdMov == c1.qtdMov;
    }

    //Método Levantamento
    public void levantamento(double valor, Data data) {
        this.saldo -= valor;
    }

    //Método Deposito
    public void deposito(double valor, Data data) {
        this.saldo += valor;
        this.dataUltMov = data;
    }

    //Método Dias sem Movimentos
    public int dias_ult_mov(Data data_hoje) {
        return this.dataUltMov.calcularDiferenca(data_hoje);
    }

    //Método Dias da conta
    public int dias_conta(Data data_hoje) {
        return this.dataAbertura.calcularDiferenca(data_hoje);
    }

    //Método mais que x anos
    public boolean dias_conta(Data data_hoje, int x) {
        if (this.dataAbertura.calcularDiferenca(data_hoje) > x) {
            return true;
        } else {
            return false;
        }
    }

}
