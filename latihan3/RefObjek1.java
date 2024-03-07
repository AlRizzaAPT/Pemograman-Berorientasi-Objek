package latihan3;

public class RefObjek1 {
	
	    public static void main(String[] args) {
	        
	    int jari2 = 10;

	    Lingkaran l1 = new Lingkaran(5);
	    Lingkaran l2 = l1;
	    System.out.println(l1.getJari2());  
	    System.out.println(l2.getJari2());
	    l1.setJari2(jari2);
	    System.out.println(l1.getJari2());
	    System.out.println(l2.getJari2());
	    }
	}
