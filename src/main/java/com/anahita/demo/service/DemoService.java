package com.anahita.demo.service;

import com.anahita.demo.constant.NotFoundException;
import com.anahita.demo.dal.entity.Demo;
import com.anahita.demo.dal.repository.DemoRepository;
import com.anahita.demo.model.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    public Demo save(DemoModel demoModel){
        Demo demo = new Demo();
        demo.setTest(demoModel.getTest());
        return demoRepository.save(demo);
    }

    public Demo getDemoById(String id) throws NotFoundException {
        Optional<Demo> demo = demoRepository.findById(Long.valueOf(id));
        if (demo.isPresent()){
            return demo.get();
        }else {
            throw new NotFoundException(id) ;
        }
    }
}
