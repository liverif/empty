package com.example;

import it.liverif.core.utils.RandomStringUtils;

public class App
{
    public static void main( String[] args )
    {
        String randomString=RandomStringUtils.generateAlfanumeric(10);
        System.out.println( randomString );
    }
}
