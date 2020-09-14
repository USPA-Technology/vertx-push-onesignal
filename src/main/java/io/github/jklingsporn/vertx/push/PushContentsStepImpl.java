package io.github.jklingsporn.vertx.push;

import io.vertx.core.json.JsonObject;

/**
 * Created by jensklingsporn on 03.01.17.
 */
class PushContentsStepImpl implements PushMessageStep {

    private final JsonObject container;
    private final PushClient client;

    public PushContentsStepImpl(JsonObject container, PushClient client, JsonObject contents, String url) {
        this.container = container;
        this.client = client;
        this.container.put("contents", contents);
        
        if(! url.isEmpty()) {
        	this.container.put("url", url);
        }
        
    }

    @Override
    public JsonObject container() {
        return container;
    }

    @Override
    public PushClient client() {
        return client;
    }
}
