package com.example.songr.controller;

import com.example.songr.models.Albums;
import com.example.songr.models.AlbumsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {
    @Autowired
     AlbumsRepository albumsRepository;
    @GetMapping ("/albums")
    public String albumController(Model newModel){
        newModel.addAttribute("album",albumsRepository.findAll());

        return "AlbumController.html";
    }

    @PostMapping("/newAlbums")
    public RedirectView addNewAlbums(@ModelAttribute Albums newAlbums ) {

       
        albumsRepository.save(newAlbums);
        return new RedirectView("/albums");
    }
//
//        List<Albums> albumsList = new ArrayList<Albums>();
//        albumsList.add (album1);
//        albumsList.add (album2);
//        albumsList.add (album3);



}
