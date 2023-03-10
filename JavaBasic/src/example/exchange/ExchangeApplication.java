package example.exchange;

import java.util.Scanner;

// 환전기 어플리케이션
// Input : 넣을 화폐, 바꿀 화폐, 금액
// Output : 금액, 바뀐 화폐
public class ExchangeApplication {
	
	private static String[] managedCurrencies = {"KRW", "USD", "JPY"};
	
	private static ExchangeRate[] exchangeRates = {
			// 원화 - 달러
			new ExchangeRate("KRW", "USD", 1000 / 1318.80),
			// 원화 - 엔
			new ExchangeRate("KRW", "JPY", 1000 / 960.35),
			// 달러 - 원화
			new ExchangeRate("USD", "KRW", 1318.80 / 1000),
			// 달러 - 엔
			new ExchangeRate("USD", "JPY", 1318.80 / 0.96035),
			// 엔 - 원화
			new ExchangeRate("JPY", "KRW", 960.35 / 1000),
			// 엔 - 달러
			new ExchangeRate("JPY", "USD", 0.96035 / 1318.80)
	};
	
	public static void main(String[] args) {
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		
		String exchangingCurrency = null;
		String exchangedCurrency = null;
		int amount =0;
		
		try {
			System.out.println("넣을 화폐 : ");
			exchangingCurrency = scanner.nextLine();
			System.out.println("바꿀 화폐 : ");
			exchangedCurrency = scanner.nextLine();
			System.out.println("금액 : ");
			amount = scanner.nextInt();
		} catch (Exception exception) {
			// exception.printStackTrace();
			System.out.println("입력값의 타입이 맞지 않습니다.");
			return;
		}
		
		
		// 입력 검증
		// 모두 입력했는지
		if (exchangingCurrency.isBlank() || exchangedCurrency.isBlank()) {
			System.out.println("모두 입력해주세요.");
			return;
		}
		
		// 입력한 화폐가 동일할 때
		if (exchangingCurrency.equals(exchangedCurrency)) {
			System.out.println("동일한 화폐로 환전할 수 없습니다.");
			return;
		}
		
		// 유효한 금액이 아닐 때 (금액이 양수가 아닐 때)
		if (amount <= 0) {
			System.out.println("유효한 금액이 아닙니다.");
			return;
		}
		
		// 관리하고 있는 화폐 단위가 아닐 때
		boolean hasExchanging = false;
		boolean hasExchanged = false;
		
		for (String managedCurrency : managedCurrencies) { // 데이터 변경 없이 읽기만 할 거니까 foreach
			if (exchangingCurrency.equals(managedCurrency)) {
				hasExchanging = true;
			}
			
			if (exchangedCurrency.equals(managedCurrency)) {
				hasExchanged = true;
			}
		}
		
		if (!(hasExchanging && hasExchanged)) {
			System.out.println("유효하지 않은 화폐 단위입니다.");
			return;
		}
		
		// 정상 프로세스
		double resultAmount = amount;
		
		for (ExchangeRate exchangeRate : exchangeRates) {
			
			boolean isSame = exchangingCurrency.equals(exchangeRate.getExchangingCurrency()) &&
					exchangedCurrency.equals(exchangeRate.getExchangedCurrency());
			
			if (isSame) {
				resultAmount *= exchangeRate.getExchangeRate();
				break;
				}
			}
		
		// 정상 출력
		System.out.println(exchangedCurrency + " : " + resultAmount);
		
	}

}











