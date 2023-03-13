package classes;


class  JavaHW04_04_MMEx02_양성호
{
	String name;
	int kor, eng, math, sum;
	double avg;
	
	String mName(String _name){
		name = _name;
		return name;
	}

	int mSum(int _kor, int _eng, int _math){
		sum = _kor + _eng + _math;
		return sum;
	}

	double mAvg(){
		avg = sum / 3;
		return avg;
	}

	public static void main(String[] args) 
	{
		JavaHW04_04_MMEx02_양성호 obj = new JavaHW04_04_MMEx02_양성호();
		obj.mName("양성호");
		
		obj.kor = 100;
		obj.eng = 199;
		obj.math = 98;

		obj.mSum(obj.kor, obj.eng ,obj.math);
		obj.mAvg();

		System.out.println("이름   국어   영어    수학   합계   평균");
		System.out.println("-------------------------------------");
		System.out.println(obj.name+"   " +obj.kor+"    "+obj.eng+"   "+obj.math+"   "+obj.sum+"   "+obj.avg);
	}
}
