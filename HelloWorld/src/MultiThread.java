
	
	class MultiThread extends Thread{  
		 public void run(){  

				// TODO Auto-generated method stub
				  for(int i=1;i<5;i++){ 
						
					    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
					    System.out.println(i);  
					  }
			}

		public static void main(String args[]){  
			 MultiThread t1=new MultiThread();  
			 MultiThread t2=new MultiThread();
			/* MultiThread t3=new MultiThread();
			 MultiThread t4=new MultiThread();  
			 MultiThread t5=new MultiThread();
			 MultiThread t6=new MultiThread();*/
		   
		  t1.start();  
		  t2.start();  
		 /* t3.start();
		  t4.start();  
		  t5.start();  
		  t6.start();*/
		 }  
}