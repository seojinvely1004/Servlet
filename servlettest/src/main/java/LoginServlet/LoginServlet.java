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
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// login.html(id, pw)
		
		String id = request.getParameter("id");
		System.out.println(id.equals("servlet")); 
		
		String pw = request.getParameter("pw");
		String[] title = request.getParameterValues("title");
		// 값 여러개 선택할때 input tyep=checkbox일때
		
		// id pw -> member테이블
		response.setContentType("text/html; charset =UTF-8");
		// (마인타입; 인코딩)
		// application/xml, text/plain, text/html 
		PrintWriter out = response.getWriter();
		out.println("<h1>"+ id +" 회원님 환영합니다.</h1>");
		out.println("<h1>"+ pw +" 암호를 입력하셨습니다.</h1>");
		
		for(String t : title) {
			out.println("<h1>"+ t +" 과정을 선택하셨습니다.</h1>");
//			out.println("<h1>"+ title +" 과정을 선택하셨습니다.</h1>"); //주소값나옴
		}
		//http://localhost:8081/servlettest/loginprocess?id=id&pw=pw&title=%EC%9B%B9+%ED%81%B4%EB%9D%BC%EC%9D%B4%EC%96%B8%ED%8A%B8+%EA%B3%BC%EC%A0%95&title=%EC%9B%B9+%EC%84%9C%EB%B2%84+%EA%B3%BC%EC%A0%95&title=%EB%8D%B0%EC%9D%B4%ED%84%B0%EB%B2%A0%EC%9D%B4%EC%8A%A4+%EA%B3%BC%EC%A0%95&title=%EC%84%9C%EB%B9%84%EC%8A%A4%EB%B0%B0%ED%8F%AC+%EA%B3%BC%EC%A0%95
		// http://localhost:8081/servlettest/loginprocess?id=idididi&pw=pwpwpwp
		/*MIME-TYPE
		 * HTML로전송시 : text/html
		 * 일반 텍스르로 전송시 : text/plain
		 * XML데이터로 전송시 : application/xml
		 * >> 웹브라우저는 기본적으로 HTML만 인식하므로 
		 * 서블릿에서 전송하는 대부분의 데이터는 MIME-TYPE을 text/html로 지정한다.
		 * 더 나아가 새로운 종류의 데이터를 지정하고 싶으면 
		 * Server > CATALINA_HOME/con/web.xml에 추가하면 된다. */
			
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(request.getMethod());
		request.setCharacterEncoding("UTF-8"); //post방식일때 필요 
		
		doGet(request, response);
	}
	
	
	
}
