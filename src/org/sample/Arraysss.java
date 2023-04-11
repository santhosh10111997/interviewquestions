package org.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Arraysss {
	public static void main(String[] args) {
		
		int a[]={-6,-2,0,4,8,2,1};
		int b[]= {20,90,40,10};

		//ascending order
	  int	 temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
			System.out.println(a[i]/2);
		}
		
		System.out.println();
		int t=0;
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]>b[j]) {
					t=b[i];
					b[i]=b[j];
					b[j]=t;	
				}
			}
		}
		for(int i:b) {
			System.out.println(i);
		}
		//maximum value
		System.out.println("maximum value.."+a[a.length-1]);
		//minimum value
		System.out.println("minimum value.."+a[0]);
		
		System.out.println();
		//desending order
		
		int t1=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					t1=a[i];
					a[i]=a[j];
					a[j]=t1;
					
				}
			}
		}
		for (int i:a)
		System.out.println("maxie"+i);
		
		
		//normal maximum value
		
		int c[]= {3,9,2,8,4};
		int max=c[0];
		for(int i:c) {
			if(max<i) {
				max=i;
			}
					}
		System.out.println("maximum.."+max);
		int max2=c[0];
		for(int i:c) {
			if(max2<i && i!=max) {
				max2=i;
			}
		}
		System.out.println("second max.."+max2);
		
		//minimum value
		
		int min=c[0];
		for(int i:c) {
			if(min>i) {
				min=i;
			}
					}
		System.out.println("minimum.."+min);
		
		int min2=c[0];
		for(int i:c) {
			if(min2>i && i!=min) {
				min2=i;
			}
		}
		System.out.println("second minimum.."+min2);
		
		//array to list
		Integer ar[]= {10,50,20,15};
		List<Integer> li = Arrays.asList(ar);
		System.out.println(li);
		
		System.out.println("minieeee.."+Collections.min(li));
		
		System.out.println("maxieee..."+Collections.max(li));
		 
		//List to array
		List<Integer> l1=new LinkedList<Integer>(Arrays.asList(10,50,20,15));
		System.out.println(l1);
		
		List<Integer> l2=new LinkedList<Integer>();
		l2.add(30);
		l2.add(60);
		l2.add(40);
		l2.add(24);
		
		Object[] k = l2.toArray();
		for (Object d : l2) {
			System.out.println(d);
			
		}
		
		//duplicates remove from array
		//using set
		Integer ac[]= {1,7,2,7,1};
		List<Integer> ls = Arrays.asList(ac);
		Set<Integer> s=new LinkedHashSet<>();
		s.addAll(ls);
		System.out.println(s);
		
		//using array itself
		
		
		
	int	p[]= {12,70,19,33};
	int	tem=0;
	for(int i=0;i<p.length;i++) {
		for(int j=i;j<p.length;j++) {
			if(p[i]>p[j]) {
				tem=p[i];
				p[i]=p[j];
				p[j]=tem;
				
			}
		}
		System.out.println(p[i]);
		System.out.println("doneeeeeee");
		
	}
		for(int i:p){
			System.out.println(i);
		}
		
		Integer f[]= {10,20,56,20};
		List<Integer> asList = Arrays.asList(f);
		System.out.println(asList);
		
		System.out.println(Collections.max(asList));
		
	System.out.println("minimum"+p[0]); 
		int z[]= {19,90,14,20};
		
		int pr=z[0];
		for(int i:z) {
			if(pr>i) {
				pr=i;
			}
		}
		System.out.println("mini.."+pr);
		Integer ab[]= {10,30,2,7};
		List<Integer> as = Arrays.asList(ab);
		Set<Integer> ad=new LinkedHashSet<Integer>();
		ad.addAll(as);
		System.out.println(ad);
		System.out.println("..........................................");
		
		
		
	int	f1[]= {-3,-1,0,4,9,2,1};
		int s5=0;
		
			for(int q=0;q<f1.length;q++) {
				for(int o=q;o<f1.length;o++) {
					if(f1[q]>f1[o]) {
						s5=f1[q];
						f1[q]=f1[o];
						f1[o]=s5;
		}
		
				}
				
			}
//		System.out.println(f1[q]);
//		
		
		
		
		
		
	
	
	
	
	
int	w[]= {26,12,6,90,14};
int r=0;
	
	for(int i=0;i<w.length;i++) {
		for(int j=i;j<w.length;j++) {
			if(w[i]<w[j]) {
				r=w[i];
				w[i]=w[j];
				w[j]=r;
			}
		}
		System.out.println(w[i]);
	}
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


	}


