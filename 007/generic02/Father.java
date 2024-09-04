package generic02;

/*
    接口上的泛型：
        interface 接口名<T> //接口上声明泛型变量(参数)，可以在接口中使用
        {

        }
 */

public interface Father<T>
{
    void method(T t);
}
