        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multMatServer;
import java.rmi.*;
import java.util.Vector;

/**
 *
 * @author karg
 */
public interface matriz extends Remote{
    
    public Double [][] setMatrizC() throws RemoteException;

    /**
     *
     * @param a
     * @param b
     * @param c
     * @throws RemoteException
     */
    public void getMatriz(int a,int c,java.lang.Double b) throws RemoteException;
    public Double [] getColumna(int n)throws RemoteException;; 
    public Double [] getFila(int n)throws RemoteException;;
    public int getXa()throws RemoteException;;
    public int getYa()throws RemoteException;;
    public void printM()throws RemoteException;;
    public int getC()throws RemoteException;;
    
    
}
