package com.filRouge.dvdStore;


import com.filRouge.dvdStore.controller.MovieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


import java.util.Scanner;

/**
 * Hello world!
 *
 */

/*@Configuration
@ComponentScan(basePackages ={"com.filRouge.dvdStore.controller.MovieController","com.filRouge.dvdStore.repository.memory.MemoryMovieRepository","com.filRouge.dvdStore.repository.file.FileMovieRepository","com.filRouge.dvdStore.service.DefaultMovieService"})
 @PropertySource("classpath:application.properties")*/
@SpringBootApplication(scanBasePackages={
        "com.filRouge.dvdStore.service.DefaultMovieService", "com.filRouge.dvdStore.repository.memory.MemoryMovieRepository", "com.filRouge.dvdStore.repository.file.FileMovieRepository","com.filRouge.dvdStore.controller.MovieController"})
public class App {

    public static void main( String[] args )
    {
        ApplicationContext context = SpringApplication.run(App.class, args);

        System.out.println("chose the console'1' or the live '2'");
        Scanner scn= new Scanner(System.in);
        String choice = scn.nextLine();

        if(choice.equals("1")){
            MovieController movieController= context.getBean(MovieController.class);
            movieController.addUsingConsole();
        }else if(choice.equals("2")){

            MovieController movieController= context.getBean(MovieController.class);
            movieController.addUsingFile();

        }

    }
}
