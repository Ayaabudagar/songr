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
    public String getAlbum(Model newModel){
        Albums album1 = new Albums ("Lw Ala Albi", "Faddel Shaker" ,4 , "https://www.bing.com/images/search?view=detailV2&ccid=YTtElpIx&id=E6C9E1ADCC1488F42305A5260604B3F6CB51657B&thid=OIP.YTtElpIxE1iy2IvSfQobxgHaFj&mediaurl=https%3a%2f%2fi.ytimg.com%2fvi%2felKpkk_I-_U%2fsddefault.jpg&cdnurl=https%3a%2f%2fth.bing.com%2fth%2fid%2fR.613b449692311358b2d88bd27d0a1bc6%3frik%3de2VRy%252fazBAYmpQ%26pid%3dImgRaw%26r%3d0&exph=480&expw=640&q=%d9%84%d9%88+%d8%b9%d9%84%d9%89+%d9%82%d9%84%d8%a8%d9%8a&simid=608045903273489298&FORM=IRPRST&ck=7E685B372D260F45380F60198FF4A435&selectedIndex=2",5);
        Albums album2 = new Albums ("ejana allel" , "mido rashed ",5 , "https://www.bing.com/images/search?view=detailV2&ccid=dDIEuXSM&id=CA91F3CCF7301533D731F534F00DC02C6A42CF5E&thid=OIP.dDIEuXSMBkiyk7qVKr9ZLQHaEK&mediaurl=https%3a%2f%2fi.ytimg.com%2fvi%2fc8jOJXIq7q0%2fmaxresdefault.jpg&cdnurl=https%3a%2f%2fth.bing.com%2fth%2fid%2fR.743204b9748c0648b293ba952abf592d%3frik%3dXs9CaizADfA09Q%26pid%3dImgRaw%26r%3d0&exph=720&expw=1280&q=%d8%a7%d8%ac%d8%a7%d9%86%d8%a7+%d8%a7%d9%84%d9%84%d9%8a%d9%84&simid=607998272084773897&FORM=IRPRST&ck=5BB370526F1F2262F8591EE1393BBCF6&selectedIndex=18",10);
        Albums album3 = new Albums ("burj alhut","amr dyab",8 , "https://www.bing.com/images/search?view=detailV2&ccid=FSUJLhSb&id=9A849BD9526FA2025BBF111D93DAF14A4A89CC5A&thid=OIP.FSUJLhSblsD4JTIye_UljwHaD4&mediaurl=https%3a%2f%2f2.bp.blogspot.com%2f-EXlGxsMU9HY%2fWZG3UMoyP7I%2fAAAAAAAAHhM%2fbe4vuCY8Uh0laHgZzIb2aR8gExpFJjBYgCLcBGAs%2fw1200-h630-p-k-no-nu%2f%2525D9%25258A%2525D8%2525A7%252B%2525D8%2525A7%2525D8%2525AC%2525D9%252585%2525D9%252584%252B%2525D8%2525B9%2525D9%25258A%2525D9%252588%2525D9%252586.PNG&cdnurl=https%3a%2f%2fth.bing.com%2fth%2fid%2fR.1525092e149b96c0f82532327bf5258f%3frik%3dWsyJSkrx2pMdEQ%26pid%3dImgRaw%26r%3d0&exph=421&expw=802&q=%d8%a8%d8%b1%d8%ac+%d8%a7%d9%84%d8%ad%d9%88%d8%aa+%d8%b9%d9%85%d8%b1+%d8%af%d9%8a%d8%a7%d8%a8&simid=608053355037547679&FORM=IRPRST&ck=E3D4CF055218AA6175D469A45096431A&selectedIndex=2",3);
        List<Albums> albumsList = new ArrayList<>();
        albumsList.add (album1);
        albumsList.add (album2);
        albumsList.add (album3);
        newModel.addAttribute("Album",albumsList);

        return "Albums";

    }

}
