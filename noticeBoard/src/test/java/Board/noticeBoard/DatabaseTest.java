package Board.noticeBoard;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

public class DatabaseTest {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/noticeBoard?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Seoul";
	private static final String USER = "choo";
	private static final String PW = "1234";
	
	@Test
	public void connectionTest() throws Exception{
		try(Connection connection = DriverManager.getConnection(URL, USER, PW)){
			System.out.println("con");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
