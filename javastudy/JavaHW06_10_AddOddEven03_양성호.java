package classes;

class JavaHW06_10_AddOddEven03_양성호 
{
	int value1, value2;
	void mAdd(){ // 반복 합계
		int result = 0;
		for(int i = value1; i <= value2; i++){
			result += i;
		}
		System.out.println(value1+"~"+value2+" 사이의 합: "+result);
	}
	
	void mOdd(){ // 홀수 합계
		int result = 0;
		for(int i = value1; i <= value2; i++){
			if(i % 2 != 0){
				result += i;
			}			
		}
		System.out.println(value1+"~"+value2+" 사이의 홀수 합:"+result);
	}

	void mEven(){ // 짝수 합계
		int result = 0;
		for(int i = value1; i <= value2; i++){
			if(i % 2 == 0){
				result += i;
			}			
		}
		System.out.println(value1+"~"+value2+" 사이의 짝수 합:"+result);
	}

	public static void main(String[] args) 
	{
		JavaHW06_10_AddOddEven03_양성호 obj = new JavaHW06_10_AddOddEven03_양성호(); // 객체 생성

		obj.value1 = Integer.parseInt(args[0]); // 첫번째 입력값
		obj.value2 = Integer.parseInt(args[1]); // 두번재 입력값

		obj.mAdd(); // 합계호출
		obj.mOdd(); // 홀수합계호출
		obj.mEven(); // 짝수합계호출
	}
}
