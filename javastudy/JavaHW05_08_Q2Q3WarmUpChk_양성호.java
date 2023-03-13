package classes;

class JavaHW05_08_Q2Q3WarmUpChk_양성호 
{
	public static void main(String[] args) 
	{
		int vI01 = 100;
		String vS01 = "Orange";
		
		System.out.println(vI01 == 100); // true --> primitive type 값 == 값
		System.out.println(vS01 == args[0]); // false --> reference type 주소 == 값
		System.out.println(vS01.equals(args[0])); // reference type 주소와 값을 비교하기 위해서는 equals 메서드를 사용

	}
}
