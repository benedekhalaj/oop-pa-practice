package com.codecool.pa;

public class Band {
    private final String name;
    private final Style style;

    public Band(String name, Style style) {
        this.name = name;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public Style getStyle() {
        return style;
    }
}
