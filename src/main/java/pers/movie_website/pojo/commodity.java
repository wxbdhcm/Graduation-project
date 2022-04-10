package pers.movie_website.pojo;

public class commodity {
    private String commidityId;
    private String name;
    private String imgUrl;
    private String title;
    private int price;
    private  int new_price;
    private int  caseId;
    private String img_info;

    public String getCommidityId() {
        return commidityId;
    }

    public void setCommidityId(String commidityId) {
        this.commidityId = commidityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNew_price() {
        return new_price;
    }

    public void setNew_price(int new_price) {
        this.new_price = new_price;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public String getImg_info() {
        return img_info;
    }

    public void setImg_info(String img_info) {
        this.img_info = img_info;
    }
}
