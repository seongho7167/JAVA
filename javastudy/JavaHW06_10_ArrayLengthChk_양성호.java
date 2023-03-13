/**
	## 배열 chk01
	- 하나의 변수에 다수의 값을 저장가능
	- 배열명[0], 배열명[1], 배열명[3], 배열명[4]..., 배열명[n]
	- 배열명.length(배열객체의 기본속성)

	ex] 실행시에 n개의 숫자를 입력받는다.
	print(args.length) // 정수 n
	
*/
package classes;

class JavaHW06_10_ArrayLengthChk_양성호 
{
	public static void main(String[] args) 
	{
		int arrayLength = args.length; // 배열 길이
		for(int i = 0; i < arrayLength; i++){ // 0번째부터 인덱스 순서대로 반복문
			System.out.println(args[i]); // 배열 요소 출력
		}
	}
}
