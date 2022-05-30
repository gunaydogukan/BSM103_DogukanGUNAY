package ikinci_week_14;

import java.util.Arrays;

public class algoritmasortslar {

	public static void main(String[] args) {
     int[] arr = {12,67,3,899,20,4,0,15,-4,99};
     System.out.println(Arrays.toString(arr));
	//insertionsorts(arr);
     //selectionsort(arr);
     bublesort(arr);
     System.out.println(Arrays.toString(arr));
	
	}
	
	public static void insertionsorts(int [] arr) {
		for (int index = 1; index < arr.length; index++) {
			int key = arr[index];
			int minindeks=index;
			int num=index-1;
			while(num>=0 && arr[num]>key) {
				arr[num+1]=arr[num];
				num--;
			}
			arr[num+1]=key;
		}
	}
	
	public static void selectionsort(int []arr) {
		for (int index = 0; index < arr.length; index++) {
			int minindeks=index;
		for (int index2 = index+1; index2 < arr.length; index2++) {
			if(arr[minindeks]>arr[index2]) {
				minindeks=index2;
			}
		}
          int deðer=arr[index];
          arr[index]=arr[minindeks];
          arr[minindeks]=deðer;
		}
	}
	
	public static void bublesort(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int deger = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=deger;
				}
			}
		}
	}
	
	public static void sort(int []arr,int left , int right) {
		if(left<right) {
			int mid =(right+left)/2;
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			menge(arr,left,mid,right);
		}	
	}
	public static void menge(int[]arr,int left,int mid , int right) {
		int numbers1=mid-left+1;
		int numbers2=right-mid;
		
		int[] L = new int[numbers1];
		int [] R = new int[numbers2];
		
		for (int i = 0; i < numbers1; i++) {
			L[i]=arr[i+left];
		}
		for (int i = 0; i < R.length; i++) {
			R[i]=arr[i+right];
		}
		
		int i=0;
		int j=0;
		int k =left;
		
		while(i<numbers1 && j<numbers2) {
			if(L[i]<R[j]) {
				arr[k]=L[i];
				i++;
			}else {
				arr[k]=R[i];
				j++;
			}
			k++;
		}
		while(i<numbers1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<numbers2) {
			arr[k]=R[j];
			j++;
			k++;
		}
				}

}
