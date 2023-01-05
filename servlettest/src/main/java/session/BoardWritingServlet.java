package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/boardwriting")
public class BoardWritingServlet extends HttpServlet {	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인 한 이후이므로 새로운세션이 아니다. (기존세션 가져와서 사용)
		HttpSession session = request.getSession();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//로그인했던 id 공유하여 사용한다
		if(session.getAttribute("sessionid") != null) {
			String output = "<h1>글쓰기폼</h1>";
			output += "<table border=1>";
			output += "<tr><td>제목</td><td><input type=text name=title></td></tr>";
			output += "<tr><td>내용</td><td><textarea name=contents rows=5 cols=50></textarea></td></tr>";
			output += "<tr><td>작성자</td><td><input type=text name=writer value=" + session.getAttribute("sessionid")+" readonly></td></tr>";
			output += "</table>";
			
			out.println(output);
		}else {
			out.println("<h1><a href='loginsession?id=test&pw=1111'>로그인</a> 먼저 하세요. 그래야 회원정보를 보여줍니다.</h1>");
		}
		//String sessionid = (String)session.getAttribute("sessionid");//정보를얻어오는것이므로 getAttribute		

		}
}
