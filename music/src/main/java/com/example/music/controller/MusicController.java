package com.example.music.controller;

import com.example.music.domain.vo.MusicVO;
import com.example.music.service.MusicService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/music/*")
public class MusicController {
    private final MusicService musicService;

    @GetMapping("/list")
    public void list(Model model) {
        model.addAttribute("musics", musicService.show());
    }

    @GetMapping("/write")
    public void write(Model model){
        model.addAttribute("music", new MusicVO());
    }

    @PostMapping("/write")
    public RedirectView write(MusicVO musicVO, RedirectAttributes redirectAttributes){
        musicService.add(musicVO);
        redirectAttributes.addFlashAttribute("musicNumber", musicVO.getMusicNumber());
        return new RedirectView("list");
    }

    @GetMapping(value = {"read", "update"})
    public void read(Long musicNumber, Model model){
        model.addAttribute("music", musicService.find(musicNumber));
    }

    @PostMapping("/update")
    public RedirectView update(MusicVO musicVO, RedirectAttributes redirectAttributes){
        musicService.update(musicVO);
        redirectAttributes.addFlashAttribute("musicNumber", musicVO.getMusicNumber());
        return new RedirectView("/music/read");
    }

    @PostMapping("/delete")
    public RedirectView delete(Long musicNumber){
        musicService.delete(musicNumber);
        return new RedirectView("/music/list");
    }
}
