package classes;

class JavaHW05_10_ifExam03_양성호 
{
	public static void main(String[] args) 
	{
		String vId = args[0]; // 입력 아이디값
		String vPwd = args[1]; // 입력 패스워드값
		Boolean dataCheck = false; // 아이디 패스워드 체크값

		if(!vId.equals("Seongho")){ // 아이디 체크
			System.out.println("ID를 확인하세요.");
			dataCheck = true;
		}
		if(!vPwd.equals("1234")){ // 패스워드 체크
			System.out.println("PWD를 확인하세요.");
			dataCheck = true;
		}

		if(!dataCheck){ // 아이디 패스워드 모두 패스한 경우 
			System.out.println(vId+"님 안녕하세요.");
		}
	}
}
