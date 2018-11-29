package org.tt.designpattern.mediator;

/**
 * Définit l'interface d'un collègue.
 */
public abstract class Collegue {

    protected Mediateur mediateur;
    
    /**
     * Constructeur permettant de fixer le médiateur
     * @param pMediateur
     */
    public Collegue(Mediateur pMediateur) {
        mediateur = pMediateur;
    }
    
    public abstract void recevoirMessage(String pMessage);
}
