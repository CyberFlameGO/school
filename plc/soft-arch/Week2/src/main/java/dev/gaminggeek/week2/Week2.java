package dev.gaminggeek.week2;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;

import dev.gaminggeek.week2.VariableTypes;
import dev.gaminggeek.week2.DonateBlood;
import dev.gaminggeek.week2.EligibleToVote;
import dev.gaminggeek.week2.IfElse;

class Week2 {
    public static final Set<String> projects = Set.of(
        "variabletypes",
        "donateblood",
        "eligibletovote",
        "ifelse"
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a project to run! Must be one of " + Week2.projects);
        String selected = scanner.next().toLowerCase();
        if (!Week2.projects.contains(selected)) {
            System.out.println("Not a valid project!");
            Week2.main(new String[0]);
            return;
        }

        try {
            switch (selected) {
                case "variabletypes": {
                    VariableTypes.main();
                    break;
                }
                case "donateblood": {
                    DonateBlood.main(scanner);
                    break;
                }
                case "eligibletovote": {
                    EligibleToVote.main(scanner);
                    break;
                }
                case "ifelse": {
                    IfElse.main(scanner);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("An error occured while running project " + selected + "!\nIf you care, the stacktrace is below...");
            e.printStackTrace();
        }

        return;
    }
}