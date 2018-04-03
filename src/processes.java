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
		for (int i = cS; i >= cE; i--) {
			numbers.put(i, i + 1);
		}
		System.out.println(numbers); // Works here
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
		String intValue = number.toString();
		for (int i = intValue.length() - 2; i >= 0; i = i - 2) {
			// System.out.println(i); // Works here
			countNumber
					.add(Integer.parseInt(String.valueOf(intValue.charAt(i))));
		}
		// System.out.println(countNumber); // Works here
		for (int j = columnEnd; j <= columnStart; j++) {
			numbers.put(j, countNumber
					.get(j - 1));
		}
		// System.out.println(numbers); // Works here
	}

	public void createNumber() {
		String number = "";
		for (int it = columnStart; it >= columnEnd; it--) {
			number = number + numbers.get(it) + it;

		}
		BigInteger numberParsed = new BigInteger(number);
		System.out.println(numberParsed);
		countNumbers(numberParsed);
		previousIterations.add(numberParsed);
		checkPrevious(numberParsed);
	}

	public void checkPrevious(BigInteger check) {
		if (previousIterations.contains(check)) {
			exit();
		}
	}

	private void exit() {
		// TODO Auto-generated method stub

	}

}
