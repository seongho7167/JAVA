package classes;

class JavaHW05_04_ifEx01_양성호 
{
	static void printTimeText(int _time){
		if (_time < 10) {
		  System.out.println("Good morning.");
		} else if (_time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
	}

	public static void main(String[] args) 
	{
		if (20 > 18) {
		  System.out.println("20 is greater than 18");
		}

		int x = 20;
		int y = 18;
		if (x > y) {
		  System.out.println("x is greater than y");
		}

		int time = 20;
		printTimeText(time);

		time = 22;
		printTimeText(time);
		
		time = 9;
		printTimeText(time);
		
		time = 15;
		printTimeText(time);
	}
}
