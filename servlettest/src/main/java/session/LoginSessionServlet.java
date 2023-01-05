package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginsession")
public class LoginSessionServlet extends HttpServlet {	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		//요청 보낸 브라우저가 세션 있니? 
		//true이면 이전의 생성된 session정보로 대체(두번째이후 요청), false이면 session을 새로 생성한다(최초요청)
		HttpSession session = request.getSession();
		
		session.setAttribute("sessionid", id);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if(id != null && pw != null) {
			out.println("<h1?로그인 하셨습니다.</h1>");
			out.println("<h1>사용 가능한 메뉴는 다음과 같습니다.</h1>");
			out.println("<h1> <a href=''>내정보 보러 가기</a></h1>");
			out.println("<h1> <a href=''>글쓰러 가기</a></h1>");
			out.println("<h1> <a href=''>로그아웃하러 가기</a></h1>");
			out.println("<h1> 로그인 정보 유효시간은 " + session.getMaxInactiveInterval() + "초입니다.</h1>");
		}else {
			out.println("<h1>로그인한 적 없습니다.</h1>");	
		}
	}
	

}
