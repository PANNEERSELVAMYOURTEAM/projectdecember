package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NumberToAlphabets {

	public static void main(String[] args) {
	/*
	String s="abcdefghijklmnopqrstuvwxyz";
char[] ch= s.toCharArray();
	int length = s.length();
	int lengthch=ch.length;
	
	for(int i=1;i<=length-1;i++){
		char chsd=ch[i];
	}
	for(int j=1;j<=lengthch-1;j++){
		char chs=s.charAt(j);
	
		System.out.println(j);
		
	}*/
	List<Character> alphabets= new ArrayList<Character>();
	String alpa ="abcdefghijklmnopqrstuvwxyz";
	for(int i=0;i<alpa.length();i++){
		alphabets.add(alpa.charAt(i));
	}
	
	Map<Object,Integer> mp=new TreeMap<Object,Integer>();
	for(int i=0;i<=25;i++){
	 mp.put(alphabets.get(i), i);
	 
	
	
	}

	@SuppressWarnings("resource")
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number");
	for(int i=0;i<=100;i++){
		int nextInt = sc.nextInt();
		
		if(mp.containsValue(nextInt)){
			System.out.println(alphabets.get(nextInt));
	}
	
	
		
	}

	
	
		
	}
	
}

	


