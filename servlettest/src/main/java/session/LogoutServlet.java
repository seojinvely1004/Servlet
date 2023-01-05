package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//로그인 먼저 하고 나서 로그아웃
		if(session.getAttribute("sessionid") != null) {
			out.println("<h1>" + session.getAttribute("sessionid") + "님로그아웃하셨습니다.</h1>");
			session.removeAttribute("sessionid");
		}else {
			out.println("<h1>로그아웃 먼저 할 수 없습니다.</h1>");
		}		
	}
}
