import javax.swing.JOptionPane;

public class Main {
	public static processes procs = new processes();

	public static void main(String[] args) {
		int columns = Integer.parseInt(
				JOptionPane.showInputDialog("How many digits to check to?"));
		if (columns < 1) {
			JOptionPane.showMessageDialog(null,
					"No digits requested. Please restart.");
		} else if (columns > 10) {
			JOptionPane.showMessageDialog(null,
					"Unsure of result at this time. Please try with a number lower then 10.");
		} else {
			procs.createDict(columns);
			// System.out.println(procs.retriveDict());
		}
		System.out.println(procs.retrivePrevious());

	}
}
