/**
	1~10사이의 합, 홀수합, 짝수합
	- %, 누적변수
	- void method mAdd(); mOdd(); mEven(); 
	
	sample run]
	1~10 사이의 합: 
	1~10 사이의 홀수 합:
	1~10 사이의 짝수 합: 
*/

package classes;

class JavaHW06_08_AddOddEven_양성호 
{
	void mAdd(){ // 반복 합계
		int result = 0;
		for(int i = 1; i < 11; i++){
			result += i;
		}
		System.out.println("1~10 사이의 합: "+result);
	}
	
	void mOdd(){ // 홀수 합계
		int result = 0;
		/*for(int i = 1; i < 11; i++){
			if(i % 2 != 0){
				result += i;
			}			
		}*/

		for(int i = 1; i < 11; i+=2){
			result += i;
		}
		System.out.println("1~10 사이의 홀수 합:"+result);
	}

	void mEven(){ // 짝수 합계
		int result = 0;
		/*for(int i = 1; i < 11; i++){
			if(i % 2 == 0){
				result += i;
			}			
		}*/
		for(int i = 0; i < 11; i+=2){
			result += i;
		}
		System.out.println("1~10 사이의 짝수 합:"+result);
	}
	
	public static void main(String[] args) 
	{
		JavaHW06_08_AddOddEven_양성호 obj = new JavaHW06_08_AddOddEven_양성호(); // 객체 생성

		obj.mAdd(); // 합계호출
		obj.mOdd(); // 홀수합계호출
		obj.mEven(); // 짝수합계호출
	}
}
