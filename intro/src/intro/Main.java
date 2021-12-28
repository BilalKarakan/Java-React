package intro;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello World!");
		String internetSubeButonu = "�nternet �ubesi";
		System.out.println(internetSubeButonu);
		
		double dolarDun = 11.11;
		double dolarBugun = 11.22;
		int vade = 36;
		boolean dustuMu = false;
		
		if(dolarBugun < dolarDun) {
			System.out.println("Dolar D��t� Resmi");
		}else if(dolarBugun == dolarDun){
			System.out.println("Dolar E�ittir Resmi");
		}else {
			System.out.println("Dolar Y�kseldi Resmi");
		}
		
		String kredi1 = "�htiya� Kredisi";
		String kredi2 = "Konut Kredisi";
		String kredi3 = "Ta��t Kredisi";
		String kredi4 = "Emekli Kredisi";
		String kredi5 = "��renci Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		String[] krediler =
			{
					"�htiya� Kredisi",
					"Konut Kredisi",
					"Ta��t Kredisi",
					"Emekli Kredisi",
					"��renci Kredisi"
			};
		
		//foreach
		for(String kredi:krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		//Value Type
		int number1 = 10;
		int number2 = 20;
		number1 = number2;
		number2 = 30;
		System.out.println(number1);
		
		//Reference Type
		int[] numbers1 = {1,2,3,4,5};
		int[] numbers2 = {10,20,30,40,50};
		numbers1 = numbers2;
		numbers2[0] = 100;
		System.out.println(numbers1[0]);
		
		String city1 = "Ankara";
		String city2 = "�stanbul";
		city1 = city2;
		city2 = "�zmir";
		System.out.println(city1);
	}

}
