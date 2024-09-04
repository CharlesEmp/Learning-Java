package sms03;

import sms.PrimaryStudent;

import java.time.LocalDate;
import java.util.Collection;

public class Demo03
{
    public static void main(String[] args)
    {
        StudentManagementSystem03 sms = new StudentManagementSystem03();

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
        System.out.println("------展示所有学生------");
        sms.showAllStudents();

        //3.学生是否在系统中存在
        System.out.println("------学生是否在系统中存在------");
        System.out.println(sms.contains(new PrimaryStudent(20241335, "d", 71, 83
                , LocalDate.parse("2024-12-12"), "w48sfegseg@126.com")));

        //4.根据学生学号查找某个学生
        System.out.println("------根据学生学号查找某个学生------");
        System.out.println(sms.findStudentById(20241316));

        //5.求学生某一科目的平均成绩
        System.out.println("------求学生某一科目的平均成绩------");
        System.out.println(sms.getAverageScoreBySubject("数学"));

        //6.根据指定的入学日期获取该入学日期之前入学的学生
        System.out.println("------根据指定的入学日期获取该入学日期之前入学的学生------");
        Collection studentsEnrolledBefore = sms.getStudentsEnrolledBefore("2023-11-23");
        sms.showAllStudents(studentsEnrolledBefore);
    }
}
