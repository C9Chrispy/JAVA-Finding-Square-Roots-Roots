
public class BisectMain extends Bisect {
	double epsilon = 0.000001;
	public void makeTable() {
		for (int i = 2; i <= 20; i++) {
			System.out.println("Square root of " + i + " is: " + sqRootFind(epsilon,i));
		}
		System.out.println("Total function evaluations: " + counter);
	}
	public static void main(String[] args){
		BisectMain testThis = new BisectMain();
		testThis.makeTable();
	}
}
