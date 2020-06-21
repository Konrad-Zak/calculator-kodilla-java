package com.kodilla.patterns2.facade.api.aop;

import com.kodilla.patterns2.facade.Order;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WatcherOrderFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherOrderFacade.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent(){
        LOGGER.info("Login the event: used processOrder ");
    }


}
