package pers.movie_website.pojo;

public class User {
    private String designer_avatar;
    private String designer_name;
    private String imgUrl;
    private String title;
    private int case_id;
    private String commidityId;
    private String name;
    private String case_imgUrl;
    private String case_title;

    public String getDesigner_avatar() {
        return designer_avatar;
    }

    public void setDesigner_avatar(String designer_avatar) {
        this.designer_avatar = designer_avatar;
    }

    public String getDesigner_name() {
        return designer_name;
    }

    public void setDesigner_name(String designer_name) {
        this.designer_name = designer_name;
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

    public int getCase_id() {
        return case_id;
    }

    public void setCase_id(int case_id) {
        this.case_id = case_id;
    }

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

    public String getCase_imgUrl() {
        return case_imgUrl;
    }

    public void setCase_imgUrl(String case_imgUrl) {
        this.case_imgUrl = case_imgUrl;
    }

    public String getCase_title() {
        return case_title;
    }

    public void setCase_title(String case_title) {
        this.case_title = case_title;
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

    private int price;
    private  int new_price;
    private int  caseId;
    private String img_info;
}
