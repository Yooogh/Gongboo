
public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank); //SCV가 Tank를 수리하도록 한다
		scv.repair(dropship);
//		scv.repai(marrine); //에러남 인터페이스 리페어러블을 상속하지않음
	}
}

interface Repairable{} //인스턴스 타입 체크에만 쓰임

class Unit {
	int hitPoint;
	final int MAX_HP;
	Unit(int hp) {
		MAX_HP = hp;
	}
	//...
}

class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150); //Tank의 hp는 15이다
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
	//...
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);
		hitPoint = MAX_HP;//Unit에서 상속받음
	}
	public String toString() {
		return "Dropship";
	}
	//...
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
	//...
}

class SCV extends GroundUnit implements Repairable{
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {//매개변수로 넘겨받은 유닛을 수리한다
		if (r instanceof Unit) {
			Unit u= (Unit)r;
			while(u.hitPoint!=u.MAX_HP) {
				/* Unit의 HP를 증가시킨다 */
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
	//...
}