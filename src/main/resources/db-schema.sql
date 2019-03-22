CREATE TABLE IF NOT EXISTS Service_Request
(
    order_number text ,
    order_status text,
    order_response text,
    service_provider text,
    service_type text,
    service_id text
);

CREATE TABLE IF NOT EXISTS local_service
(
    uid text,
    name text,
    "selfLink" text,
    "externalName" text,
    description text,
    "displayName" text,
    "documentationUrl" text,
    "imageUrl" text,
    "longDescription" text,
    "providerDisplayName" text,
    "clusterServiceBrokerName" text
);