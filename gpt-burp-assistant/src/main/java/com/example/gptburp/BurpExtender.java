package com.example.gptburp;



import burp.IBurpExtender;
import burp.IBurpExtenderCallbacks;
import burp.ITab;

import javax.swing.*;
import java.awt.*;

public class BurpExtender implements IBurpExtender, ITab {

    private JPanel panel;

    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        callbacks.setExtensionName("GPT Burp Assistant");

        // Build simple UI
        SwingUtilities.invokeLater(() -> {
            panel = new JPanel(new BorderLayout());
            JLabel label = new JLabel("Hello from GPT Burp Assistant!");
            JTextArea textArea = new JTextArea("Start interacting with GPT here...");
            textArea.setLineWrap(true);

            panel.add(label, BorderLayout.NORTH);
            panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

            // Register tab
            callbacks.addSuiteTab(this);
            callbacks.printOutput("✅ GPT Burp Assistant loaded successfully with UI tab!");
        });
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
