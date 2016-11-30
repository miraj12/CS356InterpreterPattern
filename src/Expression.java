/*
 * CS 356 Object Oriented Programming
 * Instructor - Yu Sun
 * Interpreter Design Pattern Example
 * Interpret Reverse Polish Expression(postfix)
 * Team - 9
 * Miraj Patel, Adrian Cuellar, Fahad Ahmed, Quang Bui
 */


//Abstract expression
public interface Expression {
	public int interpret();
}
