package kr.ac.jejunu.userdao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {
@Bean
    public UserDao userDao() {
        return new UserDao(ConnectionMaker());
    }
@Bean
public JejuConnectionMaker ConnectionMaker() {
        return new JejuConnectionMaker();
    }
}
