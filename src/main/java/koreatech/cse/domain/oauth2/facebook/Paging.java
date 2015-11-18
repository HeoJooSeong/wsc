package koreatech.cse.domain.oauth2.facebook;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "cursors",
        "next"
})
public class Paging {
    @JsonProperty("cursors")
    private Cursors cursors;
    @JsonProperty("next")
    private String next;

    public Cursors getCursors() {
        return cursors;
    }

    public void setCursors(Cursors cursors) {
        this.cursors = cursors;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Paging{" +
                "cursors=" + cursors +
                ", next='" + next + '\'' +
                '}';
    }
}