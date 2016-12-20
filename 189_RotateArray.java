/*
@author Cathy
@version 1.0
RunTime:1ms

��Ŀ��Rotate Array(Difficulty: Easy)
Rotate an array of n elements to the right by k steps.
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

Hint:
Could you do it in-place with O(1) extra space?
Related problem: Reverse Words in a String II

����˼·��
1����Ϊ�ռ临�Ӷ�ΪO(1)�����������뵽��ÿ���ƶ�һλ��ѭ��k%nums.length�Σ�������Ҫ�����һ���洢�ռ䡣
��ѭ���Ӻ���ǰ���У�����ǰ���ֵ�ᱻ���ǣ���Ҫ����������洢�ռ䣬����ʱ�临�ӶȻ����ӣ�
2�����ǳ�ʱ�ˣ���Ϊ�ƶ�����̫���ˡ����ǲο�Top Solutions����Ĵ𰸣���ת3�Ρ�
3�������Ĺؼ���˼·���������⣬������Ч��ʱ�临�ӶȺͿռ临�Ӷȵͣ��ķ�ʽ�����
*/
//����1������ʱ��
public class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        
        if(k==0||k%len==0){
            return ;
        }
        
        for(int i=0;i<k%len;i++){
            rotateOne(nums);
        }
        
    }
    
    public void rotateOne(int[] nums){
        int len=nums.length;
        int temp=nums[len-1];
        
        for(int i=len-1;i>0;i--){
           nums[i]=nums[i-1];
        }
        
        nums[0]=temp;
    }
}


//����2��
public class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        int dis=k%len;
        
        if(k==0||k%len==0){
            return ;
        }
        
        reverse(nums,0,len-1);
        reverse(nums,0,dis-1);
        reverse(nums,dis,len-1);
    }
    
    public void reverse(int[] nums,int start,int end){
        int temp;
        
        while(end-start>0){
            temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
    }
    
}

