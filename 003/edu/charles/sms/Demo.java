package edu.charles.sms;

/*
    测试
*/

public class Demo
{
    public static void main(String[] args)
    {
        //test01();

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
        System.out.println(studentWithHighestScore.toString());

        System.out.println("--------小学生语文最低--------");
        Student studentWithWithLowestScore = sms.findStudentWithLowestScore("语文");
        System.out.println(studentWithWithLowestScore.toString());
    }
}
