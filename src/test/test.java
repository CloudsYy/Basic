package test;

/**
 * @program: Basic
 * @description: 只是测试而已
 * @author: Cloud
 * @create: 2020/5/14 10:16:47
 */
public class test {

    // 这里表明了为什么在进制转换的时候需要加&0xff的计算,
    // 这里加&0xff和没加，前后两个的补码不一致，并且此时我们需要关
    // 注补码的一致性，并不需要关注十进制的数据，
    // 转成java的int的时候，对于原码，补码和反码需要去另外了解一下
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(-8&0xff));
        System.out.println(Integer.toBinaryString(-8));

        String str = "\"123\"";
        System.out.println(str);
        char c = str.charAt(str.length() - 1);
        System.out.println(c == '\"');
        int length = str.length();
        str=str.replace(str.charAt(str.length()-1)+"","\"");
        System.out.println(str);
    }
}
