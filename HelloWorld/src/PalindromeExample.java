class PalindromeExample{ 
	
	long l = 10;
	double d= 12.344;
	float f=1.2f;
	static int p=10;
	static int p2= 12;
		
	
	PalindromeExample(int a){
		
		System.out.println("nnnnnnnnnnnnn");
	}
	

	
 public static void main(String args[]){  
	 int a[][] = new int[4][];
	 
	 System.out.println(args[0]);

	 a[3] = new int[3];	 
	  a[3][2] = 4;
	  
	  writethis();
	  System.out.println(a[3][2]);
	 
  int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
 
 // int a[] = {0,1};
//  read(a);
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
  
/* @Override
public boolean equals(int obj) {
	 p.getL().eqp2.getL();
	//return super.equals(obj);
}*/
 




public long getL() {
	return l;
}



public static void main (String a){
	 
	 System.out.println("aish");
	 
 }
 
/* public static int read( int a []){
	 return 12;
 }*/

 
 public static void writethis(){

	 PalindromeExample  p3= new PalindromeExample(12);
	 PalindromeExample   p4= new PalindromeExample(12);
	  
	  System.out.println(p3.equals(p4));
	 
 }

 
 public void lastTryParent(){
	 System.out.println("lastparenttry");
	
 }
 

public static int read() {
	System.out.println("parent");
	return 0;
}




}  