package day20_DB;

import java.sql.*;

public class DBClass {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String id = "java";
	private String pwd = "1234";
//	private Connection con;
	
	public DBClass() {
		try {
		//자바에서 오라클에 관련된 기능을 사용할 수 있게 기능을 등록하는 것
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void getList() {
		try {
		//2. 데이터베이스 연결
		Connection con = DriverManager.getConnection(url, id, pwd);
		System.out.println("연결이 잘 이뤄졌습니다!!");
		//null에 들어가는거 데이터베이스의 1.정보 2.아이디 3.비밀번호
		//3. 데이터베이스에 연결된 객체를 이용해 명령어를 수행할 수 있는 객체를 얻어온다.
		//4. 명령어를 수행할 수 있는 객체를 이용해서 명령어 수행
		//5. 수행결과를 저장한다.
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
