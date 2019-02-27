package org.orchestrator;

import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.auth.BasicAWSCredentials;

public class MyAmazonAWSClient extends AmazonEC2Client {

	@SuppressWarnings("deprecation")
	public MyAmazonAWSClient() {
        super(new BasicAWSCredentials("user", "secret"));
    }
}
