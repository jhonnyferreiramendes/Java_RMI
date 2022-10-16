/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;


import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author Jhonny
 */
public class Cliente {

    public static void main(String[] args) throws Exception {
        

        String objName = "rmi://localhost:1099/Funcoes";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor: ");
        double valor = entrada.nextDouble();
        
        Servicos funcoes = (Servicos) Naming.lookup(objName);
        funcoes.dobro(valor);
        funcoes.triplo(valor);
        funcoes.quadruplo(valor);
        
        
        
    }

}
