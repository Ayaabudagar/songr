package com.example.songr.controller;

import com.example.songr.models.Song;
import com.example.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller

public class SongController {
    @Autowired
    SongRepository songRepository ;

    @PostMapping("/add-song/{id}")
    public RedirectView addSong(@ModelAttribute Song song , @PathVariable(value="id") Integer id){
        song.setAlbum(albumsRepository.findById(id).get());
        songRepository.save(song);
        return new RedirectView("/albums/{id}");
    }


    @GetMapping("/albums/{id}")
    public String getSongsById(@PathVariable(value="id") Integer  id , Model newModel){
        newModel.addAttribute("albums",albumsRepository.findById(id).get());
        return("allAlbums.html");
    }
    @GetMapping("/songs")
    public void getAllSongs(Model newModel){
        newModel.addAttribute("songs", songRepository.findAll());
        return("allSongs.html");
    }



}
