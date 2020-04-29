package com.i.learn.main;


public class MainDemo {

    public static void main(String[] args) {
        int temp[]={8,10,6,5,9};      //定义一个长度为5的数组
        fun(temp);                              //调用fun方法
        print (temp);                          //调用print方法
    }
    public static void fun(int temp[]){
        for(int i=0; i<temp.length-1; i++){               //外循环
            for(int j=i+1; j<temp.length; j++){          //内循环
                if(temp[i]>temp[j]){                           //比较大小
                    int x=temp[i];                   //把数组i的值赋值给变量  x
                    temp[i]=temp[j];                            //交换位置
                    temp[j]=x;	    	                 //把变量x的值赋值给数组j
                }
            }
        }
    }
    public static void print(int temp[]) {
        for (int i = 0; i < temp.length; i++) {             //循环遍历
            System.out.print(temp[i] + "\t");       //打印数组i的值
        }
    }

}
