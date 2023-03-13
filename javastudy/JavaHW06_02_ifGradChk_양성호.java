/**
	실행시에 점수를 입력 받는다.
	- 0 ~ 100 사이의 정수만 입력 받는다.
	>> ^"0 ~ 100사이의 점수를 입력하세요."
	- 90 이상: A 학점
	- 80 이상: B 학점
	- 70 이상: C 학점
	- 60 이상: D 학점
	- 60 이하: F 학점
*/

package classes;

class  JavaHW06_02_ifGradChk_양성호
{
	public static void main(String[] args) 
	{
		int value = Integer.parseInt(args[0]); // 입력값
		String result = ""; // 출력문자열
		
		if(value > 100 || value < 0){ // 입력값이 범위를 밖에 있는 경우 validate false
			result = "0 ~ 100사이의 점수를 입력하세요.";

		}else { // 입력값이 범위 안에 있는 경우
		
			if(value >= 90){ // 90 이상
				result = "A 학점";
			}else if(value >= 80){ // 80 이상
				result = "B 학점";
			}else if(value >= 70){ // 70 이상 
				result = "C 학점";
			}else if(value >= 60){ // 60 이상
				result = "D 학점";
			}else { // 60 미만
				result = "F 학점";
			}
		}

		System.out.println(result);
	}
}
