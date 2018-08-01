package Ch09;



public class BoyFriend implements Comparable<BoyFriend> {

	String name;
	int annualSalary;
	double height;

	public BoyFriend(String name, int annualSalary, double height) {
		super();
		this.name = name;
		this.annualSalary = annualSalary;
		this.height = height;
	}

	public String toString() {

		return name + "  ¦~Á~:" + annualSalary  + " ¨­°ª:" +height;
	}

	@Override
	public int compareTo(BoyFriend o) {
		if(this.annualSalary==o.annualSalary) {
			int d= Double.compare(this.height,o.height);
			return -d;
		}
		int h =Integer.compare(this.annualSalary, o.annualSalary); 
		return  -h;
		
	}

}
