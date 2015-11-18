package koreatech.cse.domain.oauth2.daum;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "userid",
        "id",
        "nickname",
        "imagePath",
        "bigImagePath",
        "openProfile"
})
public class DaumProfileDetail {
    @JsonProperty("userid")
    private String userid;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("imagePath")
    private String imagePath;
    @JsonProperty("bigImagePath")
    private String bigImagePath;
    @JsonProperty("openProfile")
    private Boolean openProfile;

    /**
     *
     * @return
     * The userid
     */
    @JsonProperty("userid")
    public String getUserid() {
        return userid;
    }

    /**
     *
     * @param userid
     * The userid
     */
    @JsonProperty("userid")
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     *
     * @return
     * The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The nickname
     */
    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    /**
     *
     * @param nickname
     * The nickname
     */
    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     *
     * @return
     * The imagePath
     */
    @JsonProperty("imagePath")
    public String getImagePath() {
        return imagePath;
    }

    /**
     *
     * @param imagePath
     * The imagePath
     */
    @JsonProperty("imagePath")
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     *
     * @return
     * The bigImagePath
     */
    @JsonProperty("bigImagePath")
    public String getBigImagePath() {
        return bigImagePath;
    }

    /**
     *
     * @param bigImagePath
     * The bigImagePath
     */
    @JsonProperty("bigImagePath")
    public void setBigImagePath(String bigImagePath) {
        this.bigImagePath = bigImagePath;
    }

    /**
     *
     * @return
     * The openProfile
     */
    @JsonProperty("openProfile")
    public Boolean getOpenProfile() {
        return openProfile;
    }

    /**
     *
     * @param openProfile
     * The openProfile
     */
    @JsonProperty("openProfile")
    public void setOpenProfile(Boolean openProfile) {
        this.openProfile = openProfile;
    }

    @Override
    public String toString() {
        return "Result{" +
                "userid='" + userid + '\'' +
                ", id=" + id +
                ", nickname='" + nickname + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", bigImagePath='" + bigImagePath + '\'' +
                ", openProfile=" + openProfile +
                '}';
    }
}