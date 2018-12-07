package czx.wt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("czx.wt.mapper")
public class SpringbootShiroEhcaheApplication {
    public static void main(String[] args) {
        SpringApplication sa=new SpringApplication(SpringbootShiroEhcaheApplication.class);
        // 禁用devTools热部署
        //System.setProperty("spring.devtools.restart.enabled", "false");
        // 禁用命令行更改application.properties属性
        sa.setAddCommandLineProperties(false);
        sa.run(args);
    }
}
