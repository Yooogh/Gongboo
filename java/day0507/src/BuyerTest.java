import java.util.Vector;

class Product {
	public int price;
	public int bonusPoint;
	Product(int price, int bonus) {
		this.price = price;
		this.bonusPoint = bonus;
	}
}
class Tv extends Product{
	String name = "Tv";
	Tv(int price, int bonus){
		super(price, bonus);
	}
	public String toString() {return "tv";}
}
class Computer extends Product {
	String name = "Computer";
	Computer(int price, int bonus){
		super(price, bonus);
	}
	public String toString() {return "computer";}
}
class Audio extends Product{
	String name = "Audio";
	Audio(int price, int bonus){
		super(price, bonus);
	}
	public String toString() {return "computer";}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	Vector cart = new Vector();
	
	void buy(Vector pcart) {
		for(int i = 0; i<pcart.size();i++) {
			if(money<((Product)pcart.get(i)).price) {
				System.out.println("잔액 부족~!!");
				return;
			}
			money -= ((Product)pcart.get(i)).price;
			bonusPoint += ((Product)pcart.get(i)).bonusPoint;
		}
	}
	
	
void summary() {
		int sum = 0;
		String cartList = "";
		if(cart.isEmpty()) {
			System.out.println("구입물품이 없습니다.");
			return;
		}
		String pname = "";
		for(int i=0; i<cart.size(); i++) {
			Product p= (Product)cart.get(i);
			sum =+ p.price;
//			if(p instanceof Tv) { 
//				pname = ((Tv)p).name;//맞으면 p를 티비 타입으로 캐스팅
//			}else if(p instanceof Computer) {
//				pname = ((Computer)p).name;
//			}else if(p instanceof Audio) {
//				pname = ((Audio)p).name;
//			}
			cartList += (i==0)? ""+p : "," +p; //첫번째는 공백+p, 두번째는 ,+p객체 정보
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " +cartList+"입니다.");
	}
	void showBuyer() {
		System.out.println("잔액" + this.money+"포인트"+this.bonusPoint);
	}
}

public class BuyerTest {

	public static void main(String[] args) {
		Buyer b1 = new Buyer();
		b1.showBuyer();
		b1.cart.add(new Tv(200, 10));
		b1.cart.add(new Computer(300, 15));
		b1.cart.add(new Audio(100, 5));
		b1.summary();
		b1.buy(b1.cart);
		b1.showBuyer();	
	}
}
