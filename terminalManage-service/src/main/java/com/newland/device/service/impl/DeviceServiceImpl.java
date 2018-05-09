package com.newland.device.service.impl;

import com.newland.device.entity.Device;
import com.newland.device.mapper.DeviceMapper;
import com.newland.device.service.DeviceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Resource
    private DeviceMapper deviceMapper;

    @Override
    public Device queryAll() {
        List<Device> deviceList = deviceMapper.queryAll();
        System.out.println(deviceList.size());
        return new Device();
    }
}
