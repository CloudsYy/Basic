package Enum;

/**
 * @program: Basic
 * @description:
 * @author: Cloud
 * @create: 2020/7/21 14:45:08
 */
public enum MyDay implements DayInterface{
    MONDAY(1,"星期一"),THUSDAY(2,"星期二");//这个后面必须有分号

    private int code;

    private String name;

    /**
     * 如果打算自定义自己的方法，那么必须在enum实例序列的最后添加一个分号。如上：↑
     * 而且 Java 要求必须先定义 enum 实例。 且枚举类型的构造方法必须为私有方法。
     * 注意:枚举类型中可以有静态方法，也可以与其他方法。可以有属性与get，set方法。
     * */
    private MyDay(int code,String name){
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDay() {
        return this.getName();
    }

    // 这里还可以有toString(),但不错实例了
}
