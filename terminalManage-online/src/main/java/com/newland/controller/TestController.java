package com.newland.controller;

import com.newland.device.entity.Device;
import com.newland.device.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ssomtms")
public class TestController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping(value = "/datasource")
    public Device dataSource() {
        Device device = deviceService.queryAll();
        return device;
    }

}
