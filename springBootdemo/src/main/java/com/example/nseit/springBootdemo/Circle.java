package com.example.nseit.springBootdemo;


import org.springframework.stereotype.Component;


@Component(value="c")
public class Circle implements Shape{

 public String showShape() {
// TODO Auto-generated method stub
return "It is circle in shape...";
}

}