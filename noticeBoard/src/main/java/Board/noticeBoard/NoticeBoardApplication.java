package Board.noticeBoard;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "Board.noticeBoard.dao")
public class NoticeBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoticeBoardApplication.class, args);
	}
	
}
