package org.orchestrator;

import java.util.List;
import java.util.ArrayList;

public class LocalServiceRepo {
	
	public List<LocalService> getServices() {
        try {
            ArrayList<LocalService> list = new ArrayList<LocalService>();
            LocalService service = new LocalService("11111111-2222-3333-4444-123456789DSG","11111111-2222-3333-4444-123456789DSG", 
								            		"/fuse/provision","AWS EC2 T2Micro","AWS EC2 T2Micro",
								            		"AWS EC2 T2Micro instance","documentationUrl","imageUrl","longDescription",
								            		"providerDisplayName","clusterServiceBrokerName",new ArrayList<String>());
            list.add(service);
            return list;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
