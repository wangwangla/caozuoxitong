/*
	[二维数组中的查找]
    [题目]
	在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
	请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    [解析]
    假设数组 array 有 m 行 n 列
        1. 可以直接遍历一遍二维数组，则时间复杂度为 O(m*n)
        2. 利用有序的性质，我们从右上角或者左下角开始查找，每次可以减少一行或一列，时间复杂度 O(m+n)
*/


class Solution01{
    public static void main(String[]args){
        
    }
    /*
    数组   行数   列数   需要查找的数据
    找到返回true，未找到返回false
    */
    public static boolean find(int arr[][],int rows,int cols,int number){
        boolean found = false;
        if(arr!=null&&rows>0&&col>0){
            int row = 0;
            int col = cols-1;
            while(row<rows&&col>0){
                if(arr[col][row] == number){
                    found=true;
                }else if(arr[row][col]>number){
                    --cols;
                }else{
                    ++row;
                }
            }
        }
        return found;
    }
}