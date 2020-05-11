package bitOperate;

/**
 * @program: Basic
 * @description: 无符号左移(<<) 从低位移动至高位 byte转int操作
 * @author: Cloud
 * @create: 2020/5/11 09:10:56
 */
public class ll {

    public static void main(String[] args) {
        byte[] bytesValue = {0,0,4,-30};
        int value = 0;
        int shift = 3;
        for (int i = 0; i < 4; i++) {
            value += (bytesValue[i]&0xFF)<<(8*shift);
            shift--;
            System.out.println(value);
        }
    }
}
