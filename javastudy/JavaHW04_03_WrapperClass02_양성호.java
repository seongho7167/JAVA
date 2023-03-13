package classes;

class JavaHW04_03_WrapperClass02_양성호
{
	String kor, eng, math;
	public static void main(String[] args) 
	{
		JavaHW04_03_WrapperClass02_양성호 objTest = new JavaHW04_03_WrapperClass02_양성호();

		objTest.kor = args[0];
		objTest.eng = args[1];
		objTest.math = args[2];

		int sum = Integer.parseInt(objTest.kor) + Integer.parseInt(objTest.eng) + Integer.parseInt(objTest.math);
		double avg = sum / 3;

		System.out.println("합계   평균");
		System.out.println("-------------------------------------");
		System.out.println(sum+"   "+avg);
	}
}
