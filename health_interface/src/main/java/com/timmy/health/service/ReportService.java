package com.timmy.health.service;

import java.util.Map;

public interface ReportService {
    Map<String,Object> getBusinessReportData() throws Exception;

    Map<String, Object> getMemberHealthReportData(Integer memberId);
}
