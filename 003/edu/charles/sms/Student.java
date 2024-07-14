package edu.charles.sms;

public class Student 
{
    private int studentId;//学号

    private String name;

    private int chineseScore;//语文成绩

    private int mathScore;//数学成绩

    public Student(int studentId, String name, int chineseScore, int mathScore)
    {
        this.studentId = studentId;
        this.name = name;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
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

    //求学生总成绩
    public int getTotalScore()
    {
        return chineseScore + mathScore;
    }

    //展示学生信息使用该方法 -- 拼接所有学生属性
    public String toString()
    {
        return studentId + " " + name + " " + chineseScore + " " + mathScore + " " + getTotalScore();
    }

}
