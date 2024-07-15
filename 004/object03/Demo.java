package object03;

public class Demo 
{
    public static void main(String[] args)
    {
        Person p1 = new Person("A", 30);
        Person p2 = new Person("B", 29);
        Person p3 = new Person("C", 33);
        boolean b1 = p1.equals(p2);//形参：Object obj = p2 = new Person("A", 30)
        boolean b2 = p1.equals(p1);
        boolean b3 = p1.equals(p3);
        System.out.println(b1 + " " + b2 + " " + b3);//false true false
    }
}

/*
    public boolean equals(Object obj)
    {
        return (this == obj);
    }

    == 比较运算符：
        ① 比较基本数据类型，比较两个基本类型的数值
            int i = 3；
            int j = 11；
            i == j //false
        ② 比较引用数据类型，比较的是两个引用中存储的地址值（内存地址生成的哈希值）
            p1.equals(p2)
                this = p1 = new Person("A", 30);
                obj  = p2 = new Person("B", 29);
                this == obj = false

            由于this指向new Person("A", 30);，obj指向另一个new Person("B", 29);
            因此this和obj分别指向的对象地址值不同（不是同一个对象），所以返回false
*/