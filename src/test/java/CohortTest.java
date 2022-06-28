import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {

    Cohort cohort = new Cohort();

    @Before
    public void setup(){
        Student mark = new Student(1L, "mark");
        Student nia = new Student(2L, "nia");
        Student kenny = new Student(3L, "kenny");

        cohort.addStudent(mark);
        cohort.addStudent(nia);
        cohort.addStudent(kenny);

    }

//    cohort can add a student through a list of students
    @Test
    public void testCohortAddStudentToList(){
//        Cohort cohort = new Cohort();
//        Student name = new Student(1L, "Jenny");
//        cohort.addStudent(name);

        assertSame(3, cohort.getStudents().size());
    }

//        Cohort can get the current list of students
        @Test
    public void testCohortCanGetCurrentListOfStudents(){
//        Cohort cohort = new Cohort();
//        Student mark = new Student(1L, "mark");
//        Student nia = new Student(1l, "nia");
//
//        cohort.addStudent(mark);
//        cohort.addStudent(nia);

        assertSame("mark", cohort.getStudents().get(0).getName());
        assertSame("nia", cohort.getStudents().get(1).getName());

        }

//        cohort gets average and calculates it correctly
        @Test
    public void testCohortGetAverageCalculateCorrectly(){
            assertEquals(0.0, cohort.getCohortAverage(), 0);


            Student alex = new Student(4L, "alex");

            alex.addGrade(100);
            alex.addGrade(50);
            alex.addGrade(50);

            cohort.addStudent(alex);

            assertEquals(66.6, alex.getGradeAverage(), .07);

            assertEquals(16.66, cohort.getCohortAverage(),.07);

        }

}


