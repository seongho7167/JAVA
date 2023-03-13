package classes;


class JavaHW03_07_VariableEx03_양성호 {

	public static void main(String[] args) {
		
		String name = "양성호";
		int kor = 100;
		int eng = 99;
		int math = 98;
		int sum = kor + eng + math;
		int avg = sum / 3;

		System.out.println("이름   국어   영어    수학   합계   평균");
		System.out.println("-------------------------------------");
		System.out.println(name+"   " +kor+"    "+eng+"   "+math+"   "+sum+"   "+avg);
	}
}
