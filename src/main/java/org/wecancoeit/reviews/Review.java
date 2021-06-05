package org.wecancoeit.reviews;




public class Review {

    private Long id;
    private String title;
    private String url;
    private String category;
    private String content;

    public Review(Long id, String title, String url, String category, String content) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.category = category;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getCategory() {
        return category;
    }

    public String getContent() {
        return content;
    }
}
