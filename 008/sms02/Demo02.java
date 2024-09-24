package sms02;

import sms.PrimaryStudent;
import sms.Student;

import java.time.LocalDate;

public class Demo02
{
    public static void main(String[] args)
    {
        StudentManagementSystem02 sms = new StudentManagementSystem02();

        //1.添加学生
        sms.addStudent(new PrimaryStudent(20241316, "a", 77, 81
                , LocalDate.parse("2013-10-12") , "2333323@qq.com"));
        sms.addStudent(new PrimaryStudent(20241327, "b", 95, 88
                , LocalDate.parse("2014-11-12") , "4984sef"));
        sms.addStudent(new PrimaryStudent(20241333, "c", 90, 63
                , LocalDate.parse("2023-10-15") , "758118@163.com"));
        sms.addStudent(new PrimaryStudent(20241335, "d", 71, 83
                , LocalDate.parse("2024-12-12") , "w48sfegseg@126.com"));

        //2.展示所有学生
        System.out.println("-----------展示所有学生-----------");
        sms.showAllStudents();

        //3.更新学生
        System.out.println("-------------更新学生-------------");
        Student oldStudent01 = sms.updateStudentByIndex(2, new PrimaryStudent(20241327, "BXDS", 97, 88
                , LocalDate.parse("2014-11-12"), "4984sef"));
        System.out.println(oldStudent01);

        System.out.println("-----------展示所有学生-----------");
        sms.showAllStudents();

        //4.随机点名
        System.out.println("-------------随机点名-------------");
        System.out.println(sms.randomRollCall());
    }
}
