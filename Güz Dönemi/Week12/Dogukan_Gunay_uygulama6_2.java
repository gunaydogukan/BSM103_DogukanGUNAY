package odev;

import java.util.Arrays;

public class Dogukan_Gunay_uygulama6_2 {
	public static void main(String[] args) {
		
		int x =0;
		int[]arr=new int[4];
		x=x+1;
		mystrey(x , arr);	
		
		System.out.println(x + " "+Arrays.toString(arr));
		x=x+1;
		
		mystrey(x , arr);
		System.out.println(x + " "+Arrays.toString(arr));
		
	}
	public static void mystrey(int x , int[]arr) {
		x=x+1;
		arr[x]=arr[x]+1;
		System.out.println(x+" "+Arrays.toString(arr));
		
	}
}
