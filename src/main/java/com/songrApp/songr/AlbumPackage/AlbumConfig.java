package com.songrApp.songr.AlbumPackage;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AlbumConfig {
    @Bean
    CommandLineRunner commandLineRunner(AlbumRepository albumRepository){
        return args -> {
            Album formsOfFear = new Album("100 forms of fear","Sia",16,"3 H 7 M", "https://images-na.ssl-images-amazon.com/images/I/81pRkJYpNAL._AC_SX569_.jpg");
            Album color = new Album("color the small one","Sia",18,"3 H 2 M", "https://m.media-amazon.com/images/I/81I6irX1KmL._SS500_.jpg");
            Album onlySee = new Album("only see", "Sia", 13, "1 H 15 M", "https://img.discogs.com/iB409zofsX6us1lfVBDP9FRroSk=/fit-in/600x594/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-5058458-1383385935-2674.jpeg.jpg");
            albumRepository.saveAll(
                    List.of(formsOfFear,color,onlySee)
            );
        };
    }
}
