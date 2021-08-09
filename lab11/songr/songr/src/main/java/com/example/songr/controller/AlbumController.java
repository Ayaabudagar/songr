package com.example.songr.controller;

import com.example.songr.models.Albums;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {
    @GetMapping ("/albums")
    public String albums(Model newModel){
        Albums album1 = new Albums ("Lw Ala Albi", "Faddel Shaker" ,4 , "https://th.bing.com/th/id/R.fea5bb5abcdb735c02e4588ed9550b14?rik=IN%2bEdolMmNfYpQ&pid=ImgRaw&r=0",5);
        Albums album2 = new Albums ("ejana allel" , "mido rashed ",5 , "https://i.ytimg.com/vi/c8jOJXIq7q0/maxresdefault.jpg",10);
        Albums album3 = new Albums ("burj alhut","amr dyab",8 , "https://th.bing.com/th/id/OIP.FSUJLhSblsD4JTIye_UljwHaD4?pid=ImgDet&rs=1",3);
        List<Albums> albumsList = new ArrayList<Albums>();
        albumsList.add (album1);
        albumsList.add (album2);
        albumsList.add (album3);
        newModel.addAttribute("albums",albumsList);

        return "AlbumController.html";

    }

}
