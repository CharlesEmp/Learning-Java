package sms;

import java.time.LocalDate;

//小学生类
public class PrimaryStudent extends Student
{
    public PrimaryStudent(int studentId, String name, int chineseScore, int mathScore, LocalDate enrollmentDate, String email)
    {
        super(studentId, name, chineseScore, mathScore, enrollmentDate, email);
    }

    public PrimaryStudent(int studentId, String name, int chineseScore, int mathScore, LocalDate enrollmentDate)
    {
        super(studentId, name, chineseScore, mathScore, enrollmentDate);
    }

    public PrimaryStudent(int studentId, String name, int chineseScore, int mathScore)
    {
        super(studentId, name, chineseScore, mathScore);
    }
}
