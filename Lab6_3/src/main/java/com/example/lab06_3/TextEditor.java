package com.example.lab06_3;

import java.io.IOException;

public class TextEditor {
    private String text;
    private TextWriter writer;

    public void input(String text) {
        this.text = text;
    }

    public void save(String fileName) throws IOException {
        writer.write(fileName, this.text);
    }
}
