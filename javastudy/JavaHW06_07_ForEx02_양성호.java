package classes;

class JavaHW06_07_ForEx02_양성호
{
	public static void main(String[] args) 
	{
		int vI01 = 10;
		vI01 = vI01 + 2;
		System.out.println(vI01);
		vI01 += 2;
		System.out.println(vI01);
		
		for(int i = 0; i < 5; i++){
			System.out.println(i); // 0 1 2 3 4
		}

/** 
	감소 반복문
*/
		
		for(int i = 5; i >= 0; i--){
			System.out.println(i); // 5 4 3 2 1 0
		}
//---------------------------------------------------------

		for(int i = 0; i <= 10; i+=2){
			System.out.println(i); // 0 2 4 6 8 10
		}
	}
}
