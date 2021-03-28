package com.example.diamondapp;

public class RandomFacts {

    public String facts[] = {
            "Which of these plastic bottles are recyclable?",
            "Which of these materials can be recycled?",
            "Which of these are NOT recyclable?",
            "All these words indicate items designed to be composted (not recycled) except:",
            "Our recycling program currently accepts:",
            "Which of the following metal items can be recycled?",
            "All of these paper food containers can be recycled except what?",
            "Which of the following food waste items is NOT recommended to compost?",
            "Which of the following paper products is NOT compostable?",
            "Which of the following hygiene products can be composted?"
    };

    public String getFact(int numFact){
        String fact = facts[numFact];
        return fact;
    }

}
