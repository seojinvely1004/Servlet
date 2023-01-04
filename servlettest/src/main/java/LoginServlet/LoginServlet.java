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
		response.setContentType("text/html;charset=utf-8");//("MIME-TYPE,인코딩")text를보여줄건데 html태그를포함할거야~
		PrintWriter out = response.getWriter();
		out.println("<h1>" + id + " 회원님 환영합니다.</h1>");
		out.println("<h1>" + pw + " 암호를 입력하셨습니다.</h1>");
		for(String t : title) {
		out.println("<h1>" + t + "  을 선택하셨습니다.</h1>");
		/*MIME-TYPE
		 * HTML로전송시 : text/html
		 * 일반 텍스르로 전송시 : text/plain
		 * XML데이터로 전송시 : application/xml
		 * >> 웹브라우저는 기본적으로 HTML만 인식하므로 
		 * 서블릿에서 전송하는 대부분의 데이터는 MIME-TYPE을 text/html로 지정한다.
		 * 더 나아가 새로운 종류의 데이터를 지정하고 싶으면 
		 * Server > CATALINA_HOME/con/web.xml에 추가하면 된다. */
		}
	}

}
