package mvc_package;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		LoginModel login = new LoginModel();
		
		request.setAttribute("login", login);
		
		login.setUsername(username);
		login.setPassword(password);
		
		
		
		
		
		String loginInfo = login.check();
		
		
		
		if(loginInfo.equals("user1")) {

			Cookie nameUser1 = new Cookie("username", username);
			Cookie passUser1 = new Cookie("password", password);
			response.addCookie(nameUser1);
			response.addCookie(passUser1);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("login_user1.jsp");
			rd.forward(request, response);
			
			
			
		}
		else if (loginInfo.equals("user2")) {

			Cookie nameUser2 = new Cookie("username", username);
			Cookie passUser2 = new Cookie("password", password);
			response.addCookie(nameUser2);
			response.addCookie(passUser2);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("login_user2.jsp");
			rd.forward(request, response);
			
			
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("login_failed.jsp");
			rd.forward(request, response);
		}
		
		
		

	}

}
