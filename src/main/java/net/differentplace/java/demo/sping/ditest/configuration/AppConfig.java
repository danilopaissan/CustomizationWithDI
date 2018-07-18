package net.differentplace.java.demo.sping.ditest.configuration;

import net.differentplace.java.demo.sping.ditest.contract.IGreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("${customization.componentScan}")
public class AppConfig {
    @Autowired
    private ApplicationContext context;

    @Bean
    @Primary
    public IGreeting greeting(@Value("${customization.greetingIplementation}") String qualifier) {
        Class<?> cls = null;
        try {
            cls = Class.forName(qualifier);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (IGreeting) context.getBean(cls);
    }
}
