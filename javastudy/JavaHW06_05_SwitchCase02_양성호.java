/**
	입력시에 숫자를 입력받는다.
	-1월~12월 해당
	-범위를 벗어나면: ^ 1~12사이의 숫자를 입력하세요!!
	-3,4,5: x월은 봄입니다.
	-6,7,8: x월은 여름입니다.
	-9,10,11: x월은 가을입니다.
	-12,1,2: x월은 겨울입니다.
*/

package classes;

class JavaHW06_05_SwitchCase02_양성호 
{
	public static void main(String[] args) 
	{
		//int value = Integer.parseInt(args[0]); // 입력값
		String result = ""; // 계절
		
		switch (Integer.parseInt(args[0])){ // 정수 표현이 default
			case 3:
			case 4:
			case 5:
				result = "봄"; // 3,4,5 입력값의 경우 계절
			break;

			case 6:
			case 7:
			case 8:
				result = "여름"; // 6,7,8 입력값의 경우 계절
			break;

			case 9:
			case 10:
			case 11:
				result = "가을"; // 9,10,11 입력값의 경우 계절
			break;

			case 12:
			case 1:
			case 2:
				result = "겨울"; // 12,1,2 입력값의 경우 계절
			break;

			default:  // 1~12 사이 숫자가 아닌 경우
				result = "1 ~ 12사이의 숫자를 입력하세요!!";
		}

		switch (args[0]){ // 정수 표현이 default지만 자바 버전이 올라가면서 String 클래스 타입의 경우 참조값으로 주소를 비교하는데 예외로 허용
			case "3":
			case "4":
			case "5":
				result = "봄"; // 3,4,5 입력값의 경우 계절
			break;

			case "6":
			case "7":
			case "8":
				result = "여름"; // 6,7,8 입력값의 경우 계절
			break;

			case "9":
			case "10":
			case "11":
				result = "가을"; // 9,10,11 입력값의 경우 계절
			break;

			case "12":
			case "1":
			case "2":
				result = "겨울"; // 12,1,2 입력값의 경우 계절
			break;

			default:  // 1~12 사이 숫자가 아닌 경우
				result = "1 ~ 12사이의 숫자를 입력하세요!!";
		}
		
		if(Integer.parseInt(args[0]) > 0 && Integer.parseInt(args[0]) < 13){
			System.out.println(Integer.parseInt(args[0])+"월은 "+result+"입니다.");
		}else {
			System.out.println(result);
		}
	}
}
