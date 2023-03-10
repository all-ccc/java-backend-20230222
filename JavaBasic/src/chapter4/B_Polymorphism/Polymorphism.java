package chapter4.B_Polymorphism;

// 다형성
// 조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조할 수 있도록 하는 것
// 참조변수의 형변환

class SuperClass {
	int number1;
	int number2;
	
	SuperClass(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	void method1() {}
	void method2() {}
}

class SubClass1 extends SuperClass {
	int number3;
	
	SubClass1(int number1, int number2, int number3) {
		super(number1, number2);
		this.number3 = number3;
	}
	
	void method3() {}
}

class SubClass2 extends SuperClass {

	SubClass2(int number1, int number2) {
		super(number1, number2);
	}
	
	void method1() {
		System.out.println("Override!!");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// superClass가 참조변수 new SuperClass();가 인스턴스
		SuperClass superClass = new SuperClass(1, 2);
		SubClass1 subClass1 = new SubClass1(11, 22, 33);
		SubClass2 subClass2 = new SubClass2(111, 222);
		
		// 자손타입 -> 조상타입 (Up Casting) : 자동 형변환 가능
		SuperClass super1 = subClass1;
		SuperClass super2 = subClass2;
		
		System.out.println(subClass1);
		System.out.println(super1);
		
		// 참조변수의 형변환을 한다고 하더라도 인스턴스가 가지고 있는 데이터에는
		// 아무런 영향을 미치지 않음
		// 단지 인스턴스의 사용 범위를 조절하는 것
		SubClass1 sub1 = (SubClass1) super1;
		
		System.out.println(sub1); // 위의 두 개랑 다 똑같은 주소 출력
//		System.out.println(sub1.number3); -> 값이 남아있음
		
		super2.method1();	// 형변환해도 실제 인스턴스 값. 즉, 오버라이딩한 값이 나옴
		
		// 조상타입 -> 자손타입 (Down Casting) : 자동 형변환 불가능
//		SubClass1 sub1 = (SubClass1) superClass;
//		SubClass2 sub2 = (SubClass2) superClass;
		
	}

}

















