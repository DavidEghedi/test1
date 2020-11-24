package com.company;

public enum Question {
    QUESTION_1("Wich is the highest mountain in the world?", "Mont Blanc", "Acconcagua", "Everest", "Annapurna", "Everest"),
    QUESTION_2("What is the favorite sport of winter?", "ski", "football", "volleyball", "hockey", "ski"),
    QUESTION_3("What is the height of Everest?", "4810m", "3970m", "8848m", "4478m", "8848m"),
    QUESTION_4("What are the heighest mountains in Europe?", "Caucas", "Anzi", "Alps", "Himalaya", "Alps"),
    QUESTION_5("Where is Everest situated?", "China", "Nepal-Tibet", "Pakistan", "India", "Nepal-Tibet") {
    };

    private final String question;
    private final String answer1;
    private final String answer2;
    private final String answer3;
    private final String answer4;
    private final String rightAnswer;

    Question(String question, String answer1, String answer2, String answer3, String answer4, String rightAnswer) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.rightAnswer = rightAnswer;
    }

    public Question getNext() {
        return values()[(ordinal() + 1) % values().length];
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer1() {
        return this.answer1;
    }

    public String getAnswer2() {
        return this.answer2;
    }

    public String getAnswer3() {
        return this.answer3;
    }

    public String getAnswer4() {
        return this.answer4;
    }

    public String getRightAnswer() {
        return this.rightAnswer;
    }
}

