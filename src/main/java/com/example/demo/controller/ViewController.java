package com.example.demo.controller;

import com.example.demo.service.S3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/main")
public class ViewController {

    private final S3Service s3Service;

    @GetMapping("/")
    public String main() {
        return "Hello World";
    }

    @GetMapping("/perks")
    public String[] getPerks(@RequestParam(value = "idx") String nums) {
        String[] perks = nums.split(",");

        for(int i = 0; i < perks.length; i++) {
            perks[i] = s3Service.getPerksPath(perks[i]+".png");
        }

        return perks;
    }
}
