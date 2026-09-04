package javaCollections;
import java.util.Scanner;
import java.util.ArrayList;
public class RemoveDuplicates {
public static void main(String[] args) {
	ArrayList<Integer> li = new ArrayList<>();
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter ArrayList Size :");
	int n = Sc.nextInt();
	System.out.println("Enter ArrayList Elements :");
	for(int i = 0;i<n;i++) {
		li.add(Sc.nextInt());
	}

	for(int i=0;i<n;) {
		if(li.contains(li.get(i)) && li.indexOf(li.get(i))!=i) {
			li.remove(i);
			n--;
		}else {
			i++;
		}
		
	}
	
		
		System.out.println(li);
		
//		optimized code:
//		for(int i=0;i<li.size();i++) {
//		if(li.contains(li.get(i)) && li.indexOf(li.get(i))!=i) {
//			li.remove(i);
//			i--;
//	}
//	System.out.println(li);
	
	
	
	
	
	
	

	Sc.close();
}
	
}
