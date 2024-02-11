package week1;

import static input.InputUtils.yesNoInput;

public class CanYouTakeMCM {
    public static void main(String[] args) {
        boolean hasTakenITConcepts = yesNoInput("Have you taken ITEC 1100 Info Tech Concepts?");
        boolean hasTakenITSkills = yesNoInput("Have you taken ITEC 1110 Info Tech Skills?");
        boolean hasTakenWindows = yesNoInput("Have you taken ITEC 1250 Windows Operating Systems?");

        if (hasTakenWindows && hasTakenITConcepts && hasTakenITSkills){
            System.out.println("You meet the pre-requisites. You may take" +
                    " ITEC 130 Microcomputer Systems Maintenance.");
        }else {
            System.out.println("You do not meet the pre-requisites yet." +
                    " You need to complete all three pre-requisite classes.");
        }

    }
}
