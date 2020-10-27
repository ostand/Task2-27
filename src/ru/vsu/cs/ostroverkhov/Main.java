package ru.vsu.cs.ostroverkhov;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        int quantityOfGoalsN = readNumberOfGoals('N');

        int quantityOfGoalsM = readNumberOfGoals('M');

        Points points = countPoints(quantityOfGoalsN, quantityOfGoalsM);

        printResult(points);
    }

    public static Points countPoints(int quantityOfGoalsN, int quantityOfGoalsM) {
        if (quantityOfGoalsN > quantityOfGoalsM) {
            return Points.TEAM_N_WIN;
        } else if (quantityOfGoalsN == quantityOfGoalsM) {
            return Points.DRAW;
        } else {
            return Points.TEAM_M_WIN;
        }
    }

    public static int readNumberOfGoals(char name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number of goals scored by team %s: ", name);
        return scanner.nextInt();
    }

    public static void printResult(Points points) {
        System.out.println("Team N got " + points.teamNPoints + "\nTeam M got " + points.teamMPoints);
    }

}
