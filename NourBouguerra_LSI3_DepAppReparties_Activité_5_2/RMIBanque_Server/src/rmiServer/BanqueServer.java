
package rmiServer;

import rmiService.BanqueImpl;
import rmiService.IBanque;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BanqueServer {

	public static void main(String[] args) {
		try {
			// Cr�ation de l'impl�mentation du service bancaire
			IBanque banqueImpl = new BanqueImpl();

			// Cr�ation du registre RMI sur le port 1099
			Registry registry = LocateRegistry.createRegistry(1098);

			// Enregistrement du service sous le nom "BanqueService"
			registry.rebind("BanqueService", (Remote) banqueImpl);

			System.out.println("Serveur pr�t.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
