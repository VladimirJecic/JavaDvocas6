package zadatak1.proba;

import zadatak1.KucniAparat;
import zadatak1.Televizor;

public class ProbaKucniAparat {

	public static void main(String[] args) {
		KucniAparat k1 = new KucniAparat(true, "Laptop Acer A315");
		KucniAparat k2 = new KucniAparat(true, "Laptop Acer A315");
		
		k1.ukljuciIskljuci();
		Televizor t1 = new Televizor(true, "Samsung UE40", 1);
		Televizor t2 = new Televizor(true, "Samsung UE40", 1);
		
		t1.ukljuciIskljuci();
		t1.promeniProgram(5);
		
		//ova referenca je sadrzati samo adresu klase televizor sve dok mi ne redefinisemo
		//javnu metodu toString
		KucniAparat kp = t1;
		
		kp.ukljuciIskljuci();
		System.out.println(kp);
		
		if (kp.equals(k2)) {
			System.out.println("Uneti objekat jeste kucni aparat");
		}else
			System.out.println("Uneti objekat nije kucni aparat");
		System.out.println(t2);
	}

}
