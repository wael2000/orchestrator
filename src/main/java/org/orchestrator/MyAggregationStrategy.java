package org.orchestrator;

import java.util.Collection;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class MyAggregationStrategy implements  AggregationStrategy  {

	@Override
	public Exchange aggregate(Exchange message, Exchange resource) {
		
		Map oldMsg = message.getIn().getBody(Map.class);
		
		Map newMsg = resource.getIn().getBody(Map.class);
		
		((Collection)oldMsg.get("items")).add(newMsg);
		
	    message.getIn().setBody(oldMsg);
	    return message;
	}

}
