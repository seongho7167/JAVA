package classes;

class JavaHW04_05_DutchPayEx01_양성호 
{

	double price, dessert, count;

	double mDutch(String _price, String _dessert, String _count){
		double result;
		price = Double.valueOf(_price);
		dessert = Double.valueOf(_dessert);
		count = Double.valueOf(_count);
		result = (price + dessert) / count;
		return result;
	}

	public static void main(String[] args) 
	{
		JavaHW04_05_DutchPayEx01_양성호 dutchObj = new JavaHW04_05_DutchPayEx01_양성호();

		double result = dutchObj.mDutch(args[0], args[1], args[2]);

		System.out.println("식비 총가격: " + dutchObj.price);
		System.out.println("디저트 총가격: " + dutchObj.dessert);
		System.out.println("인원수: " + dutchObj.count);
		System.out.println("------------------------");
		System.out.println("인당 지불가격: "+result);
	}
}
