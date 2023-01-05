package url;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//홈페이지 시작화면
@WebServlet("/*")
public class URLTESTServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//http://ip:port/servlettest/board>boardwriting
		//http://ip:port/servlettest/member>forward4
		//http://ip:port/servlettest/product>없습니다
		/*
		 * url 주소 전체 
		 * uri 서버부 경로만 >/servlettest/product 여기부터~!
		 * */
		//System.out.println(request.getRequestURI());//servlettest/*
		//System.out.println(request.getRequestURL());//http://localhost:8081/servlettest/*
		String uri = request.getRequestURI();
		String uri_arr[] = uri.split("/");
		String forward_uri =  uri_arr[uri_arr.length-1];
		System.out.println(forward_uri);
		if(forward_uri.equals("board")) {
			forward_uri="boardwriting";//sessionid세션정보
			RequestDispatcher rd = request.getRequestDispatcher(forward_uri);
			rd.forward(request, response);
		}
		else if(forward_uri.equals("member")) {
			forward_uri="forward4";//menu=memberlist&page=?//list null 오류
			RequestDispatcher rd = request.getRequestDispatcher(forward_uri);
			rd.forward(request, response);
		}
		else {
			System.out.println("이동 url이 없습니다.");
		}
		
	}

}
