package com.demo;

import com.demo.services.TwilioService;
import com.demo.services.TwilioServiceImpl;
import com.google.inject.AbstractModule;

import javax.inject.Singleton;

/**
 * @author Miguel Reyes
 *         Date: 12/7/14
 *         Time: 6:45 PM
 */
public class Bootstrap extends AbstractModule {

    @Override
    protected void configure() {
        bind(TwilioService.class).to(TwilioServiceImpl.class).in(Singleton.class);
    }
}
