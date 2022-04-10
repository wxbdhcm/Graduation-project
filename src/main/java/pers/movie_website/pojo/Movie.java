package pers.movie_website.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Movie {
    private String name;
    private String date; //上线时间
    private String source; //来源 电影 电视剧 还是什么
    private String type; //分类
    private String score; //评分
    private String movie_url; //豆瓣网址首页
    private String from; // 来源。豆瓣还是

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getMovie_url() {
        return movie_url;
    }

    public void setMovie_url(String movie_url) {
        this.movie_url = movie_url;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
