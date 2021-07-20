public class StudentDB {

    private Student[] studentArray;

    public StudentDB(Student[] studentArray) {
        this.studentArray = studentArray;
    }

    public Student[] list() {
        return studentArray;
    }

    public String toString() {
        String liste = "";

        for(int i = 0; i < studentArray.length; i++) {
            liste += studentArray[i].getName() + " " + studentArray[i].getId() + "\n";
        }
        return liste;
    }

    public Student randomStudent() {
        studentArray[Math.random()]

        Math.random();

    }
}
