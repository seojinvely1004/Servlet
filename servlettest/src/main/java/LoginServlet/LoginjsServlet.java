package LoginServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginjs")
public class LoginjsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//login_javascript.html(id,pw,role)
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id"); 
		String pw = request.getParameter("pw");
		String[] role = request.getParameterValues("role");
		
		String output = "";
		if(role.equals("admin")) {
			output = "<h1>"+ id + " 관리자님 환영합니다.</h1>";
		}else {//user
			output = "<h1>"+ id + " 회원님 환영합니다.</h1>";
		}
		response.setContentType("text/html; charset =UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println(output);

	}
}
