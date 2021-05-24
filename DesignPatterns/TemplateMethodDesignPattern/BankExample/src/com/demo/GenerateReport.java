package com.demo;

import com.demo.AuditTrail;

public class GenerateReport {

    private AuditTrail auditTrail;

    public GenerateReport(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        System.out.println("Generate Report!");
    }

}
