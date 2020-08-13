package com.cloud.basic.LinkList;

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

    public static int flag = 0;

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
                if (index==1) {
                    teamNode.pre = this;
                } else {
                    if (this.tail==null) {
                        this.tail = teamNode;
                        teamNode.pre = this;
                    } else if (index==0){ // 索引等于0，则表示尾进行头插入
                        this.tail.add(index,data,this);
                    }if (this.tail==null) {
                        this.tail = teamNode;
                        teamNode.pre = this;
                    } else if (index==0){ // 索引等于0，则表示尾进行头插入
                        this.tail.add(index,data,this);
                    }
                }
            } else if (index==0) {
                this.pre = teamNode;
                teamNode.tail = this;
            }
        }

        // 序号插入链表
        public void add(int index, T data){
            node teamNode = new node(data);
            if (flag++==index){
                // 当前节点指向新的节点
                this.pre = teamNode;
                // 新的节点指向当前节点
                teamNode.tail = this;
                // 当前节点的上一个节点指向新的节点
                this.pre.tail = teamNode;
                // 新的节点指向当前节点的上一个节点
                teamNode.pre = this.pre;
            } else {
                this.tail.add(index,data);
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
                // 思想应该是这样子，根据序号，在原链表找到相对应的位置，找到位置后，该节点的
                // 数据pre指向新的节点，新的节点的next指向该节点(也就是this), 该数据也就是this.next的节点指向该数据，
                // 该数据的pre指向this.next
                flag = 0;
                this.head.add(index,data);
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
