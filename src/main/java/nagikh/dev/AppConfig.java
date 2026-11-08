package nagikh.dev;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("nagikh.dev")
@PropertySource("classpath:application.properties")
public class AppConfig {

}
