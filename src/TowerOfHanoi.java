import java.util.Scanner;

public class TowerOfHanoi {
    private static int movementCounter;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv inn antall disker: ");
        int n = input.nextInt();

        System.out.println("Bevegelser gjort er: ");
        moveDisks(n, 'A', 'B', 'C');
        System.out.println("Antall bevegelser: " + movementCounter);
    }

    public static void moveDisks(int n, char fromTower, char toTower, char auxTower){
        if (n == 1){
            System.out.println("Flytter disk " + n + " fra " + fromTower + " til " + toTower);

        } else {
            moveDisks(n-1, fromTower, toTower, auxTower);
            System.out.println("Flytter disk " + n + " fra " + fromTower + " til " + toTower);
            moveDisks(n-1, auxTower, toTower, fromTower);
        }
        movementCounter++;
    }
}
