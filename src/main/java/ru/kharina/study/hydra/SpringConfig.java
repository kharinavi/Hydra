package ru.kharina.study.hydra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringConfig {
@Bean
    public Head head1(){
        return new Head(3,2);
    }
    public Head head2(){
        return new Head(6,5);
    }
    public Head head3(){
        return new Head(6,8);
    }
    @Bean
    public List<Head> headList() {
        return Arrays.asList(head1(),head2(),head3());
    }

    @Bean
    public Hydra hydra(){
        Hydra res = new Hydra("Гидра");
        res.setHeadList(headList());
        return res;
    }
}
