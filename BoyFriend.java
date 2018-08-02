package Ch09;

import java.util.Comparator;

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
		return name + "  ¦~Á~:" + annualSalary + " ¨­°ª:" + height;
	}

	@Override
	public int compareTo(BoyFriend o) {
		if (o.annualSalary == this.annualSalary) {
			return Double.compare(o.height, this.height);
		}
		return Integer.compare(o.annualSalary, this.annualSalary);
	}

}
