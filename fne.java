/*
	[斐波那契数列]
    [题目]
	大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。n<=39
    [解析]
    首先要知道斐波那契数列的定义；
    典型的递归求解，但存在很多重复子问题
    使用带记忆的自顶向下
    动态规划，根据递归式，第 n 项，只与前两项有关，可只用两个变量来存储进一步减小空间
*/

class fbnq{
    public static void main(String[] args) {
        
    }

    public static int fbnq(int num){
        int f1 = 1;
        int f2 = 1;
        if(num == 0)
        {
            return 1;
        }else if(num==1||num == 2){
            return 1;
        }
        else{
            for(i=3;i<num;i++){
                int temp = f1 + f2;
                f2 = f1;
                f1 = temp ; 
            }
        }
        return f1;
    }
}