package lambda;


interface Supplier<T> {
    T get();
}

class f1 implements Supplier{
    @Override
    public Object get() {
        return "hello world!";
    }
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