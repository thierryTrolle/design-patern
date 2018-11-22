package org.tt.designpattern.singleton;

/*
 * Implémentation simple d'un singleton.
 * Le singleton est surtout représenté par son constructeur privée 
 * Cette methode est thread safe car instance est static et donc créer au demarage de l'applicatif
 */
public class SingletonBasic {
	
	private static SingletonBasic instance=new SingletonBasic();
	
	private SingletonBasic() {
		
	}
	
	public static SingletonBasic getInstance() {
		return instance;
	}

}
