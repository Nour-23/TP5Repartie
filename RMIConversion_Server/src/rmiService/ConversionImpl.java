package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements IConversion {

//construction mtaa skeleton 
	public ConversionImpl() throws RemoteException {
		super();
		// comme quoi sna3t skeleton
	}

	@Override

	public double convertirMontant(double mt) throws RemoteException {
		// TODO Auto-generated method stub
		return mt * 3.37;
	}

}
