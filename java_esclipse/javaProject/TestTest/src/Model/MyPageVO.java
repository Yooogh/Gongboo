package Model;


public class MyPageVO {
	//��������
	private String ID;//final
	private String PW;
	private String name;
	private String birth;
	
	//������
	public MyPageVO() {
		
	}
	
	
	
public MyPageVO(String iD, String name, String birth) {
		ID = iD;
		this.name = name;
		this.birth = birth;
	}



//Getter, Setter
//�� ����
	public String getID() {	return ID; }

	public void setID(String iD) {	ID = iD; }

	public String getPW() {	return PW; }

	public void setPW(String pW) { PW = pW; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public String getBirth() { return birth; }

	public void setBirth(String birth) { this.birth = birth; }
	
	@Override
	public String toString() {
		return "MyPageVO [ID=" + ID + ", name=" + name + ", birth=" + birth + "]";
	}

	public String getMember() {
		StringBuffer sb = new StringBuffer();
		sb.append("ID : " + ID +"\n");
		sb.append("�̸� : " + name +"\n");
		sb.append("���� : " + birth +"\n");
		sb.append("�̸� : " + name +"\n");
		
		return sb.toString();
	}

}