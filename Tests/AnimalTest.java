import Animals.Cat;
import Animals.Gender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest
{
    @Test
    public void nameTest()
    {
        String firstName = "Ozzy";
        String changedName = "Bozzy";

        Cat cat1 = new Cat(firstName, Gender.Male, "Krabt aan het behang");

        assertEquals(firstName, cat1.getName());

        cat1.setName(changedName);

        assertEquals(changedName, cat1.getName());
        assertNotEquals(firstName, cat1.getName());
    }
}