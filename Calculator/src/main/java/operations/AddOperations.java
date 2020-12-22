package operations;

final public class AddOperations {

	float a = 0;
	float b = 0;
	public void setA(float numA){
		this.a = numA;
	}
	public void setB(float input){
		this.b = input;
	}
	public double getResult() {
		return this.a + this.b;
	}
}
