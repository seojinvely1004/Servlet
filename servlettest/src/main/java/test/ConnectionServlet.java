package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ConnectionInform;

@WebServlet("/connection")
public class ConnectionServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
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
		}catch(Exception e) {e.printStackTrace();}
	}//doGet
}//class

