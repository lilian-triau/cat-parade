package io.catparade.jobsDescription.Dao;

import io.catparade.jobsDescription.Entity.Cat;

import java.util.List;

/**
 * - le responsable des loges :
 * sa responsabilité est de gérer les loges des chats.
 * Quels chats y sont, en faire rentrer, en faire sortir.
 */
public interface LodgeManagerInterface {

    /**
     * ajouter un chat dans les loges
     */
    public void addCatInLodge(Cat cat);

    /**
     * supprimer un chat
     */
    public void deleteCat(Cat cat);

    /**
     * lister les chats présents
     */
    public List<Cat> getCatslistPresent();


}
