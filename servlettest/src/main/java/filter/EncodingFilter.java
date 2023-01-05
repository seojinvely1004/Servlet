package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
/*
 * 필터란 브라우저에서 서블릿에 요청하거나 응답할 때 미리 요청이나 응답과 관련해 여러 가지 작업을 처리하는 기능이다. 
 * 프로그래밍을 하다가 한글 인코딩처럼 각 서블릿에서 반복적으로 처리해야 하는 작업이 있을 수 있는데,
 * 이런 경우 서블릿의 공통 작업을 미리 필터에서 처리하면 반복해서 작업할 필요가 있다.
 * 사용자 정의 필터는 반드시 Filter인터페이스를 구현해야 한다. 
 * 그리고 init(), doFilter(), destroy()의 추상 메서드를 구현해 주어야 한다. 
 * 필터를 매핑하는 방법은 1. 애너테이션을 이용 2. web.xml에설정하는방법*/

@WebFilter("/*")
public class EncodingFilter extends HttpFilter implements Filter {
       
	public void destroy() {//destroy() : 필터 소멸 시 컨테이너에 의해 호출되어 종료 작업을 수행한다.
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("FILTER 시작");
		//doFilter() :모든 서블릿 실행시마다(요청마다) 서블릿이름, 요청클라이언트 IP 출력 - 서블릿 doGet.Post
		String servletname = ((HttpServletRequest)request).getServletPath();
		String clientip = request.getRemoteAddr();//0.0.0.0
		System.out.println(clientip + "컴퓨터가" + servletname + "을 호출했습니다.");
		
		//서블릿 요청 인코딩 변경
		request.setCharacterEncoding("utf-8");
		
		//요청 - 요청필터 - 처리 - 응답필터 - 응답
		long start = System.currentTimeMillis();
		chain.doFilter(request, response);//다른필터실행.다른필터없으면 서블릿 실행.
		long stop = System.currentTimeMillis();
		System.out.println((stop - start) + "실행소요시간(1/1000초)");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		//init():필터 생성 시 컨테이너에 의해 호출되어 초기화 작업을 수행한다
	}

}
