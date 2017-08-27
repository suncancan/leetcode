/*
 * 算法：快速排序（从小到大）
 * 简介：把数组第一个元素作为基准，比其小的排在前面，比其大的排在后面，对分好的部分分别进行这个操作
 * 时间：20170827
 */
package summary;

public class QuickSort{
	public static void main(String[] args){
		int[] arr={1,2,5,2,9,3,11,4};
		quickSort(arr);
		int len=arr.length;
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void quickSort(int[] arr){
		partition(arr,0,arr.length-1);
	}
	
	public static void partition(int[] arr,int low,int high){
		if(low>=high){
			return;
		}
		
		int i=low,j=high,index=low;
		
		while(i<j){
			while(j>index){
				if(arr[j]<arr[index]){
					swap(arr,j,index);
					index=j;
					break;
				}
				j--;
			}
			
			while(i<index){
				if(arr[i]>arr[index]){
					swap(arr,i,index);
					index=i;
					break;
				}
				i++;
			}
		}
		
		partition(arr,low,index-1);
		partition(arr,index+1,high);
		
	}
	
	public static void swap(int[] arr,int m,int n){
		int temp=arr[m];
		arr[m]=arr[n];
		arr[n]=temp;
	}
}
