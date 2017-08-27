/*
 * 算法：堆排序（从小到大）
 * 简介：利用最大堆，堆顶即为最大值，然后堆顶元素和待排序数组中的最后一个元素交换，交换后找出待排序数组的最大值，循环。
 * 时间：20170827
 */
package summary;

public class HeapSort {
	
	public static void main(String[] args){
		int[] arr={2,4,1,9,4,7,6,2};
		heapSort(arr);
		int len=arr.length;
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void heapSort(int[] arr){
		if(arr==null||arr.length<=1){
			return ;
		}
		
		int len=arr.length;
		for(int i=len-1;i>0;i--){
			 buildMaxHeap(arr,i);
			 changePos(arr,0,i);
		}
	}
	
	public static void changePos(int[] arr,int m,int n){
		int temp=arr[m];
		arr[m]=arr[n];
		arr[n]=temp;
	}
	
	public static void buildMaxHeap(int[] arr,int pos){
		int index=(pos-1)/2;  
		int left,right,max;
		
		for(int i=index;i>=0;i--){
			left=2*i+1;
			right=2*i+2;
			max=i;
			if(left<=pos&&arr[left]>arr[i]){
				max=left;
			}
			if(right<=pos&&arr[right]>arr[max]){
				max=right;
			}
			changePos(arr,max,i);
		}
	}
	
}
