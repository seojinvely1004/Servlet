package LoginServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginprocess")
public class LoginServlet extends HttpServlet {      
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.요청정보 가져오기  login.html(id, pw)
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		//select multiple = multiple, input type=checkbox
		String title[] = request.getParameterValues("title");
		//id, pw로 member테이블에접근(db)할 예정
		//2.응답
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>" + id + " 회원님 환영합니다.</h1>");
		out.println("<h1>" + pw + " 암호를 입력하셨습니다.</h1>");
		for(String t : title) {
		out.println("<h1>" + t + "  을 선택하셨습니다.</h1>");
		}
	}

}
