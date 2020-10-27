package ru.vsu.cs.ostroverkhov;

enum Points {
    TEAM_N_WIN(3, 0),
    DRAW(1, 1),
    TEAM_M_WIN(0, 3);

    int teamNPoints;
    int teamMPoints;

    Points(int teamNPoints, int teamMPoints) {
        this.teamNPoints = teamNPoints;
        this.teamMPoints = teamMPoints;
    }
}