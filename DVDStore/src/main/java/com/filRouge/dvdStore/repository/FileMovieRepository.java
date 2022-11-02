package com.filRouge.dvdStore.repository;

import com.filRouge.dvdStore.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements GoLiveMovieRepositoryInterface {
    @Autowired(required=true)
    @Value("movies.file.location")
     private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }


    public void save(Movie movie){

        try{

            FileWriter writer;
//            writer=new FileWriter("C:\\temp\\movies.txt",true);
          writer=  new FileWriter(file,true);
            writer.write(movie.getTitle()+ ";" + movie.getGenre() + "\n" );
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }



    }


}
