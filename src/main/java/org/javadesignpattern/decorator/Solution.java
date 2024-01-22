package org.javadesignpattern.decorator;

public class Solution {

    interface Developer {
        void doJob();
    }

    static class JavaDeveloper implements Developer {
        @Override
        public void doJob() {
            System.out.println("Write java code");
        }
    }

    static abstract class BaseDeveloperDecorator implements Developer {
        protected Developer developer;

        public BaseDeveloperDecorator(Developer developer) {
            this.developer = developer;
        }
    }

    static class TeamLeadDecorator extends BaseDeveloperDecorator {

        public TeamLeadDecorator(Developer developer) {
            super(developer);
        }

        @Override
        public void doJob() {
            developer.doJob();
            System.out.println("Manage team...");
        }
    }

    static class ArchitectDecorator extends BaseDeveloperDecorator {

        public ArchitectDecorator(Developer developer) {
            super(developer);
        }

        @Override
        public void doJob() {
            developer.doJob();
            System.out.println("Do architecture...");
        }
    }

    public static void main(String[] args) {
        System.out.println("Java dev:");
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        javaDeveloper.doJob();
        System.out.println();

        System.out.println("Team lead and java developer:");
        TeamLeadDecorator teamLead = new TeamLeadDecorator(new JavaDeveloper());
        teamLead.doJob();
        System.out.println();

        System.out.println("Software architect and java developer:");
        ArchitectDecorator architect = new ArchitectDecorator(new JavaDeveloper());
        architect.doJob();
        System.out.println();

        System.out.println("Team lead, software architect and java developer:");
        ArchitectDecorator architectTeamLead = new ArchitectDecorator(new TeamLeadDecorator(new JavaDeveloper()));
        architectTeamLead.doJob();
        System.out.println();
    }

}
