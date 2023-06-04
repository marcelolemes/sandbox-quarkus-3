package org.acme.patterns.behavioral.templateMethod.model.concrete;

import org.acme.patterns.behavioral.templateMethod.model.abstracts.HelloTemplateMethod;

public class HelloTemplateMethodChild extends HelloTemplateMethod {
    private final String response = "Olá (concreto)!";

    public String getResponse() {
        return this.response;
    }

}
