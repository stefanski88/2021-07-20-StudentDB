import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("ConstructorTest")
    public void testConstruktor() {
        // given
        String name = "Peter Parker";
        int id = 14242;
        // when
        Student student1 = new Student(name, id);
        // then
        assertEquals(student1.getName(), name);
        assertEquals(student1.getId(), id);
    }







}