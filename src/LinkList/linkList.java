package LinkList;

/**
 * @program: Basic
 * @description: 单双链表测试类
 * @author: Cloud
 * @create: 2020/7/22 09:29:12
 */

public class linkList<T> {
    // 根节点索引位置
    private int foot;
    // 节点数，也就是链表的长度
    private int count;
    // 根节点
    private Node root;

    private class Node{
        // 节点数据域
        private T data;
        // 指针指向下一个节点
        private Node next;

        private Node(T data){
            this.data = data;
        }

        private void add(T data){
            if (this.next == null) { // 检查当前节点的next是否为空，就直接创建新的节点
                this.next = new Node(data);
            } else { // 递归查找 直到找到节点的next为空，就创建新的节点
                this.next.add(data);
            }
        }

        private void remove(Node previous, int index) {
            if (linkList.this.foot++ == index) {
                previous.next = this.next;
                this.next = null;
            } else {
                this.next.remove(this, index);
            }
        }

        private void replace(int index, T data){
            if (linkList.this.foot++ == index) {
                this.data = data;
            } else {
                this.next.replace(index, data);
            }
        }
    }

    private boolean isEmpty(){
        if (this.count == 0 || this.root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(T data){
        if (this.isEmpty()) { // 判断该链表是否为空
            this.root = new Node(data); // 如果为空，则创建一个新的节点
        } else {
            this.root.add(data);
        }
        this.count++;
    }

    public void remove(int index){
        if (this.isEmpty()) {
            return;
        }
        if (index < 0 || this.count <= index) {
            return;
        }
        this.foot = 0;
        this.root.remove(this.root, index);
        this.count--;
    }

    public void replace(int index, T data){
        if (this.isEmpty()) {
            return;
        }
        if (index < 0 || this.count <= index) {
            return;
        }
        this.foot = 0;
        this.root.replace(index,data);
    }

    public static void main(String[] args) {
        linkList linkList = new linkList();
        linkList.add("hello");
        linkList.add("world");
        linkList.add("!!!");
        System.out.println(linkList.count);
        linkList.remove(1); // 移除第二个节点
        linkList.replace(1," beautiful girl~");
    }
}
