package boleta;
/*Sistema escolar
 * 
 * - Permitir crear alumnos (almacenar con minimo 3 datos)
 * - Almacenar 5 calificaciones por alumno
 * - Calcular el promedio de esas calificaciones
 * - Calcular la materia con la calificacion mas alta y mas baja
 * - Visualizar la informacion del alumno dos veces:
 * 		1.- Solo el nombre y la calificacion final
 * 		2.- Nombre y las calificaciones mayor y menor
 */

import java.util.Objects;

public class Student {
	// 1. Propiedades
	public String firstName;
	public String lastName;
	public int fisica;
	public int matematicas;
	public int poo;
	public int basesDeDatos;
	public int interfaces;
	public int calFinal;
	public int calMin;
	public int calMax;

	// 2. Constructores
	public Student(String firstName, String lastName, int fisica, int matematicas, int poo, int basesDeDatos,
			int interfaces) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.fisica = fisica;
		this.matematicas = matematicas;
		this.poo = poo;
		this.basesDeDatos = basesDeDatos;
		this.interfaces = interfaces;
	}

	// 3. Métodos
	public void calculateMean() {
		this.calFinal=(fisica+matematicas+poo+basesDeDatos+interfaces)/5;
		System.out.println(this.calFinal);
	}
	
	public void calculateMean(String name) {
		this.calMax=Math.max(fisica,matematicas);
		this.calMax=Math.max(this.calMax,poo);
		this.calMax=Math.max(this.calMax,basesDeDatos);
		this.calMax=Math.max(this.calMax,interfaces);
	
		int array[] = {fisica,matematicas,poo,basesDeDatos,interfaces};
		this.calMin = array[0];
		
		for(int i=0;i<5;i++) {
			if(array[i]<this.calMin)
				this.calMin=array[i];};
		
		System.out.println("La calificación de "+name+" máxima es: "+this.calMax+" y la mínima es: "+this.calMin);
	}



	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", fisica=" + fisica + ", matematicas="
				+ matematicas + ", poo=" + poo + ", basesDeDatos=" + basesDeDatos + ", interfaces=" + interfaces
				+ "]";
	}



		
	
	
	
	
	
}// Main
