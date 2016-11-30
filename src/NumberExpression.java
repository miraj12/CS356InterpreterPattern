/*
 * CS 356 Object Oriented Programming
 * Instructor - Yu Sun
 * Interpreter Design Pattern Example
 * Interpret Reverse Polish Expression(postfix)
 * Team - 9
 * Miraj Patel, Adrian Cuellar, Fahad Ahmed, Quang Bui
 */

//terminal number expression
public class NumberExpression implements Expression {
	private int number;
	
	NumberExpression(int n){
		number = n;
	}
	
	NumberExpression(String s){
		number = Integer.parseInt(s);
	}
	
	@Override
	public int interpret() {
		return number;
	}

}
