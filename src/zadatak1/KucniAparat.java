package zadatak1;

public class KucniAparat {
	private boolean ukljucen;
	private String markaIModel;
	public KucniAparat(boolean ukljucen, String markaIModel) {
		super();
		this.ukljucen = ukljucen;
		this.markaIModel = markaIModel;
	}
	public void ukljuciIskljuci() {
		if(ukljucen)
			ukljucen = false;
		else
			ukljucen = true;
	}
	public String toString() {
		return "MARKA I MODEL: "+markaIModel+" UKLJUCEN: "+ukljucen;
	}
	public boolean equals(Object obj) {
		if (obj instanceof KucniAparat) {
	
			KucniAparat k = (KucniAparat)obj;
			if(markaIModel == k.markaIModel)
				return true;
			else return false;
			
		
		}else 	return false;
	}
	

	
	
}
