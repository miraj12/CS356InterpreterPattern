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
