package random;

/*
    需求：通过26个大小写字母以及0-9的数字 随机生成四位

    1.构造数据：26个大小写字母以及0-9的数字
    2.从以上数据中随机抽取四位
 */

import java.util.Random;

public class RandomDemo02 {
    public static void main(String[] args)
    {
        //0.初始化一个容器，存储数据
        StringBuilder data = new StringBuilder();
        //1.构造26个小写字母a-z
        for (char ch = 'a'; ch <= 'z'; ch++)
        {
            data.append(ch);
        }
        //1.构造26个大写字母A-Z
        for (char ch = 'A'; ch <= 'Z'; ch++)
        {
            data.append(ch);

        }
        //1.构造数字0-9
        for (char ch = '0'; ch <= '9'; ch++)
        {
            data.append(ch);

        }

        //2.从以上数据中随机抽取四位

        //method01(data);

        method02(data);
        method02(data);
        method02(data);
        method02(data);
    }

    private static void method02(StringBuilder data) {
        String dataStr = data.toString();
        StringBuilder randomCode = new StringBuilder();
        for(int i = 0; i < 4; i++)
        {
            int randomIndex = new Random().nextInt(dataStr.length());
            randomCode.append(dataStr.charAt(randomIndex));
        }

        System.out.println(randomCode);
    }

    private static void method01(StringBuilder data) {
        char[] chars = data.toString().toCharArray();
        StringBuilder randomCode = new StringBuilder();
        for(int i = 0; i < 4; i++)
        {
            char randomChar = chars[new Random().nextInt(chars.length)];
            randomCode.append(randomChar);
        }

        System.out.println(randomCode);
    }
}