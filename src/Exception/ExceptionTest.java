package Exception;

/**
 * @program: Basic
 * @description: try、catch、finally中的玄机
 * @author: Cloud
 * @create: 2020/7/31 10:32:36
 */
public class ExceptionTest {
    public static int i = 3;
    public static int j = 0;

    public static void main(String[] args) throws Exception {
//        try {
//            throw new Exception("异常1");
//        } catch (Exception e) {
//            throw new Exception("异常2");
//        } finally {
//            try {
//                throw new Exception("异常3");
//            } catch (Exception e) {
//                throw new Exception("异常4");
//            }
//        }
        try {
            int k = 0;
            int a = i/k;
            Object str = null;
            str.toString();
            System.out.println(123456);
        } catch (Exception e) {
            System.out.println("ccc");
            throw new Exception(e);
        } finally {
            if (i/j==0) {
                System.out.println(123);
            }
            System.out.println("ccc");
        }
        System.out.println(987654);

    }
}
