package intro;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello World!");
		String internetSubeButonu = "Ýnternet Þubesi";
		System.out.println(internetSubeButonu);
		
		double dolarDun = 11.11;
		double dolarBugun = 11.22;
		int vade = 36;
		boolean dustuMu = false;
		
		if(dolarBugun < dolarDun) {
			System.out.println("Dolar Düþtü Resmi");
		}else if(dolarBugun == dolarDun){
			System.out.println("Dolar Eþittir Resmi");
		}else {
			System.out.println("Dolar Yükseldi Resmi");
		}
		
		String kredi1 = "Ýhtiyaç Kredisi";
		String kredi2 = "Konut Kredisi";
		String kredi3 = "Taþýt Kredisi";
		String kredi4 = "Emekli Kredisi";
		String kredi5 = "Öðrenci Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		String[] krediler =
			{
					"Ýhtiyaç Kredisi",
					"Konut Kredisi",
					"Taþýt Kredisi",
					"Emekli Kredisi",
					"Öðrenci Kredisi"
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
		String city2 = "Ýstanbul";
		city1 = city2;
		city2 = "Ýzmir";
		System.out.println(city1);
	}

}
