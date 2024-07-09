package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component("fr")
public class BonjourBean implements IHello {
public String getMessage(String msg)
{
return "Bonjour"+msg;
}}
