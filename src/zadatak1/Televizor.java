package zadatak1;

public class Televizor extends KucniAparat {
	private int program;

	public Televizor(boolean ukljucen, String markaIModel, int program) {
		
		super(ukljucen, markaIModel);
		if(program<1 || program>40) {
			program=1;
			System.out.println("GRESKA");
		}
		else
			this.program = program;
	}
	public void promeniProgram(int program) {
		if(program>=1 && program<=40)
			this.program = program;
	}
	public String toString() {
		return super.toString()+" PROGRAM: "+program;
	}
}
