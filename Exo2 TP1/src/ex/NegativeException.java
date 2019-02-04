package ex;

public class NegativeException extends Exception{

	public NegativeException () {
		System.out.println("le nombre est négatif");
	}
	
	public String toString() 
	{
		return "le nombre est négatif";
	}	
}

