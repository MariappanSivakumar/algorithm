/*
Input : n=4

Output:
------------
 .  Q  .  . 
 .  .  .  Q 
 Q  .  .  . 
 .  .  Q  . 
------------
 .  .  Q  . 
 Q  .  .  . 
 .  .  .  Q 
 .  Q  .  . 
------------
*/

package mathameticalfunction;

public class NQueen {

    public boolean isValidPosition(char chessboard[][], int i, int j) {

        for (int k = 0; k <= i; k++) {
            if (i - k >= 0 && j - k >= 0 && chessboard[i - k][j - k] == 'Q' || chessboard[i - k][j] == 'Q') {
                return false;
            }
            if (i - k >= 0 && j + k < chessboard[i].length && chessboard[i - k][j + k] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public void disp(char chessboard[][]) {
        for (int i = 0; i < chessboard.length; i++) {
            System.out.print("---");
        }
        System.out.println();
        for (char[] chessboard1 : chessboard) {
            String str = "";
            for (int j = 0; j < chessboard.length; j++) {
                if (chessboard1[j] == 'Q') {
                    str += " Q ";
                } else {
                    str += " . ";
                }
            }
            System.out.println(str);
        }
    }


    public void possible(char chessboard[][], int i, int j, int count) {

        if (i < 0 || j < 0 || i >= chessboard.length || j >= chessboard[i].length) {
            if (count == chessboard.length - 1) {
                disp(chessboard);
            }
            return;
        }

        if (isValidPosition(chessboard, i, j)) {
            chessboard[i][j] = 'Q';
            possible(chessboard, i + 1, 0, count + 1);
            chessboard[i][j] = ' ';
        }
        possible(chessboard, i, j + 1, count);
    }

    public void init() {

        int N = 4;
        char chessboard[][] = new char[N][N];

        for (int i = 0; i < N; i++) {
            chessboard[0][i] = 'Q';
            possible(chessboard, 1, 0, 0);
            chessboard[0][i] = ' ';
        }
        for(int i=0;i<chessboard.length;i++){
            System.out.print("---");
        }
        System.out.println("\n\n\n");
    }

    public static void main(String ar[]) {
        new NQueen().init();
    }
}
