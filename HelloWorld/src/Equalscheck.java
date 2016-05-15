
public class Equalscheck {
	String name;
	
	public Equalscheck(String name) {
		super();
		this.name = name;
	}
	public Equalscheck() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Equalscheck e1= new Equalscheck("shobhit1");
		Equalscheck e2= new Equalscheck("shobhit");
		
		System.out.println(e1.equals(e2));
		
		System.out.print("["+ e1.toString()+ ","+e2.toString()+ "]");
		System.out.println(e2.toString());
	}
	@Override
	public String toString() {
		
		return name;
	}
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equalscheck other = (Equalscheck) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/

}
