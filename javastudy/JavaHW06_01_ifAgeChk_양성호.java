package classes;


class  JavaHW06_01_ifAgeChk_양성호
{
	public static void main(String[] args) 
	{
		int value = Integer.parseInt(args[0]); // 입력값
		String result = ""; // 출력문자열

		if(value >= 18){ // 18 이상인 경우
			result = "성인 인증 성공!!";
		}else { // 18 미만인 경우
			result = "성인 인증 실패!!";
		}

		System.out.println(result);

	}
}
