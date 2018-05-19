package random;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null,"How old are you?");	
		int x =  Integer.parseInt(answer);
		if(x>18) {
		JOptionPane.showMessageDialog(null,"You do you think should be the new president?");}
		else if(x<18) {
		JOptionPane.showMessageDialog(null,"You are a little kid who is annoying now get out of my way cause no one cares about u.");}














}		
}
