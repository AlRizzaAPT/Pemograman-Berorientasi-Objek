package latihan4;

public class GelasMain {

	public static void main(String[] args) {
		
		Gelas q1 = new Gelas ("Hitam");
		Gelas q2 = new Gelas ("Biru");
		
		tukarWarnaGelas(q1,q2);
		System.out.println("Warna q1 :" + q1.getWarna());
		System.out.println("Warna q2 :" + q2.getWarna());
	}
	
	static void tukarWarnaGelas (Gelas q1, Gelas q2)
	{
		Gelas qTemp = new Gelas ("Temp");
		qTemp.setWarna (q1.getWarna());
		q1.setWarna (q2.getWarna());
		q2.setWarna (qTemp.getWarna());
	}
	
}
