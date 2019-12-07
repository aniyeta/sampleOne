package com.anahita.demo.service;

import com.anahita.demo.dal.entity.Demo;
import com.anahita.demo.model.DemoModel;

public class MotherObject {

    public static final String DUMMY = "dummy";

    public static Demo anyDemoWithID(){
        Demo demo = new Demo();
        demo.setTest(DUMMY);
        demo.setId(1L);
        return demo;
    }

    public static DemoModel anyDemoModel(){
        DemoModel demoModel = new DemoModel();
        demoModel.setTest(DUMMY);
        return demoModel;
    }
}
