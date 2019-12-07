package com.anahita.demo.controller;

import com.anahita.demo.constant.NotFoundException;
import com.anahita.demo.dal.entity.Demo;
import com.anahita.demo.model.DemoModel;
import com.anahita.demo.service.DemoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
@AllArgsConstructor
public class UserController {


    private DemoService demoService;

    @GetMapping("hi")
    public String test() {
        return "HELLO WORLD!!";
    }

    @PostMapping
    public Demo saveDemo(@RequestBody DemoModel demoModel) {
        return demoService.save(demoModel);
    }

    @GetMapping("/{id}")
    public Demo getDemoById(@PathVariable String id) throws NotFoundException {
        return demoService.getDemoById(id);
    }
}
