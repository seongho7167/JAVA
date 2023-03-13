package classes;

class JavaHW05_03_ArithmeticChk01_양성호 
{
	public static void main(String[] args) 
	{
		System.out.println("10/2 = " + (10/2));
		System.out.println("10/3 = " + (10/3));
		System.out.println("10%2 = " + (10%2));
		System.out.println("10%3 = " + (10%3));
		
		int vI01 = 10;
		vI01 = vI01 + 1;
		System.out.println("vI01: "+vI01);

		vI01 = vI01 - 1;
		System.out.println("vI01: "+vI01);


		int vI02 = 10;
		vI02++;
		System.out.println("vI02: "+vI02);

		vI02--;
		System.out.println("vI02: "+vI02);
		

		/**
			단항 전위연산 : 자기항 먼저계산
			단항 후위연산 : 자기항 나중계산
		*/
		int vI03 = 10;
		System.out.println("vI03: "+(++vI03));
		System.out.println("vI03: "+(--vI03));

		System.out.println("(후위연산)vI03: "+(vI03++));
		System.out.println("(후위연산결과) vI03: "+vI03);
		System.out.println("(후위연산)vI03: "+(vI03--));
		System.out.println("(후위연산결과)vI03: "+vI03);
	}
}
