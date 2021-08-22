package bit.member;

import java.io.IOException;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GregorianCalendar today = new GregorianCalendar();
		
		request.setAttribute("loginYear", today.get(GregorianCalendar.YEAR ));
		request.setAttribute("loginMonth", today.get(GregorianCalendar.MONTH ));
		request.setAttribute("loginDay", today.get(GregorianCalendar.DAY_OF_MONTH ));
		request.setAttribute("loginHour", today.get(GregorianCalendar.HOUR ));
		request.setAttribute("loginMinute", today.get(GregorianCalendar.MINUTE ));
		request.setAttribute("loginSecond", today.get(GregorianCalendar.SECOND));
		
		//response.sendRedirect("login.jsp");
		//request.getRequestDispatcher("어디로누구한테 doGet()호출한 정보를 같이전달할까").forward(request, response);
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

}
