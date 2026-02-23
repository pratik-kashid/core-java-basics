package Loops.JumpStatements;

public class ContinueStatement {
    static void main() {

        for(int i = 0; i <= 5; i++) {

            if(i == 3) {
                continue;
            }

            System.out.print(i+" ");
        }
    }
}
