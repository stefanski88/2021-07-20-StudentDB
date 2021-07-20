public class StudentDB {

    public static void main(String[] args) {

        Student student1 = new Student("Lars", 321);
        Student student2 = new Student("Peter", 341);
        Student student3 = new Student("Michael", 999);

        Student[] newStudent = new Student[3];

        newStudent[0] = student1;
        newStudent[1] = student2;
        newStudent[2] = student3;


    }

    private Student[] studentArray;

    public StudentDB(Student[] studentArray) {
        this.studentArray = studentArray;
    }

    public Student[] list() {
        //ist gleich mit getter Methode für Arrays und gibt studentArray zurück
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

        int randomNumber = (int)Math.random() * studentArray.length;

        return studentArray[randomNumber];
    }

    public void add(Student newStudent){
        Student[] newStudentArray = new Student[studentArray.length + 1];
        for (int i = 0; i < studentArray.length; i++) {
            newStudentArray[i] = studentArray[i];
        }
        newStudentArray[studentArray.length] = newStudent;
        studentArray = newStudentArray;
    }

    public void remove(String name) {
        Student[] newStudentArray = new Student[studentArray.length -1];
        int counter = 0;
        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i].getName().equals(name)){
                continue;
            }
            newStudentArray[counter] = studentArray[i];
            counter ++;
        }
        studentArray = newStudentArray;
    }
}
