package com.example.QuickApply;
public class QuickApplyFactory {
    public IQuickApply createQuickApply() {
        return new QuickApply();
    }
}
