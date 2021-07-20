import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    @DisplayName("check student list")
    public void checkList() {
        // given
        Student[] studentArray = new Student[3];
        studentArray[0] = new Student("Peter", 123);
        studentArray[1] = new Student("Peter", 123);
        studentArray[2] = new Student("Peter", 123);
        StudentDB testDB = new StudentDB(studentArray);

        // when
        Student[] actual = testDB.list();

        // then
        assertArrayEquals(studentArray, actual);
    }

    @Test
    @DisplayName("check student list to String")
    public void checkString() {
        // given
        Student[] studentArray = new Student[3];
        studentArray[0] = new Student("Peter", 123);
        studentArray[1] = new Student("Peter", 123);
        studentArray[2] = new Student("Peter", 123);
        StudentDB testDB = new StudentDB(studentArray);

        // when
        String actual = testDB.toString();

        // then
        assertEquals("Peter 123\nPeter 123\nPeter 123\n" , actual);
    }


}