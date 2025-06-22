package com.example;

public class UserService {
    public void doSomething() {
        String name = null;
        System.out.println(name.length());

        // ❌ Intentional error (wrong method name)
        System.out.println(name.touppercase());  // should be toUpperCase()
    }
}
