package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/mypage")
public class MyPageServlet extends HttpServlet {	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인 한 이후이므로 새로운세션이 아니다. (기존세션 가져와서 사용)
		HttpSession session = request.getSession();
		//로그인했던 id 공유하여 사용한다
		String sessionid = (String)session.getAttribute("sessionid");//정보를얻어오는것이므로 getAttribute
		//jdbc빼고실습한다 (세션에집중)
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>" + sessionid + "님의 회원정보 페이지입니다.</h1>");
		}
}
