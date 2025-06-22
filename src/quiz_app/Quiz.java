package quiz_app;

import javax.swing.JOptionPane;
import java.util.*;

import java.util.Random;
public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Input = "";
		String Mode = "";
		JOptionPane.showMessageDialog(null,"Let's start the quiz","Math Quiz",JOptionPane.INFORMATION_MESSAGE);
		try {
			 Mode = JOptionPane.showInputDialog("Choose the mode:"+"\nEasy"+"\nMedium"+"\nHard");
			 if(!(Mode.equalsIgnoreCase("easy") || Mode.equalsIgnoreCase("medium") || Mode.equalsIgnoreCase("hard"))) throw new Exception();
			 Input = JOptionPane.showInputDialog("Make sure you mentioned only these particular keywords"+"\nAdd"+"\nsub"+"\nmul"+"\ndiv"+"\nmod").toLowerCase();
			 if(!(Input.equalsIgnoreCase("Add") || Input.equalsIgnoreCase("sub") || Input.equalsIgnoreCase("div") || Input.equalsIgnoreCase("mod") || Input.equalsIgnoreCase("mul"))) throw new InputMismatchException();
		}catch(InputMismatchException e) {
			JOptionPane.showMessageDialog(null, "Please Enter valid Operation");
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Please choose valid Mode");
		}
		
		int count = 10;
		Random random = new Random();
		int total = count;
		
		int score = 0;
		
		while(count>0) {
			int a=0,b = 0,answer = 0,result = 0;
			
				if(Mode.equalsIgnoreCase("medium")) {
					  a = random.nextInt(100);
					  b = random.nextInt(100);
				}
				else if(Mode.equalsIgnoreCase("easy")) {
					 a = random.nextInt(20);
					 b = random.nextInt(20);
				}
				else if(Mode.equalsIgnoreCase("hard")) {
					 a = random.nextInt(200);
					 b = random.nextInt(300);
				}
				
			
			
			try {
				switch(Input) {
				case "add":
					 result = a+b;
					answer = Integer.parseInt(JOptionPane.showInputDialog(a+"+"+b));
					if(answer==result) {
						score+=10;
					}
					break;
				case "sub":
					 result = a-b;
					 answer = Integer.parseInt(JOptionPane.showInputDialog(a+"-"+b));
					if(answer==result) {
						score+=10;
					}
					break;
				case "div":
					 result = a/b;
					 answer = Integer.parseInt(JOptionPane.showInputDialog(a+"/"+b));
					if(answer==result) {
						score+=10;
					}
					break;
				case "mod":
					 result = a%b;
					 answer = Integer.parseInt(JOptionPane.showInputDialog(a+"%"+b));
					if(answer==result) {
						score+=10;
					}
					break;
				case "mul":
					 result = a*b;
					 answer = Integer.parseInt(JOptionPane.showInputDialog(a+"*"+b));
					if(answer==result) {
						score+=10;
					}
					break;
				}
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"please Enter Integer values");
				
			}
			count--;
		}
		JOptionPane.showMessageDialog(null, "You scored: "+score+" out of "+total*10,"Score Board",JOptionPane.INFORMATION_MESSAGE);
	
	}

}
