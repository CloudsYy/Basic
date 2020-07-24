package LinkList;

/**
 * @program: Basic
 * @description: 双链表
 * @author: Cloud
 * @create: 2020/7/23 10:12:53
 */
public class doubleLinkList<T> {
    private node head;// 头节点
    private node tail;// 尾节点
    private int length; //  链表长度

    public doubleLinkList(){
        head = null;
        tail = head;
        length = 0;
    }

    private class node<T>{
        private T data;
        private node pre;
        private node tail;

        public node(){ }

        public node(T data){
            this.data = data;
        }

        private void add(int index, T data,node node){   // 尾插入
            node teamNode = new node(data);
            if (doubleLinkList.this.length==index) { // 索引等于当前链表的长度，则表示尾进行尾插入
                if (this.tail==null) {
                    this.tail = teamNode;
                    teamNode.pre = this;
                } else if (index==0){ // 索引等于0，则表示尾进行头插入
                    this.tail.add(index,data,this);
                }
            } else if (index==0) {
                this.pre = teamNode;
                teamNode.tail = this;
            }
        }

        public void add(int index, T data,node tail, node pre){
            node teamNode = new node(data);
            if (doubleLinkList.this.length++==index) { // 索引等于当前链表的长度，则表示尾进行尾插入

            } else {
                this.tail.add(index,data,tail,pre);
            }
        }
    }

    public boolean isEmpty(){
        if (this.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void add(int index, T data){    // 尾插入
        node teamNode = new node(data);
        if (this.isEmpty()){
            this.head = teamNode;
            this.tail = teamNode;
        } else {
            if (index == this.length) {
                this.tail.add(index,data,this.tail);
            } else if (index == 0) {
                this.head.add(index,data,this.head);
            } else if (index > 0 && index < this.length){
                // 待实现，没怎么好思路

            }

        }
        this.length++;
    }

    public static void main(String[] args) {
        doubleLinkList linkList = new doubleLinkList();
        linkList.add(0,"hello");
        linkList.add(1,"world");
        linkList.add(0,"!!!");
        linkList.add(1,",test");
        System.out.println(linkList.length);
//        linkList.remove(1); // 移除第二个节点
//        linkList.replace(1," beautiful girl~");
    }

}
