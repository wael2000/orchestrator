
package service_borker_serviceclasses;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "externalName",
    "externalID",
    "description",
    "bindable",
    "bindingRetrievable",
    "planUpdatable",
    "externalMetadata",
    "tags",
    "clusterServiceBrokerName"
})
public class Spec {

    @JsonProperty("externalName")
    private String externalName;
    @JsonProperty("externalID")
    private String externalID;
    @JsonProperty("description")
    private String description;
    @JsonProperty("bindable")
    private boolean bindable;
    @JsonProperty("bindingRetrievable")
    private boolean bindingRetrievable;
    @JsonProperty("planUpdatable")
    private boolean planUpdatable;
    @JsonProperty("externalMetadata")
    private ExternalMetadata externalMetadata;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("clusterServiceBrokerName")
    private String clusterServiceBrokerName;

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
     *     The externalID
     */
    @JsonProperty("externalID")
    public String getExternalID() {
        return externalID;
    }

    /**
     * 
     * @param externalID
     *     The externalID
     */
    @JsonProperty("externalID")
    public void setExternalID(String externalID) {
        this.externalID = externalID;
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
     *     The bindable
     */
    @JsonProperty("bindable")
    public boolean isBindable() {
        return bindable;
    }

    /**
     * 
     * @param bindable
     *     The bindable
     */
    @JsonProperty("bindable")
    public void setBindable(boolean bindable) {
        this.bindable = bindable;
    }

    /**
     * 
     * @return
     *     The bindingRetrievable
     */
    @JsonProperty("bindingRetrievable")
    public boolean isBindingRetrievable() {
        return bindingRetrievable;
    }

    /**
     * 
     * @param bindingRetrievable
     *     The bindingRetrievable
     */
    @JsonProperty("bindingRetrievable")
    public void setBindingRetrievable(boolean bindingRetrievable) {
        this.bindingRetrievable = bindingRetrievable;
    }

    /**
     * 
     * @return
     *     The planUpdatable
     */
    @JsonProperty("planUpdatable")
    public boolean isPlanUpdatable() {
        return planUpdatable;
    }

    /**
     * 
     * @param planUpdatable
     *     The planUpdatable
     */
    @JsonProperty("planUpdatable")
    public void setPlanUpdatable(boolean planUpdatable) {
        this.planUpdatable = planUpdatable;
    }

    /**
     * 
     * @return
     *     The externalMetadata
     */
    @JsonProperty("externalMetadata")
    public ExternalMetadata getExternalMetadata() {
        return externalMetadata;
    }

    /**
     * 
     * @param externalMetadata
     *     The externalMetadata
     */
    @JsonProperty("externalMetadata")
    public void setExternalMetadata(ExternalMetadata externalMetadata) {
        this.externalMetadata = externalMetadata;
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
