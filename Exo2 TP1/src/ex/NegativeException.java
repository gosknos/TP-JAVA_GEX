package ex;

public class NegativeException extends Exception{

	public NegativeException () {
		System.out.println("le nombre est n�gatif");
	}
	
	public String toString() 
	{
		return "le nombre est n�gatif";
	}	
}

