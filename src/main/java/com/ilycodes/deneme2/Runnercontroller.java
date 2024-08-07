package com.ilycodes.deneme2;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/objects")

public class Runnercontroller {
    @GetMapping
    public List<MyObject> getAllObjects() {
        return Deneme2Application.objects;
    }

    @GetMapping("/{id}")
    public MyObject getObjectById(@PathVariable int id) {
        Optional<MyObject> myObject = Deneme2Application.objects.stream().filter(obj -> obj.getId() == id).findFirst();
        return myObject.orElse(null);
    }

    @PostMapping
    public MyObject createObject(@RequestBody MyObject myObject) {
        Deneme2Application.objects.add(myObject);
        return myObject;
    }

    @PutMapping("/{id}")
    public MyObject updateObject(@PathVariable int id, @RequestBody MyObject newObject) {
        for (MyObject obj : Deneme2Application.objects) {
            if (obj.getId() == id) {
                obj.setName(newObject.getName());
                return obj;
            }
        }
        return null; // or throw an exception
    }
}
