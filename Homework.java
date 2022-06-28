package myProject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Homework {
	static Scanner sc = new Scanner(System.in);
	 static Random rnd = new Random();
		
		public static void fillArrayWithRandom(int[] arr,int size) 
		{
			for(int i = 0; i<size;i++) 
			{
				arr[i]=rnd.nextInt(10);
				System.out.println(arr[i]);
			}
		
		}
		public static void sort(int[] arr) 
		{
			Arrays.sort(arr);
			System.out.println(arr[arr.length-1]+ "en büyük sayıdır.");
			System.out.println(arr[0]+" en kücük sayi");
		}
		public static int total(int[] arr) 
		{
			int result = 0;
			for(int i = 0; i<arr.length;i++) 
			{
				result += arr[i];
			}
			System.out.println("sayıların toplamı : "+result);
			return result;
		}
		public static void ortalama(int[] arr) 
		{
			float result = 0;
			for(int i = 0; i<arr.length;i++) 
			{
				result += arr[i];
			}
			
			System.out.println("ortalaması: "+(result/arr.length));
		}
		public static void tekSayi(int[] arr) 
		{
			int count = 0,result = 0;
			System.out.println("tek sayilar");
			for(int i = 0; i<arr.length;i++) 
			{
				
				if(arr[i]%2==1) 
				{
					System.out.print(arr[i]+" ");
					count++;
					result+=arr[i];
				}
			}
			System.out.println("\ntek sayı sayısı : "+count);
			System.out.println("tek sayıların toplami: "+result);
			
		}
		public static void ciftSayi(int[] arr) 
		{
			int count = 0,result = 0;
			System.out.println("cift sayilar");
			for(int i = 0; i<arr.length;i++) 
			{
				
				if(arr[i]%2==0) 
				{
					System.out.print(arr[i]+" ");
					count++;
					result+=arr[i];
				}
			}
			System.out.println("\nçift sayı sayısı : "+count);
			System.out.println("çift sayıların toplami: "+result);
			
		}
		public static void binarySearch(int[] arr, int num) 
		{
			int x = Arrays.binarySearch(arr, num);
			if(x>0) 
			{
				System.out.println(arr[x]);
			}
			else 
			{
				System.out.println(num +" sayisi dizide yok");
			}
			
		}
		public static void tekrar(int arr[]) 
		{
			final Set<Integer> setToReturn = new HashSet<>(); 
		    final Set<Integer> set1 = new HashSet<>();
		    for (Integer yourInt : arr) {
		        if (!set1.add(yourInt)) {
		            setToReturn.add(yourInt);
		           
		        }
		    }
		   
		    System.out.println(setToReturn);
		 
		    
		}
		public static void tekrarsiz(int[] arr) 
		{
			final Set<Integer> setToReturn = new HashSet<>(); 
		    final Set<Integer> set1 = new HashSet<>();
		         
		    for (Integer yourInt : arr) {
		        if (!set1.add(yourInt)) {
		          
		        	
		        }else {
		        	setToReturn.add(yourInt);
		        }
		     
		    }
		   // set1.removeAll(setToReturn);
		    System.out.println(setToReturn);
		   // System.out.println(set1);
		    
		}
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		int size = sc.nextInt();
		System.out.println("dizinin boyutunu giriniz");
		int[] arr = new int[size];
		fillArrayWithRandom(arr, size);
		sort(arr);
		total(arr);
		ortalama(arr);
		tekSayi(arr);
		ciftSayi(arr);
		binarySearch(arr, 5);
		tekrar(arr);
		tekrarsiz(arr);
	}

}
