
public class Emp {
	int id;
	String name;
	
	public Emp(int id, String name) {
		this.id = id ;
		this.name = name;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || obj.getClass() != getClass()) {
			return false;
		}
		else {
			Emp emp = (Emp) obj;
			if(this.id == emp.getId() && this.name == emp.getName()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 5;
		hash = 7*hash + (this.id);
		hash = 7*hash + (this.name.hashCode());
		return hash;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "Neha");
		Emp e2 = new Emp(1, "Neha");
		if(e1.equals(e2)) {
			System.out.println("true");
			System.out.println(e1.hashCode());
			System.out.println(e2.hashCode());
		}
	}

}
