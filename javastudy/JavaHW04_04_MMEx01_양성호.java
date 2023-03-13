package classes;

class JavaHW04_04_MMEx01_양성호 
{
	String name = "양성호";
	int kor = 100;
	int eng = 99;
	int math = 98;
	int sum;
	int avg;

	void mSum(){
		sum = kor + eng + math;
	}

	void mAvg(){
		avg = sum/3;
	}
	
	public static void main(String[] args) 
	{
		JavaHW04_04_MMEx01_양성호 obj = new JavaHW04_04_MMEx01_양성호();

		obj.mSum();
		obj.mAvg();

		System.out.println(obj.sum+"   "+obj.avg);
	}
}
