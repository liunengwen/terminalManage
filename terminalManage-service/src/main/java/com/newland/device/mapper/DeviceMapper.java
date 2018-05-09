package com.newland.device.mapper;

import com.newland.device.entity.Device;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface DeviceMapper {

    @Select("select * from t_device")
    List<Device> queryAll();
}
