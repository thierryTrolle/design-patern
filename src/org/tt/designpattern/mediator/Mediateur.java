package org.tt.designpattern.mediator;

/**
 * Définit l'interface d'un médiateur.
 * Réalise la transmission de l'information.
 */
public interface Mediateur {

    // Méthodes permettant les collègues
    public void setCollegueA(ConcreteCollegueA pCollegueA);
    public void setCollegueB(ConcreteCollegueB pCollegueB);
    
    // Méthodes permettant de transmettre des messages
    public void transmettreMessageFromA(String pMessage);
    public void transmettreMessageFromB(String pMessage);
}
