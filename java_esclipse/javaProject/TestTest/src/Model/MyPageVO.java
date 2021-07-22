package Model;


public class MyPageVO {
	//정보수정
	private String ID;//final
	private String PW;
	private String name;
	private String birth;
	
	//생성자
	public MyPageVO() {
		
	}
	
	
	
public MyPageVO(String iD, String name, String birth) {
		ID = iD;
		this.name = name;
		this.birth = birth;
	}



//Getter, Setter
//내 정보
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
		sb.append("이름 : " + name +"\n");
		sb.append("생일 : " + birth +"\n");
		sb.append("이름 : " + name +"\n");
		
		return sb.toString();
	}

}