package com.busyqa.course;

public class DataOperators {

	public static void main(String[] args) {

		int a = 5;
		int b = 6;
		
   int c = a + b;
   System.out.println(c);
   
  // a+=2; // a= a +2
  
   
   b = ++a;
   System.out.println(a);
   System.out.println(b);
		
		double d = 4;
		double e = 8;
		
		double f = d / e ;
		
		System.out.println(f);
		// Boolean Operator
		boolean x = true;
		boolean y = false;
		
		//boolean z = x && y;
		//boolean z = x || y;
		 boolean z = x != y; 
		System.out.println(z);
		
		//Relational Operator
		
		int  h= 5;
		int j= 6;
		
		if (h < j) {
			System.out.println("h is less than j");
		}else
		{
			System.out.println("h is grater than j ");
		}
		
		
		boolean i = true;
		boolean k = false;
		
		if (i && k) {
			System.out.println(" true");
		}
		else
		{
			System.out.println(" false");
		}
		
		// Nested loop
		
	int r=5;
	int t= 10;
	
	if (r < t) {
		
		System.out.println("r is less than t");
	} else if (r > t)
	{
		System.out.println(" r is grater than t");
		
	} else {
		System.out.println("others");
	}
	
	// switch 
	
	int p = 8;
	
	switch(p) {
	case 1 : System.out.println("1");
	break;
	case 8 :System.out.println("8");
	break;
	default: System.out.println("others");
	break;
	}
	// while
	
	int w = 0;
	
	while (w < 10){
	System.out.println(w++);
	}
	
	// do while
	int n = 5;
	
	do {
		System.out.println(n++);
	}while(n<10);
	
	
	
	}

}
