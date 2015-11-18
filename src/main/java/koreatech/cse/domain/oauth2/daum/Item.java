package koreatech.cse.domain.oauth2.daum;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "author_t",
        "sale_price",
        "cover_s_url",
        "sale_yn",
        "pub_date",
        "link",
        "barcode",
        "etc_author",
        "status_des",
        "author",
        "title",
        "category",
        "translator",
        "pub_nm",
        "description",
        "isbn",
        "ebook_barcode",
        "isbn13",
        "cover_l_url",
        "list_price"
})
public class Item {
    @JsonProperty("author_t")
    private String authorT;
    @JsonProperty("sale_price")
    private String salePrice;
    @JsonProperty("cover_s_url")
    private String coverSUrl;
    @JsonProperty("sale_yn")
    private String saleYn;
    @JsonProperty("pub_date")
    private String pubDate;
    @JsonProperty("link")
    private String link;
    @JsonProperty("barcode")
    private String barcode;
    @JsonProperty("etc_author")
    private String etcAuthor;
    @JsonProperty("status_des")
    private String statusDes;
    @JsonProperty("author")
    private String author;
    @JsonProperty("title")
    private String title;
    @JsonProperty("category")
    private String category;
    @JsonProperty("translator")
    private String translator;
    @JsonProperty("pub_nm")
    private String pubNm;
    @JsonProperty("description")
    private String description;
    @JsonProperty("isbn")
    private String isbn;
    @JsonProperty("ebook_barcode")
    private String ebookBarcode;
    @JsonProperty("isbn13")
    private String isbn13;
    @JsonProperty("cover_l_url")
    private String coverLUrl;
    @JsonProperty("list_price")
    private String listPrice;

    /**
     *
     * @return
     * The authorT
     */
    @JsonProperty("author_t")
    public String getAuthorT() {
        return authorT;
    }

    /**
     *
     * @param authorT
     * The author_t
     */
    @JsonProperty("author_t")
    public void setAuthorT(String authorT) {
        this.authorT = authorT;
    }

    /**
     *
     * @return
     * The salePrice
     */
    @JsonProperty("sale_price")
    public String getSalePrice() {
        return salePrice;
    }

    /**
     *
     * @param salePrice
     * The sale_price
     */
    @JsonProperty("sale_price")
    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    /**
     *
     * @return
     * The coverSUrl
     */
    @JsonProperty("cover_s_url")
    public String getCoverSUrl() {
        return coverSUrl;
    }

    /**
     *
     * @param coverSUrl
     * The cover_s_url
     */
    @JsonProperty("cover_s_url")
    public void setCoverSUrl(String coverSUrl) {
        this.coverSUrl = coverSUrl;
    }

    /**
     *
     * @return
     * The saleYn
     */
    @JsonProperty("sale_yn")
    public String getSaleYn() {
        return saleYn;
    }

    /**
     *
     * @param saleYn
     * The sale_yn
     */
    @JsonProperty("sale_yn")
    public void setSaleYn(String saleYn) {
        this.saleYn = saleYn;
    }

    /**
     *
     * @return
     * The pubDate
     */
    @JsonProperty("pub_date")
    public String getPubDate() {
        return pubDate;
    }

    /**
     *
     * @param pubDate
     * The pub_date
     */
    @JsonProperty("pub_date")
    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
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
     * The barcode
     */
    @JsonProperty("barcode")
    public String getBarcode() {
        return barcode;
    }

    /**
     *
     * @param barcode
     * The barcode
     */
    @JsonProperty("barcode")
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     *
     * @return
     * The etcAuthor
     */
    @JsonProperty("etc_author")
    public String getEtcAuthor() {
        return etcAuthor;
    }

    /**
     *
     * @param etcAuthor
     * The etc_author
     */
    @JsonProperty("etc_author")
    public void setEtcAuthor(String etcAuthor) {
        this.etcAuthor = etcAuthor;
    }

    /**
     *
     * @return
     * The statusDes
     */
    @JsonProperty("status_des")
    public String getStatusDes() {
        return statusDes;
    }

    /**
     *
     * @param statusDes
     * The status_des
     */
    @JsonProperty("status_des")
    public void setStatusDes(String statusDes) {
        this.statusDes = statusDes;
    }

    /**
     *
     * @return
     * The author
     */
    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @param author
     * The author
     */
    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
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
     * The category
     */
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    /**
     *
     * @param category
     * The category
     */
    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *
     * @return
     * The translator
     */
    @JsonProperty("translator")
    public String getTranslator() {
        return translator;
    }

    /**
     *
     * @param translator
     * The translator
     */
    @JsonProperty("translator")
    public void setTranslator(String translator) {
        this.translator = translator;
    }

    /**
     *
     * @return
     * The pubNm
     */
    @JsonProperty("pub_nm")
    public String getPubNm() {
        return pubNm;
    }

    /**
     *
     * @param pubNm
     * The pub_nm
     */
    @JsonProperty("pub_nm")
    public void setPubNm(String pubNm) {
        this.pubNm = pubNm;
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
     * The isbn
     */
    @JsonProperty("isbn")
    public String getIsbn() {
        return isbn;
    }

    /**
     *
     * @param isbn
     * The isbn
     */
    @JsonProperty("isbn")
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     *
     * @return
     * The ebookBarcode
     */
    @JsonProperty("ebook_barcode")
    public String getEbookBarcode() {
        return ebookBarcode;
    }

    /**
     *
     * @param ebookBarcode
     * The ebook_barcode
     */
    @JsonProperty("ebook_barcode")
    public void setEbookBarcode(String ebookBarcode) {
        this.ebookBarcode = ebookBarcode;
    }

    /**
     *
     * @return
     * The isbn13
     */
    @JsonProperty("isbn13")
    public String getIsbn13() {
        return isbn13;
    }

    /**
     *
     * @param isbn13
     * The isbn13
     */
    @JsonProperty("isbn13")
    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    /**
     *
     * @return
     * The coverLUrl
     */
    @JsonProperty("cover_l_url")
    public String getCoverLUrl() {
        return coverLUrl;
    }

    /**
     *
     * @param coverLUrl
     * The cover_l_url
     */
    @JsonProperty("cover_l_url")
    public void setCoverLUrl(String coverLUrl) {
        this.coverLUrl = coverLUrl;
    }

    /**
     *
     * @return
     * The listPrice
     */
    @JsonProperty("list_price")
    public String getListPrice() {
        return listPrice;
    }

    /**
     *
     * @param listPrice
     * The list_price
     */
    @JsonProperty("list_price")
    public void setListPrice(String listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "authorT='" + authorT + '\'' +
                ", salePrice='" + salePrice + '\'' +
                ", coverSUrl='" + coverSUrl + '\'' +
                ", saleYn='" + saleYn + '\'' +
                ", pubDate='" + pubDate + '\'' +
                ", link='" + link + '\'' +
                ", barcode='" + barcode + '\'' +
                ", etcAuthor='" + etcAuthor + '\'' +
                ", statusDes='" + statusDes + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", translator='" + translator + '\'' +
                ", pubNm='" + pubNm + '\'' +
                ", description='" + description + '\'' +
                ", isbn='" + isbn + '\'' +
                ", ebookBarcode='" + ebookBarcode + '\'' +
                ", isbn13='" + isbn13 + '\'' +
                ", coverLUrl='" + coverLUrl + '\'' +
                ", listPrice='" + listPrice + '\'' +
                '}';
    }
}