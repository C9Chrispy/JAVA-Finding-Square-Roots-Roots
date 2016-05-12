
public class NewtonMain extends NewtonBisect{
	double epsilon = 0.000001;
	public void makeTable() {
		for (int i = 2; i <= 20; i++) {
			System.out.println("Square root of " + i + " is: " + NewtonFind(i, epsilon));
		}
		System.out.println("Total function evaluations: " + counter);
	}
	public static void main(String[] args){
		NewtonMain testThis = new NewtonMain();
		testThis.makeTable();
	}
}
