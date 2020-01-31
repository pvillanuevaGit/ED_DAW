package calculadora;

public class Calculadora {

	private int num1;
	private int num2;
	
	public Calculadora(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	public int suma() {
		int resul = num1 + num2;
		return resul;
	}
	
	public int resta() {
		int resul = num1 - num2;
		return resul;
	}	
	
	public boolean resta2() {
		if(num1>=num2) {
			return true;
		}
		else{
			return false;
		}
	}
	
	public int multiplica() {
		int resul = num1 * num2;
		return resul;
	}
	
	public int divide() {
		int resul = num1/num2;
		return resul;
	}	
	
	public Integer divide2() {
		if(num2==0) {
			return null;
		}
		int resul = num1/num2;
		return resul;
		
	}
	
	public String tabla() {
		return "1 * 1 = 1\n1 * 2 = 2\n1 * 3 = 3\n1 * 4 = 4\n1 * 5 = 5\n1 * 6 = 6\n1 * 7 = 7\n1 * 8 = 8\n1 * 9 = 9\n1 * 10 = 10\n"+
				"2 * 1 = 2\n2 * 2 = 4\n2 * 3 = 6\n2 * 4 = 8\n2 * 5 = 10\n2 * 6 = 12\n2 * 7 = 14\n2 * 8 = 16\n2 * 9 = 18\n2 * 10 = 20\n";
	}

}
