package com.example.QuickApply;
public class Requirement {
    private String type;
    private String value;
    private String description;

    public Requirement(String type, String value, String description) {
        this.type = type;
        this.value = value;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
