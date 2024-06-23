package com.console.vasco.controller;


import org.springframework.web.bind.annotation.*;

import com.console.vasco.model.Console;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/consoles")
public class ConsoleController {
    private List<Console> consoles = new ArrayList<>();

    @PostMapping
    public Console createConsole(@RequestBody Console console) {
        consoles.add(console);
        return console;
    }

    @GetMapping
    public List<Console> getConsoles() {
        return consoles;
    }

    @DeleteMapping("/{index}")
    public Console deleteConsole(@PathVariable int index) {
        if (index >= 0 && index < consoles.size()) {
            return consoles.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    @PutMapping("/{index}")
    public Console updateConsole(@PathVariable int index, @RequestBody Console newConsole) {
        if (index >= 0 && index < consoles.size()) {
            Console existingConsole = consoles.get(index);
            existingConsole.setName(newConsole.getName());
            existingConsole.setValue(newConsole.getValue());
            return existingConsole;
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }
}