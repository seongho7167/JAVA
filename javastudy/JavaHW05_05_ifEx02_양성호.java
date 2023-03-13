package classes;

class JavaHW05_05_ifEx02_양성호 
{
	public static void main(String[] args) 
	{
		int value = Integer.parseInt(args[0]);
		String result;
		if(value % 2 == 0){
			result = "짝수";
		}else {
			result = "홀수";
		}
		System.out.println("입력된 숫자 "+ value +"는 "+ result +" 입니다.");

		/**
			String result = Integer.parseInt(args[0]) % 2 == 0 ? "짝수" : "홀수";
			System.out.println("입력된 숫자 "+ args[0] +"는 "+ result +" 입니다.");
		*/
	}
}
