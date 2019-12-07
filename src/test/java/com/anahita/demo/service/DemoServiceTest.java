package com.anahita.demo.service;

import com.anahita.demo.dal.entity.Demo;
import com.anahita.demo.dal.repository.DemoRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.anahita.demo.service.MotherObject.anyDemoModel;
import static com.anahita.demo.service.MotherObject.anyDemoWithID;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

@ExtendWith(SpringExtension.class)
class DemoServiceTest {

    @InjectMocks
    DemoService demoService;
    @Mock
    DemoRepository demoRepository;

    @Test
    @DisplayName("given save when parameter test was fill then return demo object with id")
    void given_save_when_parameter_test_was_fill_then_return_demo_object_with_id() {
        doReturn(anyDemoWithID()).when(demoRepository).save(any(Demo.class));

        Demo savedDemo = demoService.save(anyDemoModel());

        assertEquals(anyDemoWithID(), savedDemo);
    }

    @Test
    void getDemoById() {
    }
}