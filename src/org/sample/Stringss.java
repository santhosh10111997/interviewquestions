package org.sample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Stringss {
	public static void main(String[] args) {
		//String Reverse
		
		String s="santhosh";
		StringBuffer s1=new StringBuffer(s);
		StringBuffer r = s1.reverse();
		System.out.println(r);
		
		//useing looping
		String sr="";
		for(int i=s.length()-1; i>=0;i--) {
			char at = s.charAt(i);
			sr=sr+at;
		}
		System.out.println(sr);
		
		String st="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
		st=st+ch;
			
			
		}
		System.out.println(st);
		
		//palindrom
		
		String a="madam";
		String b="";
		
		for(int i=a.length()-1;i>=0;i--) {
			char c = a.charAt(i);
			b=b+c;}
			System.out.println(a);
			if(b.equals(a)) {
				System.out.println("palindrome");
				
			}
			else {
				System.out.println("not palindrome");
			}
			
			//equals = and ==  
		//	equals only checking the values 
		//	== its checking the memory reference
			
			String d="hello";
			String e="hello";
			String f=new String("hello");
			String g="hai";
			String h=new String("hai");
			
			System.out.println(d.equals(e));
			System.out.println(d.equals(f));
			System.out.println(d.equals(g));
			System.out.println(d==e);
			System.out.println(d==f);
			System.out.println(g==h);
			
			//count of letters using map
			
			String a1="saaaanddyyy";
			char[] cs = a1.toCharArray();
			
			Map<Character, Integer> mp=new LinkedHashMap<>();
			
			for(char x:cs) {
				if(mp.containsKey(x)) {
					Integer in = mp.get(x);
					mp.put(x, in+1);
				}
				else {
					mp.put(x, 1);
				}
			}
			System.out.println(mp);
			//find the duplicate values
			String dp="";
			String rdp="";
			Set<Entry<Character, Integer>> en = mp.entrySet();
			for(Entry<Character, Integer> x:en) {
				if(x.getValue()>1) {
					dp=dp+x.getKey();
				}
				else {
					rdp=rdp+x.getKey();
				}
			}
			System.out.println(dp);
			System.out.println(rdp);
			
			//count of words 
			String sp="hello to the the to my class";
			String[] split = sp.split(" ");
			
			Map<String, Integer> mp1=new LinkedHashMap<>();
			for( String x:split) {
				if(mp1.containsKey(x)) {
					Integer in1 = mp1.get(x);
					mp1.put(x, in1+1);
				}
				else {
					mp1.put(x, 1);
				}
			}
			System.out.println(mp1);
			
			
			
			String sw="Welcome";
			String upperCase = sw.toUpperCase();
			String replace = upperCase.replace("W", "w");
			System.out.println(replace);
//			
//			if(i=sw.length();)
//			String upperCase = sw.toUpperCase();
//			System.out.println(upperCase);
//			
		
		String bc="tambaaa";
		char[] a2 = bc.toCharArray();
		
		Map<Character,Integer> m1=new HashMap<Character,Integer>();
	//	Integer inte = m1.get(a2);
		for(char x1:a2) {
			if(m1.containsKey(x1)) {
				Integer inte = m1.get(x1);
				m1.put(x1, inte+1);
			}
			else{
				m1.put(x1, 1);
			}
		}
		System.out.println(m1);
		
		Set<Entry<Character,Integer>> v2 = m1.entrySet();
		System.out.println(v2);
		
		
		}
		
	
	}


























