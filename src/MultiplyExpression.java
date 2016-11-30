/*
 * CS 356 Object Oriented Programming
 * Instructor - Yu Sun
 * Interpreter Design Pattern Example
 * Interpret Reverse Polish Expression(postfix)
 * Team - 9
 * Miraj Patel, Adrian Cuellar, Fahad Ahmed, Quang Bui
 */

//Non-terminal multiply expression
public class MultiplyExpression implements Expression {
	
	Expression rightExpression;
	Expression leftExpression;
	
	MultiplyExpression(Expression left, Expression right){
		leftExpression = left;
		rightExpression = right;
	}

	@Override
	public int interpret() {
		
		return leftExpression.interpret() * rightExpression.interpret();
	}
	
	

}
