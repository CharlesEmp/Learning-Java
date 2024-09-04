package sms;

import java.time.LocalDate;
import java.util.Random;

//学生管理系统类
/*
    1.能够展示所有的学生信息
    2.能够获取小学生或初中生某个学科最高成绩的学生信息
    3.能够获取小学生或初中生某个学科最低成绩的学生信息
    4.能够获取小学生或初中生某一科目成绩的平均分
    5.能够获取小学生或初中生总成绩从高到低显示学生信息
    6.能够根据学生的学号查询学生信息

    1.学生信息管理系统能够查询指定日期之前(包含指定日期)入学的学生信息
    2.学生信息管理系统能够查询指定日期之后(包含指定日期)入学的学生信息

    1.添加一个随机点名功能，最终返回随机点到的学生对象
*/
public class StudentManagementSystem02
{
    //定义一个student类型的数组
    private Student[] students;

    //定义一个计数器，记录存储的student数量
    private int count = 0;

    public StudentManagementSystem02(int capacity)
    {
        //capacity 代表数组容量
        //将来传递一个整数，就代表开辟数组空间
        this.students = new Student[capacity];
    }

    //判断系统中是否存在该学生（如果存在姓名，就认为该学生在系统中存在）
    public boolean contains(Student stu)
    {
        if (stu == null)
        {
            return false;
        }
        for (int i = 0; i < students.length; i++)
        {
           Student student =students[i];
            if (student != null && student.equals(stu))
            {
                return true;
            }
        }
        return false;//系统（数组）中所有的姓名和该学生均不相同，代表不存在
    }

    //添加学生
    public void addStudent(Student student)
    {
        if (validateStudentEmail(student))
        {
            for (int i = 0; i < students.length; i++) {
                //如果数组中的元素为null，则代表该位置还没有存储学生对象，可以使用
                if (students[i] == null)
                {
                    students[i] = student;
                    count++;//存储学生信息同时，记录已存入的学生数量
                    break;//一旦将学生信息存储到数组的某个位置，就直接中断循环（没必要再找空位）
                }
            }
        }
        else
        {
            System.out.println("学号：" + student.getName() + "，邮箱：" + student.getEmail() + "，不符合邮箱格式，添加失败！");
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

/*---------------------------------------------------------------------------------------------------------------*/
    /**
     *
     * @param students 指定一个数组
     * @param student   向指定数组中添加元素
     */
    public void addStudent(Student[] students , Student student)
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

    /**
     * 求在指定日期之前入学的学生
     *
     * @param date 指定日期
     * @return  装满指定条件的学生信息数组
     */
    //如果返回值有多个，我们可以考虑将多个返回值封装到一个容器中，然后返回该容器
    public Student[] getStudentsEnrolledBefore(String date)
    {
        //1.定义一个数组，该数组专门用来存放满足条件的学生信息
        Student[] temps = new Student[students.length];

        //2.遍历每个学生，逐个判断 如果该学生入学日期在指定日期之前，则将该学生存入temps数组中
        for (int i = 0; i < students.length; i++)
        {
            Student student = students[i];
            if (student != null && student.getEnrollmentDate() != null)
            {
                if (student.getEnrollmentDate().isBefore(LocalDate.parse(date))
                        || student.getEnrollmentDate().isEqual(LocalDate.parse(date)))
                //LocalDate.parse（date）如果不指定默认格式，按照 年-月-日 格式解析

                {
                    //将满足条件的当前数组添加到temps临时数组里
                    addStudent(temps , student);
                }
            }
        }
        return temps;
    }

    /**
     * 求在指定日期之后入学的学生
     *
     * @param date 指定日期
     * @return  装满指定条件的学生信息数组
     */
    public Student[] getStudentsEnrolledAfter(String date)
    {
        //1.定义一个数组，该数组专门用来存放满足条件的学生信息
        Student[] temps = new Student[students.length];

        //2.遍历每个学生，逐个判断 如果该学生入学日期在指定日期之前，则将该学生存入temps数组中
        for (int i = 0; i < students.length; i++)
        {
            Student student = students[i];
            if (student != null && student.getEnrollmentDate() != null)
            {
                if (student.getEnrollmentDate().isAfter(LocalDate.parse(date))
                        || student.getEnrollmentDate().isEqual(LocalDate.parse(date)))
                //LocalDate.parse（date）如果不指定默认格式，按照 年-月-日 格式解析

                {
                    //将满足条件的当前数组添加到temps临时数组里
                    addStudent(temps , student);
                }
            }
        }
        return temps;
    }

    //展示指定数组中的学生信息
    public void showAllStudents(Student[] students)
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

/*---------------------------------------------------------------------------------------------------------------*/

    /**校验邮箱
     *
     * @param student 学生对象
     * @return 学生邮箱校验结果
     */
    public boolean validateStudentEmail (Student student)
    {
        //1.健壮性判断（防空项）
        if (student == null || student.getEmail() == null)
        {
            return false;
        }
        else
        {
            //邮箱匹配判断
            return student.getEmail().matches("\\w+@\\w+\\.\\w+");
        }
    }

/*---------------------------------------------------------------------------------------------------------------*/

    /**
     *
     * @return返回随机抽取到的学生
     */
    public Student randomRollCall()
    {
        return students[new Random().nextInt(count)];
    }
}


