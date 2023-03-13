class  JavaHW05_02_CastingChk_양성호
{
	public static void main(String[] args) 
	{
		byte vB01 = 10;
		byte vB02 = 20;
		byte vB03 = 10+20;
		int vI01 = vB01 + vB02; // 정상출력 ex) int = byte + byte
		long vL01 = vB01 + vB02; // 묵시적 변환    ex) int = byte + byte
		byte Vb05 = (byte)(vB01 + vB02); // 명시적 변환 casting
		// byte vB04 = vB01 + vB02; // error --> 수와 수의 연산결과는 Default DataType 으로 변환된다. ex) int = byte + byte

		long vL02 = 30;
		// int vI02 = vL01 + vL02; // error --> int 보다 큰 타입의 연산 결과는 int가 아닌 지정한 타입으로 유지됨. ex) long = long + long
		int vI02 = (int)(vL01 + vL02); //  명시적 변환 casting --> int = (int)long = long + long
	}
}

