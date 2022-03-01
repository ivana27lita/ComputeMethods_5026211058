import java.util.Random;

class ComputeMethods5026211058{
	public double fToC(double degreesF){
		return (double) 5/9*(degreesF-32);
	}
	
	public double hypotenuse(int a, int b){
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}	

	public int roll(){
		Random num = new Random();
		int diceNum1 = num.nextInt(6) + 1;
		int diceNum2 = num.nextInt(6) + 1;
		
		return diceNum1 + diceNum2;
	}
		
}