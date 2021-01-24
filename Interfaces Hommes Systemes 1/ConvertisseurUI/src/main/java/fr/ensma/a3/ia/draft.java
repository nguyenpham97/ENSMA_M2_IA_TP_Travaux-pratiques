package fr.ensma.a3.ia;

public class draft {
	public static void main(String[] args) {
        
		Boolean n = true;
		
		change(n);
		
		System.out.println(n);
        
        
    }
	
	public static void change(Boolean x) {
    	x = !x;
    	System.out.println(x);
    }
}
