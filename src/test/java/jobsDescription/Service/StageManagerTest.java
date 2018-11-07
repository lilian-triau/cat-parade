package jobsDescription.Service;

import jobsDescription.Entity.Cat;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * - le régisseur :
 * sa responsabilité est de connaitre le fonctionnement du défilé.
 * Il sait, pour l'instant, donner la liste intégrale des chats qui vont défiler.
 */
public class StageManagerTest {

    StageManager stageManager = new StageManager();

    @Test
    public void getCatsListPresent(){
        // Arrange
        //String expected = list de cat;
        // Act
        List<Cat> catList = this.stageManager.getCatsListPresent();
        // Assert
        assertEquals(expected, catList);
    }
}
