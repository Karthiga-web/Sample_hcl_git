package operations;

final public class MultiplyOperation {
	float a = 0;
	float b = 0;
	public void setA(float input){
		this.a = input;
	}
	public void setB(float input){
		this.b = input;
	}
	public double getResult() {
		return this.a * this.b;
	}
}
