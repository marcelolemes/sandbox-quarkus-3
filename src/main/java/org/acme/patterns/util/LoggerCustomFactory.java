package org.acme.patterns.util;

import jakarta.enterprise.inject.Produces;
import jakarta.enterprise.inject.spi.InjectionPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerCustomFactory {
    @Produces
    public Logger makeLogger(InjectionPoint ip) {
        final Logger logger = LoggerFactory.getLogger(ip.getMember().getDeclaringClass().getName());
        return logger;
    }
}
