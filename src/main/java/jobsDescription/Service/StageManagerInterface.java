package jobsDescription.Service;

import jobsDescription.Entity.Cat;

import java.util.List;

/**
 * - le régisseur :
 * sa responsabilité est de connaitre le fonctionnement du défilé.
 * Il sait, pour l'instant, donner la liste intégrale des chats qui vont défiler.
 */
interface StageManagerInterface {

    /**
     * demander la liste des chats présent et la restituer à celui qui la lui a demandé
     */
    public List<Cat> getCatsListPresent();
}