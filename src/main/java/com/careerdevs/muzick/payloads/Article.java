package com.careerdevs.muzick.payloads;

public class Article {
    
    private class Source {
        
        private String id;
        private String name;

        public Source() {
        }

        public Source(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

}

    private Source source;
    private String author;
    private String title;
    private String urlToImage;
    private String description;
    private String url;

    public Article() {
    }

    public Article(Source source, String author, String title, String urlToImage, String description, String url) {
        this.source = source;
        this.author = author;
        this.title = title;
        this.urlToImage = urlToImage;
        this.description = description;
        this.url = url;
    }

}
