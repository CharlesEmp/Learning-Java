package sms;

import java.time.LocalDate;

//中学生类
public class MidStudent extends Student implements EveningStudy
{
    private int historyScore;//历史成绩

    private int physicsScore;//物理成绩

    public MidStudent(int studentId, String name, int chineseScore, int mathScore, LocalDate enrollmentDate, String email, int historyScore, int physicsScore)
    {
        super(studentId, name, chineseScore, mathScore, enrollmentDate, email);
        this.historyScore = historyScore;
        this.physicsScore = physicsScore;
    }

    public MidStudent(int studentId, String name, int chineseScore, int mathScore, LocalDate enrollmentDate, int historyScore, int physicsScore)
    {
        super(studentId, name, chineseScore, mathScore, enrollmentDate);
        this.historyScore = historyScore;
        this.physicsScore = physicsScore;
    }

    public MidStudent(int studentId, String name, int chineseScore, int mathScore, int historyScore, int physicsScore)
    {
        super(studentId, name, chineseScore, mathScore);
        this.historyScore = historyScore;
        this.physicsScore = physicsScore;
    }

    /*public MidStudent(int studentId, String name, int chineseScore, int mathScore)
    {
        super(studentId, name, chineseScore, mathScore);
    }*/

    public int getHistoryScore()
    {
        return historyScore;
    }

    public void setHistoryScore(int historyScore)
    {
        this.historyScore = historyScore;
    }

    public int getPhysicsScore()
    {
        return physicsScore;
    }

    public void setPhysicsScore(int physicsScore)
    {
        this.physicsScore = physicsScore;
    }

    //重写上晚自习方法
    @Override
    public void eveningStudy()
    {
        System.out.println("中学生" + getName() + "正在上晚自习");
    }

    //中学生的总成绩
    @Override
    public int getTotalScore()
    {
        return super.getTotalScore() + historyScore + physicsScore;
    }

    @Override
    public String toString()
    {
        return getStudentId() + " " + getName() + " " + getChineseScore() + " " + getMathScore() + " "
                + getHistoryScore() + " " + getPhysicsScore() + " " + getEmail() + " " + getEnrollmentDate() + " " + getTotalScore();
    }
}
