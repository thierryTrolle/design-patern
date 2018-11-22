package org.tt.designpattern.singleton;

/**
 * Implémentation d'un singleton avec chargement paresseuse de la resources
 * L'instance est crée seulement à l'appel du singleton car peut etre que l'on a pas besoin de la ressources.
 * Cette methode est thread safe car le créateur de l'instance est static(technique HOLDER). 
 * C'est la meilleur methode car les technique synchronize sont tres couteuses.
 */
public class SingletonLazy {
	
	/** Constructeur privé */  
    private SingletonLazy(){}
     
    /** Holder */
    private static class SingletonHolder
    {       
        /** Instance unique non préinitialisée */
        private final static SingletonLazy instance = new SingletonLazy();
    }
 
    /** Point d'accès pour l'instance unique du singleton */
    public static SingletonLazy getInstance()
    {
        return SingletonHolder.instance;
    }
}
