package servlettest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward1")
public class ForwardTest1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");//사용자에게 파라미터(id)하나를 전달받는다
		request.setAttribute("upperid", id.toUpperCase());
		
		/*response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>" + request.getAttribute("upperid") + " 회원님 반갑습니다.</h1>");
		*/
		//out.println("<h1>" + id + " 회원님 반갑습니다.</h1>");
		//"웹어플리케이션명포함/"
		RequestDispatcher rd = request.getRequestDispatcher("/forward2");
		rd.forward(request, response);
	}
}
