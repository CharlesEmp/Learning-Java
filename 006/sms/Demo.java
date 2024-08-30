package sms;

/*
    测试
*/

import java.time.LocalDate;

public class Demo
{
    public static void main(String[] args)
    {
        //test01();

        //text02();

        //text03();

        //text04();

        StudentManagementSystem sms = new StudentManagementSystem(6);
        sms.addStudent(new PrimaryStudent(20241316, "a", 77, 81
                , LocalDate.parse("2013-10-12") , "2333323@qq.com"));
        sms.addStudent(new PrimaryStudent(20241327, "b", 95, 88
                , LocalDate.parse("2014-11-12") , "4984sef"));
        sms.addStudent(new PrimaryStudent(20241333, "c", 90, 63
                , LocalDate.parse("2023-10-15") , "758118@163.com"));
        sms.addStudent(new PrimaryStudent(20241335, "d", 71, 83
                , LocalDate.parse("2024-12-12") , "w48sfegseg@126.com"));

        sms.showAllStudents();
    }

    private static void text04() {
        StudentManagementSystem sms = new StudentManagementSystem(6);
        sms.addStudent(new PrimaryStudent(20241316, "a", 77, 81
                                            , LocalDate.parse("2013-10-12")));
        sms.addStudent(new PrimaryStudent(20241327, "b", 95, 88
                                            , LocalDate.parse("2014-11-12")));
        sms.addStudent(new PrimaryStudent(20241333, "c", 90, 63
                                            , LocalDate.parse("2023-10-15")));
        sms.addStudent(new PrimaryStudent(20241335, "d", 71, 83
                                            , LocalDate.parse("2024-12-12")));

        Student[] studentsEnrolledBefore = sms.getStudentsEnrolledBefore("2023-11-01");
        sms.showAllStudents(studentsEnrolledBefore);

        System.out.println("-----------------");

        Student[] studentsEnrolledAfter = sms.getStudentsEnrolledAfter("2014-11-12");
        sms.showAllStudents(studentsEnrolledAfter);
    }

    private static void text03() {
        StudentManagementSystem sms = new StudentManagementSystem(6);
        sms.addStudent(new MidStudent(20242477, "A", 88, 62 , 90 , 81));
        sms.addStudent(new MidStudent(20242489, "B", 99, 54 , 76 , 88));

        System.out.println(sms.contains(new MidStudent(20242489, "B", 99, 54, 76, 88)));
        System.out.println(sms.contains(new MidStudent(20242489, "C", 99, 54, 76, 88)));
    }

    private static void text02() {
        StudentManagementSystem sms = new StudentManagementSystem(6);
        sms.addStudent(new MidStudent(20242477, "A", 88, 62 , 90 , 81));
        sms.addStudent(new MidStudent(20242489, "B", 99, 54 , 76 , 88));
        sms.addStudent(new MidStudent(20242491, "C", 82, 49 , 84 , 92));
        sms.addStudent(new MidStudent(20242497, "D", 75, 63 , 96 , 100));

        System.out.println("--------所有中学生信息--------");
        sms.showAllStudents();

        System.out.println("--------中学生历史均分--------");
        System.out.println(sms.getAverageScoreBySubject("历史"));

        System.out.println("--------中学生总分排序--------");
        sms.sortByTotalScore();//先排序
        sms.showAllStudents();

        System.out.println("--------根据学号查信息--------");
        Student studentById = sms.findStudentById(20242497);
        System.out.println(studentById);
    }

    private static void test01() {
        StudentManagementSystem sms = new StudentManagementSystem(6);
        sms.addStudent(new PrimaryStudent(20241316, "a", 77, 81));
        sms.addStudent(new PrimaryStudent(20241327, "b", 95, 88));
        sms.addStudent(new PrimaryStudent(20241333, "c", 90, 63));
        sms.addStudent(new PrimaryStudent(20241335, "d", 71, 83));

        System.out.println("--------所有小学生信息--------");
        sms.showAllStudents();

        System.out.println("--------小学生数学最高--------");
        Student studentWithHighestScore = sms.findStudentWithHighestScore("数学");
        System.out.println(studentWithHighestScore);

        System.out.println("--------小学生语文最低--------");
        Student studentWithWithLowestScore = sms.findStudentWithLowestScore("语文");
        System.out.println(studentWithWithLowestScore);
    }
}
