package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/bank")
public class BankServlet extends HttpServlet {	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인 한 이후이므로 새로운세션이 아니다. (기존세션 가져와서 사용)
		HttpSession session = request.getSession();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//로그인했던 id 공유하여 사용한다
		if(session.getAttribute("sessionid") != null) {
			out.println("<h1>" + session.getAttribute("sessionid")+ "님 인증되셨습니다. (5분간 유효합니다)</h1>");
			//session.invalidate();5분도기다리지않고 바로 세션 없앤다
			session.setMaxInactiveInterval(300);//초단위이므로 5분=300초
		}else {
			out.println("<h1><a href='loginsession?id=test&pw=1111'>로그인</a> 먼저 하세요. 그래야 회원정보를 보여줍니다.</h1>");
		}
	}
}
