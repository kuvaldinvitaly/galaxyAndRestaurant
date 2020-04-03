package com.example.galaxylib;

public class Galaxy {
    public final String name;
    public final int lightYearsDistance;
    public final GType type;

    public Galaxy(String name, int kLightYearsDistance, GType type) {
        this.name = name;
        this.lightYearsDistance = kLightYearsDistance;
        this.type = type;
    }
}

