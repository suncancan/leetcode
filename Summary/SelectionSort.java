/*
 * �㷨��ѡ�����򣨴�С����
 * ��飺��δ�����������ҵ���СԪ�أ���ŵ��������е���ʼλ��
 * ʱ�䣺20170824
 */
package summary;

public class SelectionSort {
	
	public static void main(String[] args){
		int[] arr={2,11,1,9,4,7,6,2};
		int len=arr.length;
		selectionSort(arr);
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void selectionSort(int[] arr){
		int len=arr.length;
		for(int i=0;i<len-1;i++){
			int k=i;
			for(int j=i+1;j<len;j++){
				if(arr[j]<arr[k]){
					k=j;
				}
			}		
			swap(arr,k,i);
		}
	}
	
	public static void swap(int[] arr,int m,int n){
		int temp=arr[m];
		arr[m]=arr[n];
		arr[n]=temp;
	}
}
