package bit.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginPrcServlet
 */
public class LoginPrcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("LoginPrcServlet doPost() ");
		//request.setAttribute("userID", "djeosnfdike98");
		String userId=request.getParameter("userId");
		String userPasswd = request.getParameter("userPasswd");
		//String nextPage = "";
		// db 연결 작업할 것을 불러서 id,pw 넘겨줘서 결과를 받아서 
		if(userId.equals("lee")) {
			request.setAttribute("userID", userId);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}else {
			response.sendRedirect("login.do");
		}
		// 받은것으로 분기시켜준다 
		// ok ==> welcome.jsp
		// 존재하지 x ==> login.do
		
		
		
	}

}
