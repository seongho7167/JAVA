package classes;

class JavaHW06_09_AddOddEven02_양성호 
{

	void mAdd(int _value1,int _value2){ // 반복 합계
		int result = 0;
		for(int i = _value1; i <= _value2; i++){
			result += i;
		}
		System.out.println(_value1+"~"+_value2+" 사이의 합: "+result);
	}
	
	void mOdd(int _value1,int _value2){ // 홀수 합계
		int result = 0;
		for(int i = _value1; i <= _value2; i++){
			if(i % 2 != 0){
				result += i;
			}			
		}
		System.out.println(_value1+"~"+_value2+" 사이의 홀수 합:"+result);
	}

	void mEven(int _value1,int _value2){ // 짝수 합계
		int result = 0;
		for(int i = _value1; i <= _value2; i++){
			if(i % 2 == 0){
				result += i;
			}			
		}
		System.out.println(_value1+"~"+_value2+" 사이의 짝수 합:"+result);
	}

	public static void main(String[] args) 
	{
		int value1 = Integer.parseInt(args[0]); // 첫번째 입력값
		int value2 = Integer.parseInt(args[1]); // 두번재 입력값
		
		JavaHW06_09_AddOddEven02_양성호 obj = new JavaHW06_09_AddOddEven02_양성호(); // 객체 생성

		obj.mAdd(value1,value2); // 합계호출
		obj.mOdd(value1,value2); // 홀수합계호출
		obj.mEven(value1,value2); // 짝수합계호출
	}
}
