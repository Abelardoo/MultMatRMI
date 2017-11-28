/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multMatServer;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;
import java.util.*;

/**
 *
 * @author karg
 */
public class serverMain {
    public static void main (String[] argv) {
    try {
	    	
 
                Double [][] mimatriz= new Double [4][4];
                mimatriz[0][0]=4.5;
                mimatriz[1][0]=4.5;
                mimatriz[2][0]=4.5;
                mimatriz[3][0]=4.5;
                mimatriz[0][1]=4.5;
                mimatriz[1][1]=4.5;
                mimatriz[2][1]=4.5;
                mimatriz[3][1]=4.5;
                mimatriz[0][2]=4.5;
                mimatriz[1][2]=4.5;
                mimatriz[2][2]=4.5;
                mimatriz[3][2]=4.5;
                mimatriz[0][3]=4.5;
                mimatriz[1][3]=4.5;
                mimatriz[2][3]=4.5;
                mimatriz[3][3]=4.5;
                
                
	    	matrizImp server = new matrizImp(4,mimatriz);	
           LocateRegistry.createRegistry(1099);
            System.out.println("Registro creado");
            Naming.bind("Matriz", server);
            System.out.println("Server is waiting");

            System.err.println("Server ready");
 
	    	
 
	  
 
	    	while((server.getYa()!= 3) && server.getXa()!=3){
	    			
	    	}
 
    	}catch (Exception e) {
    		System.out.println("[System] Server failed: " + e);
    	}
	}
}
