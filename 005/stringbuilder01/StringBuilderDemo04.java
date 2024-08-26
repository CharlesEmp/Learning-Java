package stringbuilder01;

/*

 */

public class StringBuilderDemo04 
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 16; i++)
        {
            sb.append('c');
        }
        //由于此时默认空间（当前容量存满内容）16已经被存满了，那么就需要扩容
        /*1.新建一个长度＞16的字节数组
          2.将valu字节数组中原有的内容拷贝到新数组中
          3.再把新添加的内容追加到新数组的末尾
          4，value指向新开辟的字节数组，代表StringBuilder底层使用扩展后的字节数组
         */
        sb.append('f');
        System.out.println(sb);
    }
}
