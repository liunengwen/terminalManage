package com.newland.device.entity;

import lombok.Data;
import lombok.Getter;

import java.util.Date;

@Data
public class Device {

    private Long devId;

    private String devSn;

    private String batchNo;

    private String firmCode;

    private String firmName;

    private String prodCode;

    private String prodName;

    private Integer isActive;

    private Date activeTime;

    private String devMk;

    private String devSek;

    private String devSekIndex;

    private String devTekIndex;

    private String deviceFlag;

    private Integer devStatus;

    private Date creTime;

    private Date updTime;

}
