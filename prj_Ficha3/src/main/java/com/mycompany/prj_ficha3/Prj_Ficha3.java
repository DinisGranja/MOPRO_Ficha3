/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prj_ficha3;
import java.util.ArrayList;
import my_company.utilitarios.Data;

/**
 *
 * @author dinis
 */
public class Prj_Ficha3 {

    public static void main(String[] args) {
        Data L1 = new Data(2003,3,2);
        Data data_nasc_1 = new Data(2003,3,2);
        Data data_nasc_2 = new Data(1970,12,15);
        Data data_nasc_3 = new Data(1950,4,27);
        Data data_nasc_4 = new Data(2003,10,8);
        ArrayList<Conta> vet = new ArrayList<Conta>();
        Cliente c1 = new Cliente("Dinis","4410-389","1112345","dinisfgranja@hotmail.com",data_nasc_1);  
        Conta cont1= new Conta(12118,84.4,4,c1);
        Cliente c2 = new Cliente("João","4411-389","2034123","joaorei@hotmail.com",data_nasc_2);  
        Conta cont2= new Conta(12132,100,10,c2);
        Cliente c3 = new Cliente("Maria","4321-956","96329876","mariamimosa@gamil.com",data_nasc_3);  
        Conta cont3= new Conta(11158,1430.54,2,c3);
        Cliente c4 = new Cliente("Ana","1111-400","164236","anagomes2010@hotmail.com",data_nasc_4);  
        Conta cont4= new Conta(12007,500,1,c4);
        vet.add(cont1);
        vet.add(cont2);
        vet.add(cont3);
        vet.add(cont4);
        
        listarContasMediaIdadesInferior(vet);
    }
    //Método para ver as contas
    private static void listarContas(ArrayList<Conta> vec) {
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(vec.get(i).toString());
            System.out.println("");
        }
    }
    
    private static void listarContasMediaIdadesInferior(ArrayList<Conta> vec){
        double idade_m = 0;
        Data data_atual = new Data(2022,4,27);
        
        for (int i = 0; i < vec.size(); i++) {
            idade_m = vec.get(i).getTitular1().getDataNasc().calcularDiferenca(data_atual);
            //idade_m = (vec.get(i).getTitular1().getDataNasc().calcularDiferenca(data_atual)+vec.get(i).getTitular2().getDataNasc().calcularDiferenca(data_atual))/2;
            System.out.println(idade_m);
            /*if (idade_m < 50) {
                System.out.println(vec.get(i).toString());
                System.out.println("");
            }*/
        }
    }
}
