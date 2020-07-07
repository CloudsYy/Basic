package lambda;

import java.io.BufferedReader;

//@FunctionalInterface 标注这个借口为函数式借口，通常函数接口只有一个抽象方法
interface Supplier<T> {
    T get();
}

class f1 implements Supplier{
    @Override
    public Object get() {
        return "hello world!";
    }
}

// 函数式接口里面可以有多个抽象方法：编译检查的时候Object抽象方法不会做考虑的。
@FunctionalInterface
interface BufferedReaderProcessor{
    String process(BufferedReader br);
    int hashCode();
    boolean equals(Object var1);
    String toString();
}

public class lambdaTest{

    public static void f3(Supplier<String> supplier){
        System.out.println(supplier.get());
    }

    public static void f4(){
        System.out.println(new f1().get());
    }

    public static void main(String[] args) {
        // 第一种实现方式
        f3(new Supplier<String>() {
            @Override
            public String get() {
                return "hello world!";
            }
        });

        // 第二种实现方式
        f3(
                ()->"hello world!"
        );

        // 第三种实现方式
        f4();

    }
}
