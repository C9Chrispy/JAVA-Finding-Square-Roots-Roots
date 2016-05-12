
public class NewtonBisect {
	int counter = 0;
	public double f(double number, double guess){
		double ans = guess - (number*number);
		return ans;
	}
	public double NewtonFind(float number, double epsilon) {
		double guess = 1;
		double NGuess = 0.5*(guess+(2/guess));
		double diff = NGuess-guess;
		while (Math.abs(diff) > epsilon) {
			counter++;
			guess = NGuess;
			NGuess = 0.5*(guess+(2/guess));
			diff = NGuess-guess;
		}
		// System.out.println(guess);
		return guess;
	}
	public static void main(String[] args){
		NewtonBisect testThis = new NewtonBisect();
		int number = 3;
		double epsilon = 0.000001;
		testThis.NewtonFind(number, epsilon);
	}
}
