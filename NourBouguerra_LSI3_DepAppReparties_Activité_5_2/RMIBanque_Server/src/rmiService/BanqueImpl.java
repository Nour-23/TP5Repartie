package rmiService;

import metier.Compte;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BanqueImpl extends UnicastRemoteObject implements IBanque {

    public BanqueImpl() throws RemoteException {
        super();
    }



    @Override
    public String getInfoCompte(int code) {
        // Implémentez la récupération d'informations du compte ici
        return "Informations du compte avec le code " + code;
    }

	@Override
	public String creerCompte(Compte c) {
		  return "Le compte a été créé avec succès.";
	}
}
