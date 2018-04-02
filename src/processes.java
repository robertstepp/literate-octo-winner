import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class processes {
	public static Dictionary<Integer, Integer> numbers = new Hashtable<Integer, Integer>();
	private int columnCount = 0;
	private ArrayList<BigInteger> previousIterations = new ArrayList<>();

	public void createDict(int columns) {
		columnCount = columns;
		for (int i = columns - 1; i >= 0; i--) {
			numbers.put(i, 1);
		}
		createNumber();

	}

	public Dictionary<Integer, Integer> retriveDict() {
		return numbers;

	}

	public ArrayList<BigInteger> retrivePrevious() {
		return previousIterations;
	}

	// public void countNumbers() {
	// ArrayList<Integer> countNumber;
	// for (int i = 0; i < columnCount; i++) {
	//
	// }
	//
	// }
	public void createNumber() {
		String number = "";
		for (int it = columnCount - 1; it >= 0; it--) {
			number = number + numbers.get(it) + it;

		}
		BigInteger numberParsed = new BigInteger(number);
		previousIterations.add(numberParsed);
	}

}
