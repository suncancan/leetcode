/*
 * 算法：插入排序（从小到大）
 * 简介：从第二个元素到最后一个元素，每个元素依次移到合适的位置
 * 时间：20170824
 */
package summary;

public class InsertSort {
	public static void main(String[] args){
		int[] arr={1,2,5,2,9,3,11,4};
		insertSort(arr);
		int len=arr.length;
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void insertSort(int[] arr){
		int len=arr.length;
		for(int i=1;i<len;i++){
			int j=i;
			int temp=arr[i];
			while(j>0 && temp<arr[j-1]){
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
	}
	
}
