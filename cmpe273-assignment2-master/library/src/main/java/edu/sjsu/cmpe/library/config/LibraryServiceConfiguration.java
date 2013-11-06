package edu.sjsu.cmpe.library.config;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;

public class LibraryServiceConfiguration extends Configuration {
	
	@NotEmpty
    @JsonProperty
    private String defaultName;
	
    @NotEmpty
    @JsonProperty
    private String stompQueueName;

    @NotEmpty
    @JsonProperty
    private String stompTopicName;
    
    private String apolloUser;
    private String apolloPassword;
    private int apolloPort;
    private String apolloHost;
    
    public String getApolloUser() {
		return apolloUser;
	}

	public void setApolloUser(String apolloUser) {
		this.apolloUser = apolloUser;
	}

	public String getApolloPassword() {
		return apolloPassword;
	}

	public void setApolloPassword(String apolloPassword) {
		this.apolloPassword = apolloPassword;
	}

	public int getApolloPort() {
		return apolloPort;
	}

	public void setApolloPort(int apolloPort) {
		this.apolloPort = apolloPort;
	}

	public String getApolloHost() {
		return apolloHost;
	}

	public void setApolloHost(String apolloHost) {
		this.apolloHost = apolloHost;
	}

	/**
     * @return the defaultName
     */
    public String getDefaultName() {
	return defaultName;
    }

    /**
     * @param defaultName
     *            the defaultName to set
     */
    public void setDefaultName(String defaultName) {
	this.defaultName = defaultName;
    }

    
    /**
     * @return the stompQueueName
     */
    public String getStompQueueName() {
	return stompQueueName;
    }

    /**
     * @param stompQueueName
     *            the stompQueueName to set
     */
    public void setStompQueueName(String stompQueueName) {
	this.stompQueueName = stompQueueName;
    }

    /**
     * @return the stompTopicName
     */
    public String getStompTopicName() {
	return stompTopicName;
    }

    /**
     * @param stompTopicName
     *            the stompTopicName to set
     */
    public void setStompTopicName(String stompTopicName) {
	this.stompTopicName = stompTopicName;
    }
}
