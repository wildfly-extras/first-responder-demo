package org.cajun.navy.resource;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.ws.rs.ext.ContextResolver;
import jakarta.ws.rs.ext.Provider;

@Provider
public class JsonbContextResolver implements ContextResolver<Jsonb> {
    private final Jsonb jsonb;

    public JsonbContextResolver() {
        jsonb = JsonbBuilder.create();
    }

    @Override
    public Jsonb getContext(Class<?> aClass) {
        return jsonb;
    }
}
