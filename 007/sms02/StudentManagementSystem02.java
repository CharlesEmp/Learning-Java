package sms02;

import sms.MidStudent;
import sms.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

//学生管理系统类
/*
    new：
    利用Collection重构学生信息管理系统，重构一下功能
        1.添加学生
        2.添加的学生必须具备邮箱并且符合邮箱格式
        3.显示系统中所有的学生
        4.判断某个学生在系统中是否存在（根据学生姓名判断）
        5.根据学生学号查找某个学生
        6.求学生的平均成绩
        7.根据指定的入学日期获取该入学日期之前入学的学生
        8.根据指定的入学日期获取该入学日期之前入学的学生

    使用collection重构
*/
public class StudentManagementSystem02 {
    //定义一个集合存储学生元素
    private Collection students = new ArrayList();

    //定义一个计数器，记录存储的student数量
    //private int count = 0;
    //集合中已有一个方法size()直接获取存储个数

    /**添加学生
     *
     * @param student
     */
    public void addStudent(Student student)
    {
        if (student != null && validateStudentEmail(student))
        {
            students.add(student);
        }
        else
        {
            System.out.println("学号：" + student.getName() + "，邮箱：" + student.getEmail() + "，不符合邮箱格式，添加失败！");
        }
    }

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

    /**遍历指定容器中的学生
     *
     * @param students
     */
    public void showAllStudents(Collection students)
    {
        int i = 1;
        for (Object student : students)
        {
            //在添加元素的时候已经做了非空判断，就无需再次判断非空
            System.out.println((i++) + " " + student);
        }
    }

    /**遍历容器中的学生
     */
    public void showAllStudents( )
    {
        showAllStudents(students);
    }

    /**判断系统中是否存在该学生（如果存在姓名，就认为该学生在系统中存在）
     *
     * @param stu
     * @return
     */
    public boolean contains(Student stu)
    {
        return students.contains(stu);
    }

    /**根据学生的学号查询学生信息
     *
     * @param studentID
     * @return
     */
    public Student findStudentById (int studentID)
    {
        for (Object student : students)
        {
            /*
            if (student instanceof Student stu)
            {
                if (stu != null && stu.getStudentId() == studentID) //如果当前学生存在，并且当前学生的学号等于要查找的学号
                {
                    return stu;
                }
            }
            */

            if (student instanceof Student stu && stu.getStudentId() == studentID) //如果当前学生存在，并且当前学生的学号等于要查找的学号
            {
                return stu;
            }
        }

        return null;//如果程序执行到该位置，说明所有的学生给你都不满足学号（找不到学号为studentid的学生，返回null）
    }

    /**返回指定科目成绩的平均分
     *
     * @param subject
     * @return
     */
    public int getAverageScoreBySubject (String subject)
    {
        int totalScore = 0;//对所有学生的某一科目成绩进行累加求和
        for (Object student : students)
        {
            if (student instanceof Student stu)
            {
                int score = getScoreBySubject(stu, subject);
                totalScore += score;
            }
        }
        //如果count 为0，代表数组里没存，则为0
        return students.size() == 0 ? 0 : totalScore / students.size();
    }

    /**按科目获得分数
     *
     * @param student
     * @param subject
     * @return
     */
    private int getScoreBySubject(Student student, String subject)
    {
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

    /**求在指定日期之后入学的学生
     *
     * @param date 指定日期
     * @return  存储了满足条件的学生信息的集合
     */
    public Collection getStudentsEnrolledAfter(String date)
    {
        //1.定义一个集合，该集合专门用来存放满足条件的学生信息
        Collection temps = new ArrayList();

        //2.遍历每个学生，逐个判断 如果该学生入学日期在指定日期之前，则将该学生存入temps集合中
        for (Object student : students)
        {
            if (student instanceof Student stu && stu.getEnrollmentDate() != null)
            {
                if (stu.getEnrollmentDate().isAfter(LocalDate.parse(date))
                        || stu.getEnrollmentDate().isEqual(LocalDate.parse(date)))
                //LocalDate.parse（date）如果不指定默认格式，按照 年-月-日 格式解析

                {
                    //将满足条件的当前数组添加到temps临时数组里
                    temps.add(stu);
                }
            }
        }
        return temps;
    }

    /** 求在指定日期之前入学的学生
     *
     * @param date 指定日期
     * @return  存储了满足条件的学生信息的集合
     */
    //如果返回值有多个，我们可以考虑将多个返回值封装到一个容器中，然后返回该容器
    public Collection getStudentsEnrolledBefore(String date)
    {
        //1.定义一个数组，该数组专门用来存放满足条件的学生信息
        Collection temps = new ArrayList();

        //2.遍历每个学生，逐个判断 如果该学生入学日期在指定日期之前，则将该学生存入temps数组中
        for (Object student : students)
        {
            if (student instanceof Student stu && stu.getEnrollmentDate() != null)
            {
                if (stu.getEnrollmentDate().isBefore(LocalDate.parse(date))
                        || stu.getEnrollmentDate().isEqual(LocalDate.parse(date)))
                //LocalDate.parse（date）如果不指定默认格式，按照 年-月-日 格式解析

                {
                    //将满足条件的当前数组添加到temps临时数组里
                    temps.add(stu);
                }
            }
        }
        return temps;
    }
}


