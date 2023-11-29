package rmiClient;

import rmiService.IBanque;
import metier.Compte;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BanqueClient {

    public static void main(String[] args) {
        try {
            // Obtention du registre RMI sur le port 1099 (le même que le serveur)
            Registry registry = LocateRegistry.getRegistry("localhost", 1098);

            // Récupération du service distant IBanque
            IBanque banque = (IBanque) registry.lookup("BanqueService");

            // Utilisation des services distants
            Compte nouveauCompte = new Compte(123, 1000.0, null);
            String resultatCreation = banque.creerCompte(nouveauCompte);
            System.out.println(resultatCreation);

            int codeCompte = 123; // Remplacez par un code de compte réel
            String infoCompte = banque.getInfoCompte(codeCompte);
            System.out.println(infoCompte);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
