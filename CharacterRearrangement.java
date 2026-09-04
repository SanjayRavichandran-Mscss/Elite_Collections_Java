package javaCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//Important Problem
public class CharacterRearrangement {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter String :");
	    String s=Sc.nextLine();
	    String res="";
	    ArrayList<Character> alp=new ArrayList<>();
	    ArrayList<Character> num=new ArrayList<>();
	    for(int i=0;i<s.length();i++){
	        char x=s.charAt(i);
	        if((x>='a' && x<='z')|| (x>='A' && x<='Z')){
	            alp.add(x);
	        }
	        if(x>='0' && x<='9'){
	            num.add(x);
	        }
	    }
	    
	    Collections.reverse(alp);
	    Collections.sort(num);
	    System.out.println(alp);
	    System.out.println(num);
	    int inda=0;
	    int indn=0;
	    for(int i=0;i<s.length();i++){
	        char x=s.charAt(i);
	        if((x>='a' && x<='z')|| (x>='A' && x<='Z')){
	            res+=alp.get(inda);
	            inda++;
	            
	        }
	        else if(x>='0' && x<='9'){
	            res+=num.get(indn);
	            indn++;
	           
	            res+=x;
	        } 
	        
	    }
	    System.out.println(res);
	}

}
