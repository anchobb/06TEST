package Ch99;

class Seller{
	private int MyMoney;
	private int AppleCnt;
	public int Price;
	
	public int Receive(int money) {
		MyMoney += money;
		int revcnt = money/Price;
		AppleCnt -= revcnt;
		return revcnt;
	}
	
	public void ShowInfo() {
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("사과 개수 : " + AppleCnt);
		System.out.println("개당 가격 : " + Price);
	}

	public Seller(int myMoney, int appleCnt, int price) {
		MyMoney = myMoney;
		AppleCnt = appleCnt;
		Price = price;
	}
}

class Buyer{
	private int MyMoney;
	private int AppleCnt;
	
	public void Payment(Seller seller1, int money) {
		MyMoney -= money;
		int cnt = seller1.Receive(money);
		AppleCnt+=cnt;
	}
	
	public void ShowInfo() {
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("사과 개수 : " + AppleCnt);
	}

	public Buyer(int myMoney, int appleCnt) {
		MyMoney = myMoney;
		AppleCnt = appleCnt;
	}
	
}


public class test {
	public static void main(String[] args) {
		
		Seller seller1 = new Seller(100000,100,1000);
		
		Buyer buyer1 = new Buyer(10000,0);
		Buyer buyer2 = new Buyer(20000,0);
		Buyer buyer3 = new Buyer(30000,0);
		
		buyer1.Payment(seller1, 2000);
		buyer2.Payment(seller1, 5000);
		buyer3.Payment(seller1, 3000);
		
		System.out.println("===판매자 정보===");
		seller1.ShowInfo();
		System.out.println();
		
		System.out.println("===구매자 정보===");
		System.out.println("----buyer1----");
		buyer1.ShowInfo();
		System.out.println();
		
		System.out.println("----buyer2----");
		buyer2.ShowInfo();
		System.out.println();
		
		System.out.println("----buyer3----");
		buyer3.ShowInfo();
	}

}