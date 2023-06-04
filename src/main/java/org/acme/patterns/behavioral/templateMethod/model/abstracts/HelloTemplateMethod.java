package org.acme.patterns.behavioral.templateMethod.model.abstracts;

public abstract class HelloTemplateMethod {

    public String hello() {
        return getResponse();
    }
    abstract String getResponse();
}
