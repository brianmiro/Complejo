package Package_Complejo;
import java.util.Scanner;

public class Principal  {
	
	public static void main (String args[]){
		
		Complejo comp1 =new Complejo();
		Complejo comp2 =new Complejo();
		Complejo comp3=new Complejo();
		//Scanner teclado= new Scanner(System.in);
		
		
		comp1.setReal(2);
		comp1.setImaginaria(3);
		comp2.setReal(2);
		comp2.setImaginaria(3);
		//comp1.conjugado();
		comp3.multiplica(comp1, comp2);
		//System.out.println(comp1.getImaginaria());
		System.out.println("Parte Real : "+comp3.getReal());
		System.out.println("Parte Img : "+comp3.getImaginaria());
		
	}

	

}
