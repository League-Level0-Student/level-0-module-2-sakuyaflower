package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {

int r = 0;

	Random gen = new Random();
	String lotto = ""; 
	for( int i = 0; i<5; i++) {
		
		
		r = gen.nextInt(100);
	   lotto += r+" ";
	
	
	
	
	}
	JOptionPane.showMessageDialog(null, lotto);
	}
}