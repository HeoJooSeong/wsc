package koreatech.cse.domain.oauth2.daum;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "result",
        "title",
        "totalCount",
        "description",
        "item",
        "lastBuildDate",
        "link",
        "generator"
})
public class Channel {
    @JsonProperty("result")
    private String result;
    @JsonProperty("title")
    private String title;
    @JsonProperty("totalCount")
    private String totalCount;
    @JsonProperty("description")
    private String description;
    @JsonProperty("item")
    private List<Item> item = new ArrayList<Item>();
    @JsonProperty("lastBuildDate")
    private String lastBuildDate;
    @JsonProperty("link")
    private String link;
    @JsonProperty("generator")
    private String generator;

    /**
     *
     * @return
     * The result
     */
    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    /**
     *
     * @param result
     * The result
     */
    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    /**
     *
     * @return
     * The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The totalCount
     */
    @JsonProperty("totalCount")
    public String getTotalCount() {
        return totalCount;
    }

    /**
     *
     * @param totalCount
     * The totalCount
     */
    @JsonProperty("totalCount")
    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    /**
     *
     * @return
     * The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The item
     */
    @JsonProperty("item")
    public List<Item> getItem() {
        return item;
    }

    /**
     *
     * @param item
     * The item
     */
    @JsonProperty("item")
    public void setItem(List<Item> item) {
        this.item = item;
    }

    /**
     *
     * @return
     * The lastBuildDate
     */
    @JsonProperty("lastBuildDate")
    public String getLastBuildDate() {
        return lastBuildDate;
    }

    /**
     *
     * @param lastBuildDate
     * The lastBuildDate
     */
    @JsonProperty("lastBuildDate")
    public void setLastBuildDate(String lastBuildDate) {
        this.lastBuildDate = lastBuildDate;
    }

    /**
     *
     * @return
     * The link
     */
    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    /**
     *
     * @param link
     * The link
     */
    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    /**
     *
     * @return
     * The generator
     */
    @JsonProperty("generator")
    public String getGenerator() {
        return generator;
    }

    /**
     *
     * @param generator
     * The generator
     */
    @JsonProperty("generator")
    public void setGenerator(String generator) {
        this.generator = generator;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "result='" + result + '\'' +
                ", title='" + title + '\'' +
                ", totalCount='" + totalCount + '\'' +
                ", description='" + description + '\'' +
                ", item=" + item +
                ", lastBuildDate='" + lastBuildDate + '\'' +
                ", link='" + link + '\'' +
                ", generator='" + generator + '\'' +
                '}';
    }
}