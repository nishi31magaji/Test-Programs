package com.yodlee.Test2;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class Example {

    private static final Logger logger =  LoggerFactory.getLogger(Example.class);
//	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Example.class);
    public static void main(String[] args) {
        logger.info("Example log from {}", Example.class.getSimpleName());
    }
}