package org.acme.patterns.strategy.model;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.patterns.strategy.services.HelloBuddyService;
import org.acme.patterns.strategy.services.HelloService;
import org.acme.patterns.strategy.services.HelloWorldService;
import org.slf4j.Logger;

@ApplicationScoped
public final class HelloFactory {
    private static final String INSTANCIA_NOVA = "Nova instância criada!";
    private static final String INSTANCIA_USADA = "Instância em memória Reutilizada!";
    private HelloStrategy helloStrategy;
    @Inject
    Logger logger;

    public HelloStrategy getHelloBuddy() {
        if (this.helloStrategy instanceof HelloBuddyService) {
            logger.info(INSTANCIA_USADA);
        } else {
            helloStrategy = new HelloBuddyService();
            logger.info(INSTANCIA_NOVA);
        }
        return this.helloStrategy;
    }

    public HelloStrategy getHelloWorld() {
        if (this.helloStrategy instanceof HelloWorldService) {
            logger.info(INSTANCIA_USADA);
        } else {
            helloStrategy = new HelloWorldService();
            logger.info(INSTANCIA_NOVA);
        }
        return this.helloStrategy;
    }

    public HelloStrategy getJustHello() {
        if (this.helloStrategy instanceof HelloService) {
            logger.info(INSTANCIA_USADA);
        } else {
            helloStrategy = new HelloService();
            logger.info(INSTANCIA_NOVA);
        }
        return this.helloStrategy;

    }

    private HelloFactory() {
    }
}
