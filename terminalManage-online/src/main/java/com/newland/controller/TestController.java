package com.newland.controller;

import com.google.common.base.Splitter;
import com.newland.device.entity.Device;
import com.newland.device.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

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
    public List<Device> dataSource() {
        List<Device> devices = deviceService.queryAll();
        return devices;
    }

    @GetMapping(value = "/productBatchList.html")
    public String productBatchList() {
        System.out.println("123123");
        return "";
    }
}
