package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private String mentorName;
    private int countTask;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void upDate(StudentHomework studentHomework) {
        System.out.println(mentorName + " :New task from " + studentHomework.getStudentName()
        + " task message: " + studentHomework.getHomeworkTask().peek() + "\n" + "( " + studentHomework.getStudentName()
        + " tasks total: " + studentHomework.getHomeworkTask().size() + " no read)\n"
        + "all no read tasks left: " + ++countTask);
    }

    public int getCountTask() {
        return countTask;
    }

}
