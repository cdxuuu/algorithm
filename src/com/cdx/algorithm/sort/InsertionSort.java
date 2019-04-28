package com.cdx.algorithm.sort;

public class InsertionSort {

    public static void main(String[] args) {
       int[] arr = {4,2,5,6,1};
       insertionSort(arr);
       for (int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }

    public static int[] insertionSort(int[] arr){
        //n-1次扫描，一次向前插入n-1个元素
       for (int i=1;i<arr.length;i++){

           //每次讲arr[i]的元素插入到前面排序子序列中
           int temp = arr[i];
           int j;
           for (j=i-1;j>=0 && arr[j]>temp;j--){
               //将前面较大的元素移动到后面
                arr[j+1] = arr[j];
           }
           //temp值达到插入的位置
           arr[j+1] = temp;
       }
        return  arr;
    }
}
