package jobsDescription.Dao;

import jobsDescription.Entity.Cat;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * - le responsable des loges :
 * sa responsabilité est de gérer les loges des chats.
 * Quels chats y sont, en faire rentrer, en faire sortir.
 */
public class LodgeManagerInterfaceTest {

    LodgeManager lodgeManager = new LodgeManager();

    @Test
    public void whenAddCatInLodgeThenNewCatExisting() {
        // Arrange
        //actual = data what would be in BDD
        Cat cat = new Cat();
        // Act
        this.lodgeManager.addCatInLodge(cat);
        //expected = data just inject in BDD
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenDeleteCatThenCatIsDelete() {
        // Arrange
        //actual = data when to suppress
        Cat cat = new Cat();
        // Act
        this.lodgeManager.deleteCat(cat);
        //expected = data in BDD
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenCatslistPresent() {
        // Arrange
        //actual = data what would be in BDD
        // Act
        List<Cat> catList = this.lodgeManager.catslistPresent();
        // Assert
        assertEquals(catList, actual);
    }
}
