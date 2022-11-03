package com.filRouge.dvdStore;


import com.filRouge.dvdStore.controller.MovieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

/*@Configuration
@ComponentScan(basePackages ={"com.filRouge.dvdStore.controller.MovieController","com.filRouge.dvdStore.repository.memory.MemoryMovieRepository","com.filRouge.dvdStore.repository.file.FileMovieRepository","com.filRouge.dvdStore.service.DefaultMovieService"})
 @PropertySource("classpath:application.properties")*/
@SpringBootApplication
public class App
{
    public static void main( String[] args ) {

        //ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
        ApplicationContext context= SpringApplication.run(App.class,args);

        MovieController movieController=context.getBean(MovieController.class);

        movieController.addUsingConsole();
    }

}
