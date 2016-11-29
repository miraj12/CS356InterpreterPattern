//Non-terminal minus expression
public class MinusExpression implements Expression {

	Expression rightExpression;
	Expression leftExpression;
	
	MinusExpression(Expression left, Expression right){
		leftExpression = left;
		rightExpression = right;
	}

	@Override
	public int interpret() {
		
		return leftExpression.interpret() - rightExpression.interpret();
	}
	
	
}
