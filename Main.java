import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> studentsSet = new HashSet<>();
    studentsSet.add(new Student("Иван","A-23",2,List.of(5,5,4,5)));
    studentsSet.add(new Student("Андрей","A-13",1,List.of(5,4,3,4)));
    studentsSet.add(new Student("Игорь","A-14",1,List.of(4,3,3,4)));
    studentsSet.add(new Student("Данила","A-31",3,List.of(3,4,5,3)));
    studentsSet.add(new Student("Константин","A-32",3,List.of(3,3,2,2)));

        System.out.println("Все студенты:");
        for (Student student : studentsSet) {
            System.out.println(student);
        }
        Student.removeStudents(studentsSet);
        System.out.println("\nСтуденты после удаления:");
        for (Student student : studentsSet) {
            System.out.println(student);
        }
        Student.promoteStudent(studentsSet);
        System.out.println("\nСтуденты после перевода:");
        for (Student student : studentsSet) {
            System.out.println(student);
        }
        Student.printStudents(studentsSet,2);
    }
}
