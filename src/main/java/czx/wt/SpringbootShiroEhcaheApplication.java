package czx.wt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("czx.wt.mapper")
public class SpringbootShiroEhcaheApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootShiroEhcaheApplication.class, args);
    }
}
