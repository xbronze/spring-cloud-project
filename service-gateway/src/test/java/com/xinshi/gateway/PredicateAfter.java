package com.xinshi.gateway;


import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author: xbronze
 * @date: 2025-03-06 22:28
 * @description: TODO
 */
public class PredicateAfter {

    @Test
    public void test() {
        System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
    }
}
