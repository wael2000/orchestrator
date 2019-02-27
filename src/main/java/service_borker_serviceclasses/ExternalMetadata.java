
package service_borker_serviceclasses;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "displayName",
    "documentationUrl",
    "imageUrl",
    "longDescription",
    "providerDisplayName"
})
public class ExternalMetadata {

    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("documentationUrl")
    private String documentationUrl;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("longDescription")
    private String longDescription;
    @JsonProperty("providerDisplayName")
    private String providerDisplayName;

    /**
     * 
     * @return
     *     The displayName
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 
     * @param displayName
     *     The displayName
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 
     * @return
     *     The documentationUrl
     */
    @JsonProperty("documentationUrl")
    public String getDocumentationUrl() {
        return documentationUrl;
    }

    /**
     * 
     * @param documentationUrl
     *     The documentationUrl
     */
    @JsonProperty("documentationUrl")
    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    /**
     * 
     * @return
     *     The imageUrl
     */
    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 
     * @param imageUrl
     *     The imageUrl
     */
    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 
     * @return
     *     The longDescription
     */
    @JsonProperty("longDescription")
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * 
     * @param longDescription
     *     The longDescription
     */
    @JsonProperty("longDescription")
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     * 
     * @return
     *     The providerDisplayName
     */
    @JsonProperty("providerDisplayName")
    public String getProviderDisplayName() {
        return providerDisplayName;
    }

    /**
     * 
     * @param providerDisplayName
     *     The providerDisplayName
     */
    @JsonProperty("providerDisplayName")
    public void setProviderDisplayName(String providerDisplayName) {
        this.providerDisplayName = providerDisplayName;
    }

}
