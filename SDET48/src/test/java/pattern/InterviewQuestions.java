package pattern;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class InterviewQuestions {
	public static void list() {
		int[] arr= {5,2,3,4,1};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		int fmax=arr[0];
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)>fmax) {
				fmax=list.get(i);
			}
		}
		System.out.println(fmax);
	}
	public static void repeat() {
		String s="malayalam";		//a4
		char[] arr = s.toLowerCase().toCharArray();
		boolean[] frr=new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int n=0;
			if (frr[i]==false) {
				int count=0;
				for (int j = i; j < arr.length; j++) {
					if (arr[i]==arr[j]) {
						count++;
						frr[j]=true;
					}
				}
				if (arr[i]=='a') {
					System.out.println(arr[i]+""+count);
				}
			}
		}
	}
	public static void moveDigits() {
		int[] arr= {0,1,0,2,0,7,6,8};
		int[] brr=new int[arr.length];
		int m=0;
		int n=arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0) {
				brr[n]=arr[i];
				n--;
			} else {
				brr[m]=arr[i];
				m++;
			}
		}
		System.out.println(Arrays.toString(brr));
	}
	public static void list2() {
		int[] arr= {1,4,5,7,2,3,112,2,3,77,334,6767,333,3};
		ArrayList<Integer> list = new ArrayList<Integer>();

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if (list.get(i)%2==0) {
				list2.add(list.get(i));
			}
		}
		TreeSet<Integer> set = new TreeSet<Integer>(list2);
		System.out.println(set);
		
	}
	public static void main(String[] args) {
		//list();
		//repeat();
		//moveDigits();
		list2();
	}
}
