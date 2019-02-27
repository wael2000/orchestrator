
package service_borker_serviceclasses;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "name",
    "uid",
    "controller",
    "blockOwnerDeletion"
})
public class OwnerReference {

    @JsonProperty("apiVersion")
    private String apiVersion;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("name")
    private String name;
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("controller")
    private boolean controller;
    @JsonProperty("blockOwnerDeletion")
    private boolean blockOwnerDeletion;

    /**
     * 
     * @return
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * 
     * @param apiVersion
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * 
     * @return
     *     The kind
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
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
     *     The controller
     */
    @JsonProperty("controller")
    public boolean isController() {
        return controller;
    }

    /**
     * 
     * @param controller
     *     The controller
     */
    @JsonProperty("controller")
    public void setController(boolean controller) {
        this.controller = controller;
    }

    /**
     * 
     * @return
     *     The blockOwnerDeletion
     */
    @JsonProperty("blockOwnerDeletion")
    public boolean isBlockOwnerDeletion() {
        return blockOwnerDeletion;
    }

    /**
     * 
     * @param blockOwnerDeletion
     *     The blockOwnerDeletion
     */
    @JsonProperty("blockOwnerDeletion")
    public void setBlockOwnerDeletion(boolean blockOwnerDeletion) {
        this.blockOwnerDeletion = blockOwnerDeletion;
    }

}
