package com.newland.device.service.impl;

import com.github.pagehelper.PageHelper;
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
    public List<Device> queryAll() {
        PageHelper.startPage(1, 10);
        List<Device> deviceList = deviceMapper.queryAll();
        System.out.println(deviceList.size());
        return deviceList;
    }
}
