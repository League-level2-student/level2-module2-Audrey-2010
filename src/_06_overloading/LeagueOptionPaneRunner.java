package _06_overloading;

public class LeagueOptionPaneRunner extends LeagueOptionPane{
	public static void main(String[] args) {
	showMessageDialog("message");
		showMessageDialog("message", "title");
		showMessageDialog("message", "title", "filename");
	}
}

