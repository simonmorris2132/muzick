package com.careerdevs.muzick.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.careerdevs.muzick.payloads.NewsAPI;

@CrossOrigin
@RestController
@RequestMapping("/api/news")
public class NewsController {
    
    @Autowired
    private RestTemplate restTemplate;

    @Value("${muzick.api.key}")
    public String apiKey;
    
    @GetMapping("/test")
    public ResponseEntity<String> testRoute() {
        return new ResponseEntity<>("Body", HttpStatus.OK);
    }

    @GetMapping("/news")
    public ResponseEntity<?> getMusicArticle() {
        String url = "https://newsapi.org/v2/top-headlines?country=us&apiKey=" + apiKey;

        NewsAPI response = restTemplate.getForObject(url, NewsAPI.class);

        System.out.println(response.getStatus());
        System.out.println(response.getArticles().get(0).getTitle());
        System.out.println(response.getArticles().get(0));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
