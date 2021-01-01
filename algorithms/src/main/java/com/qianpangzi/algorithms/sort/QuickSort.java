package com.qianpangzi.algorithms.sort;

/**
 * @author qianpangzi
 */
public class QuickSort {
    public static void main(String[] args){
        System.out.println("ddd");

        int[] nums=new int[]{9,4,11,3,8,7,10,13};

        quickSort(nums,0, nums.length-1);

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    /**
     * 快速排序的实现
     * @param nums  需要排序的数组
     * @param left  开始下标
     * @param right    结束下标
     * @return
     */
    public static void quickSort(int[] nums, int left, int right){

        //判断是不是结束
        if(left >=right){
            return;
        }

        //1.选取基准值
        int key = nums[left];
        int i = left;
        int j = right;

        int emptyIndex = i;

        //2.左右分割
        while (i<j){

            //从右往左找，小于基准的的元素
            while (i<j && nums[j]>=key){
                j--;
            }

            if(i<j){
                nums[emptyIndex]  = nums[j];
                emptyIndex = j;
            }

            //从左往右找，大于基准的元素
            while(i<j && nums[i] <=key){
                i++;
            }

            if(i<j){
                nums[emptyIndex] = nums[i];
                emptyIndex =i;
            }

        }  //左右分割完成

        nums[emptyIndex] = key;

        //左侧排序
        quickSort(nums,left,i-1);
        //右侧排序
        quickSort(nums,i+1,right);


    }


}
