
package rmiServer;

import rmiService.BanqueImpl;
import rmiService.IBanque;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BanqueServer {

	public static void main(String[] args) {
		try {
			// Création de l'implémentation du service bancaire
			IBanque banqueImpl = new BanqueImpl();

			// Création du registre RMI sur le port 1099
			Registry registry = LocateRegistry.createRegistry(1098);

			// Enregistrement du service sous le nom "BanqueService"
			registry.rebind("BanqueService", (Remote) banqueImpl);

			System.out.println("Serveur prêt.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
