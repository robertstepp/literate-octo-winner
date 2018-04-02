import javax.swing.JOptionPane;

public class Main {
	public static processes procs = new processes();

	public static void main(String[] args) {
		int columnStart = Integer.parseInt(
				JOptionPane.showInputDialog(
						"Wha tis the largest number in the series? (The second column from the left.)"));
		int columnEnd = Integer.parseInt(JOptionPane.showInputDialog(
				"What is the lowest number in the series? (The far right column.)"));
		if (columnStart < 1) {
			JOptionPane.showMessageDialog(null,
					"No digits requested. Please restart.");
		} else if (columnStart > 10) {
			JOptionPane.showMessageDialog(null,
					"Unsure of result at this time. Please try with a number lower then 10.");
		} else {
			procs.createDict(columnStart, columnEnd);
			// System.out.println(procs.retriveDict());
		}
		System.out.println(procs.retrivePrevious());

	}
}
