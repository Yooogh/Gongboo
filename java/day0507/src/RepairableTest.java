
public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank); //SCV�� Tank�� �����ϵ��� �Ѵ�
		scv.repair(dropship);
//		scv.repai(marrine); //������ �������̽� �������� �����������
	}
}

interface Repairable{} //�ν��Ͻ� Ÿ�� üũ���� ����

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
		super(150); //Tank�� hp�� 15�̴�
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
		hitPoint = MAX_HP;//Unit���� ��ӹ���
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
	
	void repair(Repairable r) {//�Ű������� �Ѱܹ��� ������ �����Ѵ�
		if (r instanceof Unit) {
			Unit u= (Unit)r;
			while(u.hitPoint!=u.MAX_HP) {
				/* Unit�� HP�� ������Ų�� */
				u.hitPoint++;
			}
			System.out.println(u.toString() + "�� ������ �������ϴ�.");
		}
	}
	//...
}