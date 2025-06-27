package com.big.bot.botsapp.service;

import java.util.List;

import com.big.bot.botsapp.model.ReportEquipo;

public interface ReportEquipoService {

    List<ReportEquipo> getReportEquipos();
    ReportEquipo getReportEquipo(int id);
    ReportEquipo saveReportEquipo(ReportEquipo reportEquipo);

}
