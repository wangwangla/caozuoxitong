

/*输入为两行字符串（可能包含空格），长度均小于等于50.
 * 
 * 网上感觉最屌的答案：
 * 
 * 
 * 思路：将两个数组看作是一个二维数组，将其中的数据进行行列的比较
 * 将数据值相同的数据，写为1，最后只需要统计在对角线上数据的值1最
 * 多的个数，就是数据的最长子串。
 * 
 */

 class nk_01{
     public static void main(String[] args) {
         
     }

     public static int find(int arr1[],int arr2[],int len1 , int len2){
        int a[][] = new int[len1][len2];
        /*
        首先进行初始化
        */
        for(int i =0 ;i<len1;i++){
            for(int j = 0; j<len2;j++){
                a[i][j] = 0;
            }
         }
        /*
        对数据进行判断，将数据进行标记
        */
        for(int i =0 ;i<len1;i++){
            for(int j = 0; j<len2;j++){
                if(arr[i] == arr[j]){
                    a[i][j] = 0;
                }
            }
         }

        /*
        统计1的个数
        */
        int leng = 0;
        int max = 0;
        for(int i = 0 ;i <len1-2 ;i++)
        {
            for(int j = 0; j<len2-2;j++){
                if(a[i][j]==1){
                    leng++;
                }else{
                    if(leng>max){
                        max =leng;
                    }
                }
            }
        }
        return max;
     }


     /*
    不模仿了，看一下大佬的方法
     */

 }
 /*思路：假设两个字符串str1和str2，长度分别为m和n，则构建一个m*n的矩阵matrix，
  
        matrix[i][j]==1表示字符串str1中第i个字符与str2中第j个字符相等，为0则不相等。
  
        统计矩阵matrix中每条斜线上1的连续最大个数就是str1和str2中公共连续子串的最大长度
  
 例如：str1: abcde    str2: abgde 
  
       matrix = [ 1  0  0  0  0 
  
                  0  1  0  0  0
  
                  0  0  0  0  0
  
                  0  0  0  1  0
  
                  0  0  0  0  1 ]
  
     斜线上连续的1的最大个数为2，所以最长公共连续子串长度为2
  
   
   #include <iostream>
  
 using namespace std;
  
 intmain()
  
 {
  
     charstr1[51];
  
     charstr2[51];
  
     intleng, maxleng=0;
  
     cin.getline(str1, 51);
  
     cin.getline(str2, 51);
  
     intmatrix[50][50] = { 0};              //构建初始矩阵matrix
  
   
  
     for(inti = 0; str1[i] != '\0'; i++)            
  
     {
  
         for(intj = 0; str2[j] != '\0'; j++)
  
         {
  
             if(str1[i] == str2[j])
  
                 matrix[i][j] = 1;                     //如果str1中第i个字符与str2中第j个字符相等，则为1
  
         }
  
     }
  
   
  
     //循环统计每条斜线上的连续1的个数
  
     for(inti = 0; str1[i]!='\0'; i++)          
  
     {
  
         for(intj = 0; str2[j]!='\0'; j++)
  
         {
  
             leng = 0;
  
             intm = i;
  
             intn = j;
  
             while(matrix[m++][n++] == 1)          //判断其右下角位置是否为1
  
                 leng++;
  
             if(maxleng < leng)
  
                 maxleng = leng;
  
         }
  
     }
  
     cout << maxleng;
  
           
  
     return0;
  
 }

 */