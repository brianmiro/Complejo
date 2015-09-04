package Package_Complejo;
/**
 * 
 * @author Brian
 *
 */
public interface TadComplejo {
	double getReal();
	double getImaginaria();
    void setReal(double real);
    void setImaginaria(double imag);
	void suma(Complejo a,Complejo b);
	void multiplica(Complejo a, Complejo b);
	void resta(Complejo a,Complejo b);
	void divide(Complejo a, Complejo b);
	void conjugado(Complejo a);
	void conjugado();
	double modulo();
	
	
	
}
