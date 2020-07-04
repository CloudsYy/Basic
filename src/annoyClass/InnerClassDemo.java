package annoyClass;

/**
 * @program: Basic
 * @description: 匿名内部类的使用
 * @author: Cloud
 * @create: 2020/6/9 14:10:04
 */

interface C{
    public void printInfo(int a,int b);
}

class Z{
    public void fun1(){
        this.fun2(new C() {
            @Override
            public void printInfo(int a,int b) {
                System.out.println("这里是非匿名内部类 "+a+b);
            }
        });
    }
    public void fun2(C c){
        c.printInfo(1,2);
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        new Z().fun1();
    }
}
