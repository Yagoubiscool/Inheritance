import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    void testFullName() {
        Person person = new Person(
                "John", "Smith", "P001", "Mr.", 2000
        );

        assertEquals("John Smith", person.fullName());
    }

    @Test
    void testFormalName() {
        Person person = new Person(
                "John", "Smith", "P001", "Mr.", 2000
        );

        assertEquals("Mr. John Smith", person.formalName());
    }

    @Test
    void testGetAge() {
        Person person = new Person(
                "John", "Smith", "P001", "Mr.", 2000
        );

        assertEquals("25", person.getAge(2025));
    }

    @Test
    void testCSV() {
        Person person = new Person(
                "John", "Smith", "P001", "Mr.", 2000
        );

        assertEquals(
                "John,Smith,P001,Mr.,2000",
                person.toCSV()
        );
    }

    @Test
    void testGetters() {
        Person person = new Person(
                "John", "Smith", "P001", "Mr.", 2000
        );

        assertEquals("John", person.getFirstName());
        assertEquals("Smith", person.getLastName());
        assertEquals("P001", person.getID());
        assertEquals("Mr.", person.getTitle());
        assertEquals(2000, person.getYOB());
    }
}