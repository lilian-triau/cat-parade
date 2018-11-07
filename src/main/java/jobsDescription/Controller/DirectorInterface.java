package jobsDescription.Controller;

import jobsDescription.Entity.Cat;

import java.util.List;

/**
 * - le metteur en scène :
 * sa responsabilité est de présenter les chats d'une scène.
 * Il demande la liste des chats participant à un défilé au régisseur et les présente aux spectateurs.
 */
interface DirectorInterface {

    /**
     * demander la liste des chats présent au régisseur et la restituer à celui qui la lui a demandé
     */
    public List<Cat> getCatsListPresent();
}
