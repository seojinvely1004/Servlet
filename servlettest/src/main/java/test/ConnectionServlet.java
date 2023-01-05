package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import dao.ConnectionInform;

@WebServlet("/connection")
public class ConnectionServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		try {
			//1. 직접db연결(datasource노사용)
			/*Class.forName(ConnectionInform.DRIVER_CLASS);
			long start = System.currentTimeMillis();//1/1000초 long타입으로 저장
			for(int i = 1; i<=10000; i++) {//10000개의 커넥션 만든다.
				//1.db 연결
				Connection con = DriverManager.getConnection
						(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
				System.out.println(i + "번째 maria DB 연결 성공");
				con.close();//메모리 con "즉각"삭제 아닌 표시
			}
			long end = System.currentTimeMillis();
			System.out.println((end-start) + "(1/1000초) 소요");
			//4481(1/1000초) 소요. 두번째 실행시 6400중단
		*/
			//2. connection pool _ datasource사용하여 DB연결
			Context initContext = new InitialContext(); // context.xml 준비
			Context envContext =(Context)initContext.lookup("java:/comp/env"); //자바 연관 설정
			DataSource ds = (DataSource)envContext.lookup("jdbc/mydb"); 
			
			long start = System.currentTimeMillis();//1/1000초 long타입으로 저장
			for(int i = 1; i<=10000; i++) {//10000개의 커넥션 만든다.
				Connection con = ds.getConnection();//pool con 빌려온다.
				System.out.println(i + "번째 maria DB 연결 성공(datasource)");
				con.close();//빌려온 con을 반납하고, 계속 재사용 한다는 뜻이 된다. 
			}
			long end = System.currentTimeMillis();
			System.out.println((end-start) + "(1/1000초) 소요");
			
		}catch(Exception e) {e.printStackTrace();}
	}//doGet
}//class

