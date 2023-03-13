/**
	## 반복분: for, while, do~while
	for(초기값; 조건; 증감){
		반복 Algorithm;
	}

	for (statement 1; statement 2; statement 3) {
	  // code block to be executed
	}
	Statement 1 is executed (one time) before the execution of the code block.
	Statement 2 defines the condition for executing the code block.
	Statement 3 is executed (every time) after the code block has been executed.
*/

package classes;

class JavaHW06_06_ForEx01_양성호
{
	public static void main(String[] args) 
	{
		int vI01 = 10;
		vI01 = vI01 + 2;
		System.out.println(vI01);
		vI01 += 2;
		System.out.println(vI01);
		for(int i = 0; i < 5; i++){
			System.out.println(i); // 0 1 2 3 4
		}
	}
}
