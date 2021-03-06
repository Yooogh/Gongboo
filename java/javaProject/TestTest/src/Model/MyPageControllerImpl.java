package Model;

public class MyPageControllerImpl implements MyPageController{
	public MyPageDAO dao;

	@Override
	public void signUpMember(MyPageVO myPageVO) {
		dao = new MyPageDAOImpl();
		dao.signUpMember(myPageVO);
	}

	@Override
	public void viewMember(MyPageVO myPageVO) {
		dao = new MyPageDAOImpl();
		dao.viewMember(myPageVO);
	}

	@Override
	public void modifyMember(MyPageVO myPageVO) {
		dao = new MyPageDAOImpl();
		dao.modifyMember(myPageVO);
	}

	@Override
	public void deleteMember(MyPageVO myPageVO) {
		dao = new MyPageDAOImpl();
		dao.deleteMember(myPageVO);
	}

}
