package Model;

public interface MyPageDAO {
	//ȸ������
	public void signUpMember(MyPageVO mb);
	//�� ���� ��ȸ
	public void viewMember(MyPageVO mb);
	//�� ���� ����
	public void modifyMember(MyPageVO mb);
	//ȸ�� Ż��
	public void deleteMember(MyPageVO mb);

}
