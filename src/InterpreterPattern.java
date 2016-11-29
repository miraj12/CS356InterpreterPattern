import java.util.Stack;


/*
 * CS 356 Object Oriented Programming
 * Instructor - Yu Sun
 * Interpreter Design Pattern Example
 * Interpret Reverse Polish Expression(postfix)
 * Team - 9
 * Miraj Patel, Adrian Cuellar, Fahad Ahmed, Quang Bui
 */


/*
 * Client class with context string to interpret
 * this class also provides the parser and creates expression tree.
 */
public class InterpreterPattern {

	public static void main(String[] args) {
		//(7 - 3) * (2 + 1)
		String tokenString = "7 3 - 2 1 + *";       // Context 
		
		Stack<Expression> stack = new Stack<>();
		
		String[] tokenList = tokenString.split(" ");
		
		for(String s : tokenList){
			
			// if operator than pop last two value and interpret the expression
			if(isOperator(s)){                
				
				Expression right = stack.pop();
				Expression left = stack.pop();
				Expression operator = getOperatorInstance(s,left,right);
				
				stack.push(operator);
			
			} else{
				Expression i = new NumberExpression(s);    // if number than push on stack
				stack.push(i);
			}
		
		}
		
		
		System.out.println("Result: " + stack.pop().interpret()); // print result

	}
	
	public static boolean isOperator(String s){
		
		if(s.equals("+") || s.equals("-") || s.equals("*")){
			return true;
		} else{
			return false;
		}
	}
	
	
	
	public static Expression getOperatorInstance(String s, Expression left, Expression right){
		switch(s){
		case "+":
			return new PlusExpression(left, right);
		case "-":
			return new MinusExpression(left,right);
		case "*":
			return new MultiplyExpression(left,right);
		}
		return null;
	}

}
