package edu.charles.array;

import edu.charles.sms.PrimaryStudent;
import edu.charles.sms.Student;

public class Demo
{
    public static void main(String[] args)
    {
        //定义一个长度为3的整型数组
        int[] arr = new int[3];

        //定义一个长度为3的Student类型的数组
        //本质上是父类引用指向子类对象（多态）
        Student[] students = new Student[3];
        students[0] = new PrimaryStudent(12345 , "char" , 90 , 100);
        students[1] = new PrimaryStudent(13423, "Illusion", 20, 50);
        System.out.println(students[0].getStudentId());
    }
}
