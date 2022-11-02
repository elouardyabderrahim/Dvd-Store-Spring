package com.filRouge.dvdStore;


import com.filRouge.dvdStore.controller.MovieController;
import com.filRouge.dvdStore.repository.FileMovieRepository;
import com.filRouge.dvdStore.repository.MemoryMovieRepository;
import com.filRouge.dvdStore.service.DefaultMovieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("chose the console'1' or the live '2'");
        Scanner scn= new Scanner(System.in);
        String choice = scn.nextLine();

        if(choice.equals("1")){
//            MovieController movieController= new MovieController();
//            DefaultMovieService defaultMovieService = new DefaultMovieService();
//            movieController.setMovieService(defaultMovieService);
//            MemoryMovieRepository memoryMovieRepository = new MemoryMovieRepository();
//            defaultMovieService.setMovieRepository(memoryMovieRepository);
            MovieController movieController= context.getBean(MovieController.class);
            movieController.addUsingConsole();
        }else if(choice.equals("2")){

//         MovieController movieController=new MovieController();
////            DefaultMovieService defaultMovieService = new DefaultMovieService();
////            FileMovieRepository fileMovieRepository= new FileMovieRepository();
////
////            defaultMovieService.setGoLiveMovieRepository(fileMovieRepository);
////            movieController.setMovieService(defaultMovieService);

            MovieController movieController= context.getBean(MovieController.class);
            movieController.addUsingFile();

        }

    }
}
