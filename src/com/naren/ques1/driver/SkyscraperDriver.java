package com.naren.ques1.driver;

import com.naren.ques1.processor.input.SkyscraperInputProcessing;
import com.naren.ques1.processor.output.SkyscraperOutputProcessing;

public class SkyscraperDriver {
    public static void main(String[] args) {
        SkyscraperInputProcessing inputProcessor = new SkyscraperInputProcessing();
        inputProcessor.processInput();
        SkyscraperOutputProcessing outputProcessor = new SkyscraperOutputProcessing();
        outputProcessor.processOutput(inputProcessor);
    }
}
