package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        int dl = board.length;
        int su = 0;

        for (int i = 0; i < dl; i++) {
            su = 0;
            for (int j = 0; j < dl; j++) {
                su = su + board[i][j];
            }
            if (su == dl) {
                return true;
            }
        }

        for (int i = 0; i < dl; i++) {
            su = 0;
            for (int j = 0; j < dl; j++) {
                su = su + board[j][i];
            }
            if (su == dl) {
                return true;
            }
        }

        return false;
    }
}
