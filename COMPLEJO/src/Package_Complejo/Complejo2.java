package Package_Complejo;

public class Complejo2 extends Complejo  {

public void multiplica(Complejo a, Complejo b){
		setReal(a.getReal()*b.getReal()-a.getImaginaria()*b.getImaginaria());
		setImaginaria(a.getImaginaria()*b.getReal()+a.getReal()*b.getImaginaria());
	}

}
