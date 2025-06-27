package com.big.bot.botsapp.model;

import lombok.Data;

@Data
public class ReportEquipo {
    
    private int id;
    private String name;
    private String lab;
    private String device;
    private String subject;
    private String incident;
    private String time;
    private String date;
    private int status;

}
