package com.webservice.client.clientsample;

import com.webservice.client.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        OperacionesImplService service1 = new OperacionesImplService();
	        System.out.println("Create Web Service...");
	        IOperaciones port1 = service1.getOperacionesImplPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.suma(10, 30));
	        System.out.println("Server said: " + port1.resta(50, 20));
	        System.out.println("Server said: " + port1.divide(100, 50));
	        System.out.println("Server said: " + port1.multiplica(3, 3));
	        System.out.println("Create Web Service...");
	        IOperaciones port2 = service1.getOperacionesImplPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.suma(20, 30));
	        System.out.println("Server said: " + port2.resta(60, 20));
	        System.out.println("Server said: " + port2.divide(120, 40));
	        System.out.println("Server said: " + port2.multiplica(4, 4));
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
