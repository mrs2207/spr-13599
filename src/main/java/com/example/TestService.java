/** ***************************************************************************
 * e-integration GmbH
 * Calor-Emag-Str. 3
 * 40878 Ratingen
 * Germany
 *
 * (c) Copyright 2015 by e-integration
 * ALL RIGHTS RESERVED
 *
 *************************************************************************** **/
package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Die Klasse
 *
 * @author ms
 */
@Component
public class TestService
{
    @Autowired
    private String  test1;
    @Autowired
    private String  test2;
}
