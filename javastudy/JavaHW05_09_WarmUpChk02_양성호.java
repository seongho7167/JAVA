package classes;


class  JavaHW05_09_WarmUpChk02_양성호
{
	public static void main(String[] args) 
	{
		/**
			reference타입(class)의 변수가 선언되면 변수는 nullpoint를 갖는다.
			new 생성자로 객체가 사용되면 변수에 주소를 부여한다.(stack 메모리 공간에 저장)
			객체 주소에 값을 담는다.(heap 메모리 공간에 저장)
		*/
		String vS01 = "nice"; // 생성자를 생략한 경우 
		String vS02 = "nice"; // 생성자를 생략한 경우 
		String vS03 = new String("nice"); // 생성자를 입력한 경우 
		String vS04 = new String("nice"); // 생성자를 입력한 경우 
		String vS05 = args[0]; // arraylist class의 객체값

		System.out.println(vS01 == vS02); // true --> 생성자를 생략하고 참조타입 변수 선언/할당시, 같은 값을 가진 주소가 존재하는 경우 같은 주소로 할당받는다
		System.out.println(vS03 == vS01); // false --> 생성자를 입력하고 참조타입 변수 선언/할당시, 새로운 주소에 값을 할당 받는다
		System.out.println(vS03 == vS04); // false --> 생성자를 입력하고 참조타입 변수 선언/할당시, 새로운 주소에 값을 할당 받는다
		System.out.println(vS03 == vS05); // false --> 서로 다른 객체의 인스턴스로 다른 주소 
		System.out.println(vS01 == vS05); // false --> 서로 다른 객체의 인스턴스로 다른 주소 
		System.out.println(vS05 == "nice"); // false 
		System.out.println("nice" == "nice"); // true 
		System.out.println(vS01 == "nice"); // true 
		System.out.println(vS01 == new String("nice")); // false 
		System.out.println("nice" == new String("nice")); // false 

		/**
			== : 값을 비교
			객체와 객체의 비교 필요성:
			객체.equals(obj) // (boolean) 객체의 주소에서 값을 꺼내서 비교하는 개념
		*/
		if(vS01.equals(vS02)){
			System.out.println("vS01.equals(vS02) : true");
		}

		if(vS01.equals(vS03)){
			System.out.println("vS01.equals(vS03) : true");
		}

		if(vS03.equals(vS04)){
			System.out.println("vS03.equals(vS04) : true");
		}
	}
}
