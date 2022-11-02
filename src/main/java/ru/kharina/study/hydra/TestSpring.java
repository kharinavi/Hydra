package ru.kharina.study.hydra;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        /*Head headBean1 = context.getBean("headBean", Head.class);
        headBean1.setEyeCount(2); headBean1.setEarCount(3);
        Head headBean2 = context.getBean("headBean", Head.class);
        headBean2.setEyeCount(6); headBean2.setEarCount(5);
        Head headBean3 = context.getBean("headBean", Head.class);
        headBean3.setEyeCount(8); headBean3.setEarCount(6);*/

        Hydra hydra = context.getBean("hydra", Hydra.class);
        //List<Head> headList = Arrays.asList(headBean1, headBean2, headBean3);
        //hydra.setHeadList(headList);
        hydra.printHeadList();

        context.close();
    }
}
