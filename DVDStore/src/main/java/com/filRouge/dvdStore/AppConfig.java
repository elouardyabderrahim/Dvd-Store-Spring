package com.filRouge.dvdStore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages ={"com.filRouge.dvdStore.controller.MovieController","com.filRouge.dvdStore.repository.memory.MemoryMovieRepository","com.filRouge.dvdStore.repository.file.FileMovieRepository","com.filRouge.dvdStore.service.DefaultMovieService"})
@PropertySource("classpath:application.properties")
//on peut utiliser l'annotation @ImportResource pour travialler avec le fichier xml.
public class AppConfig {

}
