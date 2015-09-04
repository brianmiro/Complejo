package Package_Complejo;
import java.math.*;
	@SuppressWarnings("unused")
	/**
	 * Clase complejo donde estan implementados los metodos y atributos 
	 * para realizar operaciones con numeros complejos
	 * 
	 */
	
public  class Complejo implements TadComplejo {
		//atributos
		private double real,imag; 
	
Complejo(double real, double imag){ 
/** Constructor de la clase abstracta complejo 
 * @param real
 * @param imag
 */
setReal(real);
setImaginaria(imag);}
		
public Complejo(){ 
/**
 * Constructor de la clases sobrecargado
 *@return 
 */
setReal(0);
setImaginaria(0);}	
		
public double  getReal(){ //getter que devuelve la parte real del complejo.
			return this.real;
			}
		
public double getImaginaria(){ //getter que me devuelve la parte imaginaria del complejo
			return this.imag;
			}
		
public void setReal(double real){//setter que establece (asigna) la parte real, no devuelve nada al método que lo invoca.
			this.real=real;
			}
		
public void setImaginaria(double imag){//setter para establecer la parte imaginaria.
			this.imag=imag;
			}
		
public void suma(Complejo a, Complejo b){
			setReal(a.getReal()+b.getReal());
			setImaginaria(a.getImaginaria()+b.getImaginaria());
			}
		
public void multiplica(Complejo a, Complejo b){
	setReal(a.getReal()*b.getReal()-a.getImaginaria()*b.getImaginaria());
	setImaginaria(a.getImaginaria()*b.getReal()+a.getReal()*b.getImaginaria());
}
public void resta(Complejo a, Complejo b){
			setReal(a.getReal()-b.getReal());
			setImaginaria(a.getImaginaria()-b.getImaginaria());
			}
		
public void divide(Complejo a, Complejo b){
			
if( Math.pow(b.getReal(),2)+Math.pow(b.getImaginaria(),2)!=0){
	setReal(a.getReal()*b.getReal()+a.getImaginaria()*b.getImaginaria()/ Math.pow(b.getReal(),2)+Math.pow(b.getImaginaria(),2));
	setImaginaria(a.getImaginaria()*b.getReal()-a.getReal()*b.getImaginaria()/ Math.pow(b.getReal(),2)+Math.pow(b.getImaginaria(),2));
			
			}}
public void conjugado(Complejo a){
		setReal(a.getReal());
		setImaginaria((-1*a.getImaginaria()));
			}
public void conjugado(){
	setImaginaria(-1*getImaginaria());}
		
public double modulo(){
	return Math.sqrt(Math.pow(getReal(), 2)+Math.pow(getImaginaria(), 2));}
public void Potencia(Complejo a,int exp){
			}
	
}
