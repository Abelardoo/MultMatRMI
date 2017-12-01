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
    
    /**
     *
     * @return
     * @throws RemoteException
     */
    public Double [][] setMatrizC() throws RemoteException;

    /**
     *
     * @param a
     * @param b
     * @param c
     * @throws RemoteException
     */
    public void getMatriz(int a,int c,java.lang.Double b) throws RemoteException;

    /**
     *
     * @param n
     * @return
     * @throws RemoteException
     */
    public Double [] getColumna(int n)throws RemoteException;; 

    /**
     *
     * @param n
     * @return
     * @throws RemoteException
     */
    public Double [] getFila(int n)throws RemoteException;;

    /**
     *
     * @return
     * @throws RemoteException
     */
    public int getXa()throws RemoteException;;

    /**
     *
     * @return
     * @throws RemoteException
     */
    public int getYa()throws RemoteException;;

    /**
     *
     * @throws RemoteException
     */
    public void printM()throws RemoteException;;

    /**
     *
     * @return
     * @throws RemoteException
     */
    public int getC()throws RemoteException;;
    
    
}
