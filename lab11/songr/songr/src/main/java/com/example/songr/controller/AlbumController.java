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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {
    @Autowired
    AlbumsRepository albumsRepository;
    @GetMapping ("/albums")
    public String AlbumController(Model newModel){
        newModel.addAttribute("albums",albumsRepository.findAll());

        return "AlbumController.html";
    }
//    @GetMapping("/albums")
//    public RedirectView AlbumController(){
//
//        Albums album1 = new Albums ("Lw Ala Albi", "Faddel Shaker" ,4 , "https://th.bing.com/th/id/R.fea5bb5abcdb735c02e4588ed9550b14?rik=IN%2bEdolMmNfYpQ&pid=ImgRaw&r=0",5);
//        Albums album2 = new Albums ("ejana allel" , "mido rashed ",5 , "https://i.ytimg.com/vi/c8jOJXIq7q0/maxresdefault.jpg",10);
//        Albums album3 = new Albums ("burj alhut","amr dyab",8 , "https://th.bing.com/th/id/OIP.FSUJLhSblsD4JTIye_UljwHaD4?pid=ImgDet&rs=1",3);
//
//        albumsRepository.save(album1);
//        albumsRepository.save(album2);
//        return new RedirectView("/albums");
//
//    }
    @PostMapping("/albums")
    public RedirectView addAlbum(@ModelAttribute Albums albums , Model newModel) {
        newModel.addAttribute("albums" , albums);
       
        albumsRepository.save(albums);
        return new RedirectView("/albums");
    }
//
//        List<Albums> albumsList = new ArrayList<Albums>();
//        albumsList.add (album1);
//        albumsList.add (album2);
//        albumsList.add (album3);



}
