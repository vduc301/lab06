package com.example.lab06_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.input("Hello world");
    }
}
