
package service_borker_serviceclasses;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "removedFromBrokerCatalog"
})
public class Status {

    @JsonProperty("removedFromBrokerCatalog")
    private boolean removedFromBrokerCatalog;

    /**
     * 
     * @return
     *     The removedFromBrokerCatalog
     */
    @JsonProperty("removedFromBrokerCatalog")
    public boolean isRemovedFromBrokerCatalog() {
        return removedFromBrokerCatalog;
    }

    /**
     * 
     * @param removedFromBrokerCatalog
     *     The removedFromBrokerCatalog
     */
    @JsonProperty("removedFromBrokerCatalog")
    public void setRemovedFromBrokerCatalog(boolean removedFromBrokerCatalog) {
        this.removedFromBrokerCatalog = removedFromBrokerCatalog;
    }

}
