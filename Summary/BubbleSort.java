/*
 * 算法：冒泡排序（从小到大）
 * 简介：通过相邻的数的比较和交换把大的数移到最后面
 * 时间：20170823
 */
package summary;

public class BubbleSort {
	
	public static void main(String[] args){
		int[] arr={2,4,1,9,4,7,6,2};
		bubbleSort(arr);
		int len=arr.length;
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void bubbleSort(int[] arr){
		int len=arr.length;
		for(int i=0;i<len-1;i++){
			for(int j=0;j<len-i-1;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	public static void swap(int[] arr,int m,int n){
		int temp=arr[m];
		arr[m]=arr[n];
		arr[n]=temp;
	}
	
}
