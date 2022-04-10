package pers.movie_website.pojo;

import org.springframework.stereotype.Component;

/**
 * @author 18028
 */
@Component
public class case_all {
    private String designer_avatar;
    private String designer_name;
    private String imgUrl;
    private String title;
    private int case_id;

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

    public String getHouseLabel() {
        return houseLabel;
    }

    public void setHouseLabel(String houseLabel) {
        this.houseLabel = houseLabel;
    }

    private String houseLabel;

    public String getDesigner_avatar() {
        return designer_avatar;
    }

    public void setDesigner_avatar(String designer_avatar) {
        this.designer_avatar = designer_avatar;
    }

}
