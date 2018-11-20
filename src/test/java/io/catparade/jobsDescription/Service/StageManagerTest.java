package io.catparade.jobsDescription.Service;

import io.catparade.jobsDescription.Dao.LodgeManagerInterface;
import io.catparade.jobsDescription.Entity.Cat;
import org.junit.Test;
import org.mockito.Mock;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;

/**
 * - le régisseur :
 * sa responsabilité est de connaitre le fonctionnement du défilé.
 * Il sait, pour l'instant, donner la liste intégrale des chats qui vont défiler.
 */
public class StageManagerTest {

    private Chaussette chaussette = new Chaussette();
    private Moutarde moutarde = new Moutarde();

    @Mock
    LodgeManagerInterface lodgeManagerDao;

    @Test
    public void whenChaussette(){
        // Arrange
        List<Cat> catList = getDatas();
        when(this.lodgeManagerDao.getCatslistPresent()).thenReturn(catList);
        // Act
        List<Cat> catListResult = this.chaussette.getCatsListPresent();
        // Assert
        assertNotNull(catListResult);
        assertFalse(catListResult.isEmpty());
        assertEquals(catList, catListResult);
    }


    @Test
    public void whenMoutarde(){
        // Arrange
        List<Cat> catList = getDatas();
        when(this.lodgeManagerDao.getCatslistPresent()).thenReturn(catList);
        // Act
        List<Cat> catListResult = this.moutarde.getCatsListPresent();
        // Assert
        assertNotNull(catListResult);
        assertFalse(catListResult.isEmpty());
        assertEquals(catList, catListResult);
    }

    private List<Cat> getDatas(){
        List<Cat> catList = new ArrayList<Cat>();

        Cat cat1 = new Cat();
        cat1.setId(1);
        catList.add(cat1);

        Cat cat2 = new Cat();
        cat2.setId(2);
        catList.add(cat2);

        return catList;
    }
}
