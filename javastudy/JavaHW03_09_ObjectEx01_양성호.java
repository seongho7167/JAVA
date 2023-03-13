package classes;

class JavaHW03_09_ObjectEx01_양성호
{
	String name = "양성호";
	double kor = 0.1;
	double eng = 0.1;
	double math = 98;
	double sum = kor + eng + math;
	double avg = sum / 3;
	double x = kor * eng;

	public static void main(String[] args) 
	{
		JavaHW03_09_ObjectEx01_양성호 HomeWorkObj = new JavaHW03_09_ObjectEx01_양성호();

		System.out.println("이름   국어   영어    수학   합계   평균");
		System.out.println("-------------------------------------");
		System.out.println(HomeWorkObj.name+"   " +HomeWorkObj.kor+"    "+HomeWorkObj.eng+"   "+HomeWorkObj.math+"   "+HomeWorkObj.sum+"   "+HomeWorkObj.avg);
		System.out.println(HomeWorkObj.x);
	}
}
