import boleta.Student;

public class testBoleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Francisco = new Student ("Francisco", "Briseño", 100, 95, 90, 100, 80);
		
		System.out.println(Francisco);
		System.out.println("Promedio de Francisco: ");
		Francisco.calculateMean();
		System.out.println();
		Francisco.calculateMean("Francisco");
		System.out.println();
		
		
		
		
	}

}
