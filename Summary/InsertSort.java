/*
 * �㷨���������򣨴�С����
 * ��飺�ӵڶ���Ԫ�ص����һ��Ԫ�أ�ÿ��Ԫ�������Ƶ����ʵ�λ��
 * ʱ�䣺20170824
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
