package com.gwc.demo.learn.designpattern.adapter.observer;

public class ObserverTest {
    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("mic");
        gPer.addObserver(tom);
        gPer.addObserver(mic);

        Question question = new Question();
        question.setUserName("gwc");
        question.setContent("观察者模式使用与那些场景？");

        gPer.publicQuestion(question);
    }
}
