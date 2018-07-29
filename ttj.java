/*
	[跳台阶]
    [题目]
	一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
    [解析]
    与斐波那契数列的求解过程类似。典型的动态规划问题。对于第 n 级台阶，
    我们可以从第 n-1 级台阶一步到达，也可以从第 n-2 级台阶一步达到，
    则有递归式：f[n] = f[n-1] + f[n-2]，
    初始状态 f[1] = 1, f[2] = 2。


    分析：一个台阶的时候是一个，两个台阶是2个，，三个台阶是3个，
    列举出来可以看到是递归的。
*/



class Solution02{
    public static void main(String[]args){
        
    }
    /*
    数组   行数   列数   需要查找的数据
    找到返回true，未找到返回false
    */
    public static int find(int number){
        if(number==1)
        {
            return 1;
        }
        if(number==2)
        {
            return 2;
        }
        int f1 = 1;
        int f2 = 2;
        for(int i = 3;i<=number;i++)
        {
            int temp = f1 + f2;
            f1 = f2;
            f2 = temp;
        } 
        return f2;      
    }
}