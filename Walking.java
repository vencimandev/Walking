package WhileExercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четем команда/ брой стъпки от конзолата
        // Правим цикъл, в който четем стъпките, които тя е извървяла
        //Правим проверка, дали е постигнала 10 000 стъпки
        //Принтираме, че целта е изпълнена + колко стъпки повече тя е извървяла
        int sumSteps = 0;
        String comand = scanner.nextLine();
        while (!comand.equals("Going home")) {
            int currentSteps = Integer.parseInt(comand);
            sumSteps += currentSteps;
            if (sumSteps >= 10000) {
                break;
            }
            comand = scanner.nextLine();
        }
        if (comand.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            sumSteps += stepsToHome;
        }
        if (sumSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", sumSteps - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - sumSteps);
        }
    }
}

