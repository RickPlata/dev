package com.big.bot.botsapp.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.big.bot.botsapp.model.ReportAdmin;
import com.big.bot.botsapp.service.ReportAdminService;

@Service
public class ReportAdminServiceImp implements ReportAdminService {
    
    @Autowired
    private ReportAdminService reportAdminService;

    @Override
    public List<ReportAdmin> getReportsAdmin() {
        return reportAdminService.getReportsAdmin();
    }

    @Override
    public ReporAdmin getReportAdmin(int id) {
        return reportAdminService.getReportAdmin(id);
    }

    @Override
    public ReportAdmin saveReportAdmin(ReportAdmin reportAdmin) {
        return reportAdminService.saveReportAdmin(reportAdmin);
    }

}
