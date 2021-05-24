package com.demo;

public abstract class Task {

    private AuditTrail auditTrail;

    public Task() {
        auditTrail = new AuditTrail();
    }

    public void execute() {
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
