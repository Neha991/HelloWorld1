import java.util.*;  
import java.util.concurrent.CopyOnWriteArrayList;
import java.io.*;  
  
class TestSort3{  
public static void main(String args[]){  
  
CopyOnWriteArrayList al=new CopyOnWriteArrayList();  
al.add("A");  
al.add("B");  
al.add("C"); 

  
Collections.synchronizedCollection(al);  
Iterator itr=al.iterator();  

while(itr.hasNext()){  
//Student st=(Student)itr.next();  

System.out.println(itr.next()); 
al.remove("A");

new Student(123, "Shibhname", 23){
	public  void read(){
		System.out.println("bbbbbb");
	}
}.read();
  }  
}  
} 