package edu.charles.sms;

//学生管理系统类
/*
    1.能够展示所有的学生信息
    2.能够获取小学生或初中生某个学科最高成绩的学生信息
    3.能够获取小学生或初中生某个学科最低成绩的学生信息
    4.能够获取小学生或初中生某一科目成绩的平均分
    5.能够获取小学生或初中生总成绩从高到低显示学生信息
    6.能够根据学生的学号查询学生信息
*/
public class StudentManagementSystem 
{
    //定义一个student类型的数组
    private Student[] students;

    public StudentManagementSystem(int capacity)
    {
        //capacity 代表数组容量
        //将来传递一个证书，就代表开辟数组空间
        this.students = new Student[capacity];
    }

    //添加学生
    public void addStudent(Student student)
    {
        for (int i = 0; i < students.length; i++)
        {
            //如果数组中的元素为null，则代表该位置还没有存储学生对象，可以使用
            if (students[i] == null)
            {
                students[i] = student;
                break;//一旦将学生信息存储到数组的某个位置，就直接中断循环（没必要再找空位）
            }
        }
    }

    //展示所有学生信息
    public void showAllStudents()
    {
        for (int i = 0; i < students.length; i++)
        {
            Student student = students[i];
            if (student != null) //防止空指针异常
            {
                System.out.println((i + 1) + " " + student.toString());
            }

        }
    }

    //subject 指定科目 例如：语文
    //返回指定科目的最高成绩的学生信息
    public Student findStudentWithHighestScore (String subject)
    {
        int highestScore = 0;
        Student studentWithHighestScore = null;
        for (int i = 0; i < students.length; i++)
        {
            Student student = students[i];
            if (student != null)
            {
                int score = getScoreBySubject(student , subject);//用score存储数组中当前学生的某一门成绩
                if (score > highestScore)
                {
                    highestScore = score;
                    studentWithHighestScore = student;
                }
            }
        }
        return studentWithHighestScore;//返回最高成绩的学生信息
    }

    //返回指定科目的最低成绩的学生信息
    public Student findStudentWithLowestScore (String subject)
    {
        int lowestScore = Integer.MAX_VALUE;//整数变量最大值
        Student studentWithLowestScore = null;
        for (int i = 0; i < students.length; i++)
        {
            Student student = students[i];
            if (student != null)
            {
                int score = getScoreBySubject(student , subject);//用score存储数组中当前学生的某一门成绩
                if (score < lowestScore)
                {
                    lowestScore = score;
                    studentWithLowestScore = student;
                }
            }
        }
        return studentWithLowestScore;//返回最高成绩的学生信息
    }

    //返回指定科目成绩的平均分
    public int getAverageScoreBySubject (String subject)
    {
        int totalScore = 0;//对所有学生的某一科目成绩进行累加求和
        int count = 0;//统计数组已存储的学生数量
        for (int i = 0; i < students.length; i++)
        {
            Student student = students[i];
            if (student != null)
            {
                int score = getScoreBySubject(student , subject);
                totalScore += score;
                count++;
            }
        }
        //如果count 为0，代表数组里没存，则为0
        return count == 0 ? 0 : totalScore / count;
    }

    //根据学生的总分数进行从高到低排序
    public void sortByTotalScore ()
    {
        for (int i = 0; i < students.length - 1; i++)
        {
            for (int j = 0; j < students.length - i - 1; j++)
            {
                if (students[j] != null && students[j + 1] != null)
                {
                    if (students[j].getTotalScore() < students[j + 1].getTotalScore())
                    {
                        Student temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                    }
                }
            }
        }
    }

    //根据学生的学号查询学生信息
    public Student findStudentById (int studentID)
    {
        for (int i = 0; i < students.length; i++)
        {
            Student student = students[i];
            if (students != null && student.getStudentId() == studentID) //如果当前学生存在，并且当前学生的学号等于要查找的学号
            {
               return student;
            }
        }

        return null;//如果程序执行到该位置，说明所有的学生给你都不满足学号（找不到学号为studentid的学生，返回null）
    }

    /**
     *
     * @param student 学生对象
     * @param subject 科目名称
     * @return        当前学生指定科目的成绩
     */
    private int getScoreBySubject(Student student, String subject)
    {
        /*switch (subject)
        {
            case "语文":
                return student.getChineseScore();
            case "数学":
                return student.getMathScore();
            case "历史":
                if (student instanceof MidStudent)
                {
                    MidStudent ms = (MidStudent) student;
                    return ms.getHistoryScore();
                }
                else
                {
                    return 0;
                }
            case "物理":
                if (student instanceof MidStudent)
                {
                    MidStudent ms = (MidStudent) student;
                    return ms.getPhysicsScore();
                }
                else
                {
                    return 0;
                }
            default:
                return 0;
        }*/

        switch (subject)
        {
            case "语文" ->
            {
                return student.getChineseScore();
            }
            case "数学" ->
            {
                return student.getMathScore();
            }
            case "历史" ->
            {
                if(student instanceof MidStudent midStudent)
                {
                    return midStudent.getHistoryScore();
                }
            }
            case "物理" ->
            {
                if(student instanceof MidStudent midStudent)
                {
                    return midStudent.getPhysicsScore();
                }
            }
        }

        //传递的subject不属于 语文 数学 物理 历史 中的任何一种，直接返回0
        return 0;
    }

}
