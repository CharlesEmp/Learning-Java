package sms;

import java.time.LocalDate;
import java.util.Objects;

public class Student
{
    private int studentId;//学号

    private String name;//姓名

    private int chineseScore;//语文成绩

    private int mathScore;//数学成绩

    private LocalDate enrollmentDate;//学生的入学时间


    public Student(int studentId, String name, int chineseScore, int mathScore, LocalDate enrollmentDate) {
        this.studentId = studentId;
        this.name = name;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
        this.enrollmentDate = enrollmentDate;
    }

    public Student(int studentId, String name, int chineseScore, int mathScore)
    {
        this(studentId , name , chineseScore , mathScore , LocalDate.now());
    }

    public int getStudentId()
    {
        return studentId;
    }

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getChineseScore()
    {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore)
    {
        this.chineseScore = chineseScore;
    }

    public int getMathScore()
    {
        return mathScore;
    }

    public void setMathScore(int mathScore)
    {
        this.mathScore = mathScore;
    }

    public LocalDate getEnrollmentDate()
    {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate)
    {
        this.enrollmentDate = enrollmentDate;
    }

    //求学生总成绩
    public int getTotalScore()
    {
        return chineseScore + mathScore;
    }

    //展示学生信息使用该方法 -- 拼接所有学生属性
    public String toString()
    {
        return studentId + " " + name + " " + chineseScore + " " + mathScore + " " + enrollmentDate + " " + getTotalScore();
    }

    //
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(name, student.name);
    }

}
