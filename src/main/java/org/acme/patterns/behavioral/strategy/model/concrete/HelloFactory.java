package org.acme.patterns.behavioral.strategy.model.concrete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.patterns.behavioral.strategy.model.abstracts.HelloStrategy;
import org.acme.patterns.behavioral.strategy.services.HelloBuddyService;
import org.acme.patterns.behavioral.strategy.services.HelloService;
import org.acme.patterns.behavioral.strategy.services.HelloWorldService;
import org.slf4j.Logger;

import static org.acme.patterns.general.util.Constants.INSTANCIA_NOVA;
import static org.acme.patterns.general.util.Constants.INSTANCIA_USADA;

@ApplicationScoped
public final class HelloFactory {
    HelloStrategy helloStrategy;
    @Inject
    Logger logger;

    public HelloStrategy getHelloBuddy() {
        if (this.helloStrategy instanceof HelloBuddyService) {
            logger.debug(INSTANCIA_USADA);
        } else {
            helloStrategy = new HelloBuddyService();
            logger.debug(INSTANCIA_NOVA);
        }
        return this.helloStrategy;
    }

    public HelloStrategy getHelloWorld() {
        if (this.helloStrategy instanceof HelloWorldService) {
            logger.debug(INSTANCIA_USADA);
        } else {
            helloStrategy = new HelloWorldService();
            logger.debug(INSTANCIA_NOVA);
        }
        return this.helloStrategy;
    }

    public HelloStrategy getJustHello() {
        if (this.helloStrategy instanceof HelloService) {
            logger.debug(INSTANCIA_USADA);
        } else {
            helloStrategy = new HelloService();
            logger.debug(INSTANCIA_NOVA);
        }
        return this.helloStrategy;

    }

    private HelloFactory() {
    }
}
