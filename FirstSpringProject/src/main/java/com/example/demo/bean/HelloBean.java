package com.example.demo.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("eng")
@Primary
public class HelloBean implements IHello {
public String getMessage(String msg)
{
return "Hello Spring"+msg;
}}
