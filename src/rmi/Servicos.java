/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Jhonny
 */
public interface Servicos extends Remote{
    
    
    public void dobro(double valor) throws RemoteException;
    
    public void triplo(double valor) throws RemoteException;
    
    public void quadruplo(double valor) throws RemoteException;
    

    
    
}
