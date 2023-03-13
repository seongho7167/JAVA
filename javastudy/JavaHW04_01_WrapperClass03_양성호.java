package classes;

class JavaHW04_01_WrapperClass03_양성호
{
	String kor = "100";
	String eng = "98";
	String math = "97";
	public static void main(String[] args) 
	{
		JavaHW04_01_WrapperClass03_양성호 HomeWorkObj = new JavaHW04_01_WrapperClass03_양성호();

		System.out.println("합계   평균");
		System.out.println("-------------------------------------");
		System.out.println(HomeWorkObj.sum+"   "+HomeWorkObj.avg);
	}
}
