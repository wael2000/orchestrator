
package cloud_serviceclasses;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "uid",
    "name",
    "selfLink",
    "externalName",
    "description",
    "displayName",
    "documentationUrl",
    "imageUrl",
    "longDescription",
    "providerDisplayName",
    "tags",
    "clusterServiceBrokerName"
})
public class Cloudserviceclasses {

    @JsonProperty("uid")
    private String uid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("selfLink")
    private String selfLink;
    @JsonProperty("externalName")
    private String externalName;
    @JsonProperty("description")
    private String description;
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
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("clusterServiceBrokerName")
    private String clusterServiceBrokerName;

    /**
     * 
     * @return
     *     The uid
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * 
     * @param uid
     *     The uid
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The selfLink
     */
    @JsonProperty("selfLink")
    public String getSelfLink() {
        return selfLink;
    }

    /**
     * 
     * @param selfLink
     *     The selfLink
     */
    @JsonProperty("selfLink")
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    /**
     * 
     * @return
     *     The externalName
     */
    @JsonProperty("externalName")
    public String getExternalName() {
        return externalName;
    }

    /**
     * 
     * @param externalName
     *     The externalName
     */
    @JsonProperty("externalName")
    public void setExternalName(String externalName) {
        this.externalName = externalName;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

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

    /**
     * 
     * @return
     *     The tags
     */
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The clusterServiceBrokerName
     */
    @JsonProperty("clusterServiceBrokerName")
    public String getClusterServiceBrokerName() {
        return clusterServiceBrokerName;
    }

    /**
     * 
     * @param clusterServiceBrokerName
     *     The clusterServiceBrokerName
     */
    @JsonProperty("clusterServiceBrokerName")
    public void setClusterServiceBrokerName(String clusterServiceBrokerName) {
        this.clusterServiceBrokerName = clusterServiceBrokerName;
    }

}
