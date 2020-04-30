package com.i.learn.design.behavior.strategy;

import java.util.ArrayList;
import java.util.List;

public class Node<T extends Comparable> {

    private T data;

    private Node root;

    private Node parent;

    private Node left;

    private Node right;

    private List<Object> values = new ArrayList<>();

    public Node(){};

    public Node(T data, Node parent, Node left, Node right) {
        this.data = data;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public void insert(T data){
        // 从根节点开始插入
        Node current = root;
        if(current == null){
            root = new Node(data,null,null,null);
            return;
        }
        // 记录父节点
        Node parent = current;
        // 遍历插入位置的父节点
        while (current != null){
            int compareValue = data.compareTo(current.data);
            parent = current;
            if(compareValue < 0){
                // 比较左子树
                current = current.left;
            }else if(compareValue > 0){
                // 比较右子树
                current = current.right;
            }else {
                // 相同元素不插入
                return;
            }
        }
        // 创建新节点
        Node node = new Node(data,parent,null,null);
        int compareValue = data.compareTo(parent.data);
        if(compareValue < 0){
            // 插入左节点
            parent.left = node;
        }else if(compareValue > 0){
            // 插入右节点
            parent.right = node;
        }else {
            return;
        }
    }

    // 中序遍历
    public List<Object> getValues(Node root){
        midInterator(root);
        return values;
    }

    // 先序遍历
    public void preInterator(Node node){
        if(node != null){
            values.add(node.data);
            preInterator(node.left);
            preInterator(node.right);
        }
    }

    // 中序遍历
    public void midInterator(Node node){
        if(node != null){
            midInterator(node.left);
            values.add(node.data);
            midInterator(node.right);
        }
    }

    // 后序遍历
    public void lastInterator(Node node){
        if(node != null){
            lastInterator(node.left);
            lastInterator(node.right);
            values.add(node.data);
        }
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public static void main(String[] args){
        Integer[] a = {6,4,5,3,1,2};
        Node node = new Node();
        for(Integer i : a){
            node.insert(i);
        }
        List<Object> values = node.getValues(node.root);
        for(Object o : values){
            System.out.println((Integer)o);
        }
    }
}
