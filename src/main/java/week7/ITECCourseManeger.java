package week7;

import java.util.ArrayList;


/**
 * Not an object oriented program.
 */
public class ITECCourseManeger {

    public static void main(String[] args) {

        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310,20);



        //Add some students.   TODO check that we have not exceeded the max number for the class
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.removeStudent("Carl");
        maintenanceCourse.removeStudent("Bob");
        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30);


        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();


        ITECCourse softwareDev = new ITECCourse("Software Development Projects", 2903, 24);
        softwareDev.addStudent("Gus");
        softwareDev.addStudent("Harry");
        softwareDev.addStudent("Izzy");

        softwareDev.writeCourseInfo();

        ITECCourse smallCourse = new ITECCourse("Made up course", 1234, 3);
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        smallCourse.addStudent("Miriam");
        smallCourse.addStudent("Nita");

        smallCourse.writeCourseInfo();
    }
}
