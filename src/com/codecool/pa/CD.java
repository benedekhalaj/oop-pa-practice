package com.codecool.pa;

public class CD extends Borrowable {
    private int tracks;

    public CD(String name, int tracks) {
        super(name);
        this.tracks = tracks;
    }

    public CD(String name) {
        super(name);
    }
}
