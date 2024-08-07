package com.ilycodes.deneme2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Deneme2Application implements CommandLineRunner {
    public static List<MyObject> objects = new ArrayList<>();

    public static void main(String[] args) {

        SpringApplication.run(Deneme2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        objects.add(new MyObject(1, "Object 1"));
        objects.add(new MyObject(2, "Object 2"));
        objects.add(new MyObject(3, "Object 3"));
        objects.add(new MyObject(4, "Object 4"));
        objects.add(new MyObject(5, "Object 5"));
    }
}

class MyObject {
    private int id;
    private String name;

    public MyObject(int id, String name) {
        this.id = id;
        this.name = name;
}
public int getId() {
    return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "MyObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}