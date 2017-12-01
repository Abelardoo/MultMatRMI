/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multMatServer;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author karg
 */
public class matrizClient {

    /**
     *
     * @param args
     */
    public static void main(String args[]){
         		
         try {
             matriz m=(matriz) Naming.lookup("Matriz");
                  
             Double [] [] asd = m.setMatrizC();
             Double x=asd[0][0];
             Double y=asd[0][1];
             int n=m.getC();
             Double res=0.0;
             System.out.println(x);
             System.out.println(y);
             
             for(int i=0;i<n;i++)
             {
                 res+=asd[1][i]*asd[2][i];
             }
             m.getMatriz(x.intValue(),y.intValue(),res);
             m.printM();
           
            
             
         } catch (NotBoundException ex) {
             Logger.getLogger(matrizClient.class.getName()).log(Level.SEVERE, null, ex);
         } catch (MalformedURLException ex) {
             Logger.getLogger(matrizClient.class.getName()).log(Level.SEVERE, null, ex);
         } catch (RemoteException ex) {
             Logger.getLogger(matrizClient.class.getName()).log(Level.SEVERE, null, ex);
         }

     }

}
