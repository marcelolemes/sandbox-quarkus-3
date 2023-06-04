package org.acme.patterns.behavioral.templateMethod.model;

public class HelloTemplateMethodChild extends HelloTemplateMethod {
    private final String response = "Olá (concreto)!";

    public String getResponse() {
        return this.response;
    }

}
