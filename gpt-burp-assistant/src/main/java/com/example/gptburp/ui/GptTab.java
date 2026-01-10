package com.example.gptburp.ui;

import burp.ITab;

import javax.swing.*;
import java.awt.*;

public class GptTab implements ITab {
    private JPanel panel;

    public GptTab() {
        panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("🚀 Hello from GPT Burp Assistant!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);
    }

    @Override
    public String getTabCaption() {
        return "GPT Assistant";
    }

    @Override
    public Component getUiComponent() {
        return panel;
    }
}
