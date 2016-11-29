
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
