package com.songrApp.songr.SongPackage;

import com.songrApp.songr.AlbumPackage.Album;
import com.songrApp.songr.AlbumPackage.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Collections;
import java.util.List;

@Controller
public class SongController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @GetMapping("song/{id}")
    public String song(@PathVariable Long id ,Model model) {
        Album album = albumRepository.findById(id).orElseThrow();
        List<Song> newSongs = album.getSongs();
        model.addAttribute("newSongs", newSongs);
        model.addAttribute("id", id);
        return "Songs";
    }


    @PostMapping("/addSong")
    public RedirectView addNewSong(String title , int length,int trackNumber , String id){
        Long albumId= Long.parseLong(id);
        List<Album> songAlbum = albumRepository.findAllById(Collections.singleton(albumId));
        Song song = new Song(title,length,trackNumber,songAlbum.get(0));
        songRepository.save(song);
        return new RedirectView("/song/"+albumId);
    }

}

