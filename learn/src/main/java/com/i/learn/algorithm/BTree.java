package com.i.learn.algorithm;

import java.util.ArrayList;
import java.util.List;

public class BTree<T> {
    // 根节点
    private BTree root;
    // 左节点
    private BTree left;
    // 右节点
    private BTree right;

    // 数据域
    public T data;

    // 节点数据
    private List<BTree> datas;

    // 构造子节点
    public BTree(BTree left, BTree right, T data){
        this.left = left;
        this.right = right;
        this.data = data;
    }

    // 构造根节点
    public BTree(T data){
        this.left = null;
        this.right = null;
        this.data = data;
    }

    public BTree(){

    }

    public void createBTree(Object[] objects){
        datas = new ArrayList<>();
        // 将数组转化为node节点
        for(Object object : objects){
            datas.add(new BTree(object));
        }
        // 设置第一个数为根节点
        root = datas.get(0);
        // 建立二叉树，依次设置左右节点
        for(int i = 0; i < objects.length / 2; i++){
            // 设置左节点
            datas.get(i).left=datas.get(2 * i + 1);
            // 防止数组越界
            if((2 * i + 2) < datas.size()){
                datas.get(i).right = datas.get(2 * i + 2);
            }
        }
    }

    // 先序遍历
    public void preOrder(BTree root){
        if(root != null){
            // 打印当前节点
            System.out.println(root.data);
            // 遍历左子树
            preOrder(root.left);
            // 遍历右子树
            preOrder(root.right);
        }
    }

    // 中序遍历
    public void inOrder(BTree root){
        if(root != null){
            // 遍历左子树
            inOrder(root.left);
            // 打印当前节点
            System.out.println(root.data);
            // 遍历右节点
            inOrder(root.right);
        }
    }

    // 后序遍历
    public void afterOrder(BTree root){
        if(root != null){
            // 遍历左子树
            afterOrder(root.left);
            // 遍历右子树
            afterOrder(root.right);
            // 打印当前节点
            System.out.println(root.data);
        }
    }

    public static void main(String[] args){
        String[] str = {"A","B","C","D","E","F","G","H","I"};
        BTree bTree = new BTree();
        bTree.createBTree(str);
        bTree.afterOrder(bTree.root);
    }

}
