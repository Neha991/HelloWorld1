class PrimeExample extends PalindromeExample{
	
	public PrimeExample() {
		// TODO Auto-generated constructor stub
	}
	
	PrimeExample(int a){
		//super(12);
	}
	
 public static void main(String args[]){  
	 PrimeExample p= new PrimeExample();
	 PrimeExample p2 = (PrimeExample) new PalindromeExample();
	 
	 p.writethis();
	 
	 //p2.lastTry();
	 
	 p.lastTryParent();
	 
	 
	 
	 //PalindromeExample.main("gggg"); 
	 System.out.println(p.read());
 }
 public static int read(){
	 System.out.println("child");
	 return 1;
 }
 
 public int writethis(){
	 
	 System.out.println("child hu mai");
	 return 12;
 }
 
 public void lastTry(){
	 System.out.println("lastchild");
 }
 
}  