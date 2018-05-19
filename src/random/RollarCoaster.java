package random;

import javax.swing.JOptionPane;

public class RollarCoaster {
public static void main(String[] args) {
String answer = JOptionPane.showInputDialog(null,"How tall are u (In inches.)?");	
int x =  Integer.parseInt(answer);
if(x>48) {
JOptionPane.showMessageDialog(null,"You may enter the rollar coaster.");}
else if(x<48) {
JOptionPane.showMessageDialog(null,"You not may enter the rollar coaster.");}















}
}