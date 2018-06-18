package practice;

public class EnumPrac 
{
	public enum EnumMethodAndLogic
	{
		PLUS,
		MINUS,
		MULTIPLY,
		DIVIDE;
		
		double calculate(double x, double y)
		{
			switch (this)
			{
			case PLUS:
				return x + y;
			case MINUS:
				return x - y;
			case MULTIPLY:
				return x*y;
			case DIVIDE:
				return x/y;
			default:
				throw new AssertionError("Unkown operations " + this);
			}
		}
	}
	
	public enum UserStatus
	{
		PENDING,
		ACTIVE,
		INACTIVE,
		DELETED;
	}
}
