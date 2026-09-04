package javaCollections;
import java.util.ArrayList;
import java.util.Scanner;
public class FindSecondLargestElement {
public static void main(String[] args) {
	ArrayList<Integer> li = new ArrayList<>();
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter ArrayList Size :");
	int n = Sc.nextInt();
	System.out.println("Enter ArrayList Elements :");
	for(int i = 0;i<n;i++) {
		li.add(Sc.nextInt());
	}
	int max = Integer.MIN_VALUE;
	int s_max = Integer.MIN_VALUE;
	for(int i =0;i<n;i++) {
		if(li.get(i)>max) {
			s_max = max;
			max = li.get(i);
		}else if(li.get(i)>s_max && li.get(i)<max) {
			s_max = li.get(i);		
		}
	}
	if(s_max == Integer.MIN_VALUE){
		System.out.println("All the Elements are Same!");
	}
	else {
	System.out.println("second largest :"+s_max);
	}
	
	
	
	Sc.close();
	
}
}
