package Quiz3;

class Member {
	//ȸ�� ���� �з�
	private String name;
	private String ID;
	private String PW;
	private int age;
	//������
	public Member(String name, String iD, String pW, int age) {
		super();
		this.name = name;
		ID = iD;
		PW = pW;
		this.age = age;
	}
	//������
	public String getName() {
		return name;
	}
	public String getID() {
		return ID;
	}
	public String getPW() {
		return PW;
	}
	public int getAge() {
		return age;
	}
	//������
	public void setName(String name) {
		this.name = name;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public void setPW(String PW) {
		this.PW = PW;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
