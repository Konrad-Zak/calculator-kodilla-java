package com.kodilla.patterns2.facade.api.aop;

import com.kodilla.patterns2.facade.Item;
import com.kodilla.patterns2.facade.Order;
import com.kodilla.patterns2.facade.api.OrderDto;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WatcherOrderFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherOrderFacade.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))"
    + " && args(orderDto,idUser)" + " && target(object)")
    public void logEvent(OrderDto orderDto, Long idUser, Object object){
        LOGGER.info("Login the event... Class: " + object.getClass().getName() +
                " Args: userId: " + idUser );
    }

}
