package org.orchestrator;

import java.util.List;


public class LocalService {
		
	public LocalService(String uid, String name, String selfLink, String externalName, String description,
			String displayName, String documentationUrl, String imageUrl, String longDescription,
			String providerDisplayName, String clusterServiceBrokerName, List<String> tags) {
		super();
		this.uid = uid;
		this.name = name;
		this.selfLink = selfLink;
		this.externalName = externalName;
		this.description = description;
		this.displayName = displayName;
		this.documentationUrl = documentationUrl;
		this.imageUrl = imageUrl;
		this.longDescription = longDescription;
		this.providerDisplayName = providerDisplayName;
		this.clusterServiceBrokerName = clusterServiceBrokerName;
		this.tags = tags;
	}
	private String uid;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSelfLink() {
		return selfLink;
	}
	public void setSelfLink(String selfLink) {
		this.selfLink = selfLink;
	}
	public String getExternalName() {
		return externalName;
	}
	public void setExternalName(String externalName) {
		this.externalName = externalName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getDocumentationUrl() {
		return documentationUrl;
	}
	public void setDocumentationUrl(String documentationUrl) {
		this.documentationUrl = documentationUrl;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public String getProviderDisplayName() {
		return providerDisplayName;
	}
	public void setProviderDisplayName(String providerDisplayName) {
		this.providerDisplayName = providerDisplayName;
	}
	public String getClusterServiceBrokerName() {
		return clusterServiceBrokerName;
	}
	public void setClusterServiceBrokerName(String clusterServiceBrokerName) {
		this.clusterServiceBrokerName = clusterServiceBrokerName;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	private String name;
	private String selfLink;
	private String externalName;
	private String description;
	private String displayName;
	private String documentationUrl;
	private String imageUrl;
	private String longDescription;
	private String providerDisplayName;
	private String clusterServiceBrokerName;
	private List<String> tags;
	
}
