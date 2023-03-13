package classes;

class JavaHW06_03_ifTernaryChk_양성호 
{
	public static void main(String[] args) 
	{
		int value = Integer.parseInt(args[0]); // 입력값
		String result = "";
		
		if(value >= 18){ // 18 이상인 경우
			result = "성인 인증 성공!!";
		}else { // 18 미만인 경우
			result = "성인 인증 실패!!";
		}
		System.out.println(result);
//--------------------------------------------------------------------------------------
		// 삼항연산 
		result = value >= 18 ? "성인 인증 성공!!" : "성인 인증 실패!!"; // variable(변수) = (condition(조건)) ? expressionTrue(참) :  expressionFalse(거짓);
		System.out.println(result);
	}
}
