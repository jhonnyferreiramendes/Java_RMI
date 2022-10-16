/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Jhonny
 */
public class Funcoes extends UnicastRemoteObject implements Servicos{
    
    public Funcoes() throws RemoteException{
        super();
    }

    public void dobro (double valor) throws RemoteException {
            System.out.println("o dobro do valor é: " + valor * 2);
    }

   
    public void triplo(double valor) throws RemoteException {
            System.out.println("o triplo do valor é: " + valor * 3);   
    }

    
    public void quadruplo(double valor) throws RemoteException {
            System.out.println("o quadruplo do valor é: " + valor * 4); 
    }

    

    
}
