package classes;

class JavaHW04_03_WrapperClass03_양성호
{
	int kor, eng, math;
	public static void main(String[] args) 
	{
		JavaHW04_03_WrapperClass03_양성호 objTest = new JavaHW04_03_WrapperClass03_양성호();

		objTest.kor = Integer.parseInt(args[0]);
		objTest.eng = Integer.parseInt(args[1]);
		objTest.math = Integer.parseInt(args[2]);

		int sum = objTest.kor + objTest.eng + objTest.math;
		double avg = sum / 3;

		System.out.println("합계   평균");
		System.out.println("-------------------------------------");
		System.out.println(sum+"   "+avg);
	}
}
