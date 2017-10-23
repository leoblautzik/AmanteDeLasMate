import java.util.ArrayList;
import java.util.Collections;

//Juan es un amante de las matemáticas, está enamorado de los naturales, 
//pero no de todos por igual. Le gustan más los pares que los impares, 
//y en segundo lugar, prefiere los que son divisibles por 3. 
//Cuando con estos criterios empata, prefiere los más chicos. 
//Escriba un programa en java que ordene los elementos de
//un arreglo de números naturales de longitud N, 
//de acuerdo al criterio de preferencia de Juan.  
public class AmanteDeLasMate {
	
	private class Natural implements Comparable<Natural>{
		public Integer natural;
		
		public void setNatural(Integer natural) {
			if (natural>0)
				this.natural = natural;
		}


		public Natural(int n){
			this.setNatural(n);
		}
		

		@Override
		public String toString() {
			return this.natural.toString();
		}


		@Override
		public int compareTo(Natural o) {
			if (this.natural%2==0 && o.natural%2!=0)
				return -1;
			if (this.natural%2==0 && o.natural%2==0)
				if (this.natural%3==0 && o.natural%3!=0)
					return -1;
				if (this.natural%3==0 && o.natural%3==0)
					return this.natural.compareTo(o.natural);
			return 0;
		}
		
	}
	
	private ArrayList<Natural> naturales;
	
		
	public AmanteDeLasMate() {
		this.naturales = new ArrayList<Natural>();
	}
	
	public void agregarNatural(int n){
		this.naturales.add(new Natural(n));
	}
	
	public void ordenaJuan(){
		Collections.sort(this.naturales);
	}
	
	public void mostrar(){
		for(Natural cadaUno : this.naturales)
			System.out.println(cadaUno);
	}

	public static void main(String[] args) {
	
		AmanteDeLasMate adlm = new AmanteDeLasMate();
		adlm.agregarNatural(3);
		adlm.agregarNatural(10);
		adlm.agregarNatural(1);
		adlm.agregarNatural(40);
		adlm.agregarNatural(3);		
		adlm.agregarNatural(5);
		adlm.agregarNatural(7);
		adlm.agregarNatural(12);
		adlm.mostrar();
		adlm.ordenaJuan();
		System.out.println("----------------------------------------");
		adlm.mostrar();
	
	}

}
