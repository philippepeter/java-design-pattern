package org.javadesignpattern.decorator;

public class Todo {
    interface Developer {
        void doJob();
    }

    static class JavaDeveloper implements Developer {
        @Override
        public void doJob() {
            System.out.println("Write java code");
        }
    }


    public static void main(String[] args) {
        System.out.println("Java dev:");
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        javaDeveloper.doJob();
        System.out.println();

        System.out.println("Team lead and java developer:");
        // TODO do java dev job + team lead management stuff
        System.out.println();

        System.out.println("Software architect and java developer:");
        // TODO do java dev job + architecture stuff
        System.out.println();

        System.out.println("Team lead, software architect and java developer:");
        // TODO do java dev job + architecture stuff + team lead management stuff
        System.out.println();
    }
}
