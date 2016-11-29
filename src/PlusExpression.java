//Non-terminal plus expression
public class PlusExpression implements Expression {
	Expression rightExpression;
	Expression leftExpression;
	
	PlusExpression(Expression left, Expression right){
		leftExpression = left;
		rightExpression = right;
	}

	@Override
	public int interpret() {
		
		return leftExpression.interpret() + rightExpression.interpret();
	}
	
}
