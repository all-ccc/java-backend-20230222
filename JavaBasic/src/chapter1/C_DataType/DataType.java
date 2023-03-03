package chapter1.C_DataType;

// 데이터 타입
// 각각의 데이터들은 자바에서 지정한 여러 종류의 타입이 존재
// 기본적으로 정수형, 실수형, 문자형, 논리형이 존재
// 추가적으로 참조형 데이터 타입

// 일반적으로 특정 데이터 타입으로 정의된 변수 혹은 상수는
// 같은 데이터 타입의 데이터로만 연산이 가능
public class DataType {

	public static void main(String[] args) {
		// 정수 타입
		
		// byte type
		// 1 byte (-128 ~ 127) 크기의 데이터를 가질 수 있는 데이터 타입
		byte byte1 = 127;
		// byte1 = 128; -> 범위 초과
		
		// short type
		// 2 byte (-32,768 ~ 32,767) 크기의 데이터를 가질 수 있는 데이터 타입
		short short1 = 32767;
		// short1 = 32768;
		
		// int type
		// 4 byte 크기의 데이터를 가질 수 있는 데이터 타입
		int int1 = 2_147_483_647; // 큰 수를 표현할 때 _쓰면 ,처럼 사용 가능
		// int1 = 2_147_483_648; -> 리터럴 상수값은 int 범위 내만 들어올 수 있음 (short랑 오류 다름)
		
		// long type
		// 8 byte 크기의 데이터를 가질 수 있는 정수형 데이터 타입
		// 정수 타입의 리터럴 상수의 데이터 타입은 int이기 때문에 
		// long 타입의 리터럴 상수를 지정할 때는 리터럴 상수 뒤에 L(l)을 붙여줌
		long long1 = 12_147_483_647L;
		
		
		// 실수 타입
		
		// float type
		// 4 byte (1.4 * 10^-45 ~ 3.4 * 10^38) 크기의 데이터를 가질 수 있는 실수형 데이터 타입
		// 실수 타입의 리터럴 상수의 데이터 타입은 double이기 때문에
		// float 타입의 리터럴 상수를 지정할 땐 리터럴 상수 뒤에 F를 붙여줌
		float float1 = 3.14F;
		// float은 소수점 6번째 자리에서 오차가 발생
		
		// double type
		// 8 byte (4.9 * 10^-324 ~ 1.8 * 10^308) 크기의 데이터를 가질 수 있는 실수형 데이터 타입
		double double1 = 3.1415;
		// double은 소수점 15번째 자리에서 오차가 발생
		
		
		// 문자 타입
		
		// char type
		// 2 byte (0 ~ 65,535) 크기의 데이터를 가질 수 있는 문자형 데이터 타입
		// 문자(단어 아님!) 하나를 저장할 수 있는 공간
		// 한 문자를 표기할 땐 ''으로 묶어서 표기
		char char1 = 'a';
		char char2 = 97;  // a 나옴
		 
		
		// 논리 타입
		
		// boolean type
		// 1 byte (false, true) 크기의 데이터를 가질 수 있는 논리형 데이터 타입
		boolean boolean1 = true;
		boolean1 = false;
		// is**, has**, flag(값(T or F)만 저장할 때 많이 사용)
		
		
		// 형 변환 (Type casting)
		
		// 자동 형 변환 (묵시적 형 변환)
		// 차지하는 범위가 작은 데이터 타입은 범위가 큰 데이터 타입으로 자동 형 변환됨
		short short2 = 1;
		int int2 = short2;
		char char3 = 1;
//		short2 = char3;
//		char3 = short2;
		// char과 short는 2 byte지만 범위가 다름 
		
//		float float2 = 3.14F;
//		int2 = float2;
		// 이것도 범위 다름
		
		// ! 강제 형 변환 (명시적 형 변환)
		// 차지하는 범위가 큰 데이터 타입은 범위가 작은 데이터 타입으로 대입할 때
		// 형 변환을 명시해야 함
		// 강제 형 변환의 경우 overflow (범위 초과)가 발생할 수 있음
		short2 = (short) int2;
		
		
		// 참조형 데이터 타입
		// 기본 데이터 타입이 아닌 메모리 주소를 참조하는 데이터 타입
		// 클래스
		// 기본 데이터 타입과 다르게 첫 문자가 대문자로 시작됨
		// 대표적인 참조형 데이터 타입 : String 
		// String은 문자열을 담을 수 있는 참조형 데이터 타입 (참조 변수의 실제 데이터값은 메모리 주소)
		String string1 = "This is Comment";
		
	}

}











