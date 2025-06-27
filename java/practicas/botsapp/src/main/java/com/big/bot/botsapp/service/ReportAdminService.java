package com.big.bot.botsapp.service;

import java.util.List;

import com.big.bot.botsapp.model.ReportAdmin;

public interface ReportAdminService {

    List<ReportAdmin> getReportsAdmin();
    ReportAdmin getReportAdmin(int id);
    ReportAdmin saveReportAdmin(ReportAdmin reportAdmin);

}
