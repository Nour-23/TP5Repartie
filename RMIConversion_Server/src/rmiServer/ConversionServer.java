package rmiServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import rmiService.ConversionImpl;

public class ConversionServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			LocateRegistry.createRegistry(1099);
			ConversionImpl od = new ConversionImpl(); // od va jouer le role de skeleton et unicastremote
			System.out.println(od.toString());
			Naming.rebind("rmi//localhost:1099/OD", od);
			// rebind bsh thadher url w bsh tabaath l skeleton url,port,reference w od eli
			// howa skeleton

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
