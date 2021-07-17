package com.songrApp.songr.AlbumPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;

@Controller
public class AlbumController {

    @Autowired
   AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String showAlbums(Model model){
        List<Album> myAlbums = albumRepository.findAll();
        model.addAttribute("AllAlbums", myAlbums);
        model.addAttribute("album", new Album());
        return "albumsHTML";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(String title, String artist, int songCount, String length, String imageUrl) {
        Album album = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.saveAll(List.of(album));
        return new RedirectView("/albums");
    }

}
