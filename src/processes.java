import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class processes {
	public static Dictionary<Integer, Integer> numbers = new Hashtable<Integer, Integer>();
	private int columnStart = 0;
	private int columnEnd = 0;
	private ArrayList<BigInteger> previousIterations = new ArrayList<>();

	public void createDict(int cS, int cE) {
		columnStart = cS;
		columnEnd = cE;
		for (int i = columnStart; i >= columnEnd; i--) {
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

	public void countNumbers(BigInteger number) {
		ArrayList<Integer> countNumber = new ArrayList<>();
		char[] numberChar = ("" + number).toCharArray();
		System.out.println(numberChar);
		for (int i = 0; i < numberChar.length; i = i + 2) {
			// countNumber.add(numberChar[i]);
		}
		System.out.println(countNumber.size());
		System.out.println(countNumber);
		for (int i = 0; i < countNumber.size(); i++) {
			System.out.println(countNumber.get(i).toString());
		}
	}

	public void createNumber() {
		String number = "";
		for (int it = columnStart; it >= columnEnd; it--) {
			number = number + numbers.get(it) + it;

		}
		BigInteger numberParsed = new BigInteger(number);
		countNumbers(numberParsed);
		previousIterations.add(numberParsed);
	}

}
