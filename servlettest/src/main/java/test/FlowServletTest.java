package test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/flow")
public class FlowServletTest extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		System.out.println("1.init호출(수정)");//init()메서드는 최초에 한번만 호출된다.
//수정을해도 init실행은다시안된다. doGet메서드만 계속 반복 실행된다.
//garbage collction이 필요할 때 호출되는 게 destroy()메서드.
//destroy메서드 호출된 후 init호출(수정) > doget반복됨. 
	}
	public void destroy() {
		System.out.println("n.destry호출");

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException{
		System.out.println("n.doGet호출");
	}
}
