package regex;

/*
    判断一个字符串是否是手机字符串 ：13534931781
    手机号规则：
        1.长度必须为11位
        2.手机号第一位必须是1
        3.手机号第二位必须是 3、4、5、7、8其中一位
        4.手机号的所有位数都必须是数字(由上述条件简化为后九位)

    条件运算
        !(A || B || C) 等价于 !A && !B && !C
        !(A && B && C) 等价于 !A || !B || !C
 */

public class RegexDemo01
{
    public static void main(String[] args)
    {
        System.out.println(checkPhoneNum("13534931781"));//true
        System.out.println(checkPhoneNum("1353493178")); //false 位数不够
        System.out.println(checkPhoneNum("23534931781"));//false 首位不满足
        System.out.println(checkPhoneNum("10534931781"));//false 次位不满足
        System.out.println(checkPhoneNum("135349317a1"));//false 不全是数字
    }

    /**
     *
     * @param phoneNum 传入一个手机号
     * @return  如果该字符串是手机号，就返回true 如果不是就返回false
     */
    public static boolean checkPhoneNum(String phoneNum)
    {
        //1.长度不是11位
        if (phoneNum.length() != 11)
        {
            return false;
        }
        //2.手机号第一位不是1
        else if (phoneNum.charAt(0) != '1')
        {
            return false;
        }
        //3.手机号第二位不是 3、4、5、7、8其中一位
        else if (! (phoneNum.charAt(1) == '3' || phoneNum.charAt(1) == '4'
                 || phoneNum.charAt(1) == '5' || phoneNum.charAt(1) == '7'
                 || phoneNum.charAt(1) == '8'))
        {
            return false;
        }
        //4.手机号的所有位数都不是数字
        else
        {
            char[] chars = phoneNum.toCharArray();
            for (int i = 2; i < chars.length; i++)
            {
                if (!(chars[i] >= '0' && chars[i] <= '9'))
                {
                    return false;
                }
            }
        }

        return true;
    }
}
