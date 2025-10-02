import customException.*;
import direction.*;
import grid.*;
import java.util.*;
import rover.*;

public class Simulator {
    public static int[][] elevationMap = {
        { 5, 5, 5,-1, 5, 5, 5, 5, 5, 5, 5, 5,-1,-1, 5,-1,-1, 5, 5, 5 },
        { 5, 5,-1, 5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5 },
        { 5, 5, 6, 6,-1, 6, 6,-1, 6,-1, 4, 3,-1, 3, 3, 3, 3,-1, 4, 5 },
        { 5, 5, 6, 7, 7, 7, 7, 7, 6, 5, 4,-1, 2, 2, 2, 2, 2, 3, 4,-1 },
        { 5,-1, 6, 7, 8, 8, 8, 7, 6, 5, 4, 3, 2, 1, 1, 1, 2, 3, 4, 5 },
        { 5,-1, 6, 7, 8, 9, 8, 7, 6, 5,-1,-1,-1, 1,-1, 1, 2, 3, 4,-1 },
        { 5, 5, 6, 7, 8,-1, 8, 7, 6, 5, 4, 3, 2, 1, 1,-1, 2, 3, 4, 5 },
        {-1, 5,-1, 7, 7, 7, 7, 7, 6, 5, 4, 3, 2, 2, 2, 2, 2, 3, 4, 5 },
        { 5, 5, 6, 6, 6, 6, 6, 6, 6, 5, 4, 3,-1, 3,-1, 3,-1, 3, 4, 5 },
        { 5, 5, 5,-1, 5, 5, 5, 5, 5, 5, 4, 4, 4, 4,-1, 4, 4, 4, 4, 5 },
        { 5, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5,-1, 5,-1, 5, 5, 5 },
        { 5, 4, 3, 3, 3, 3, 3, 3, 3,-1, 5, 6, 6, 6, 6, 6, 6, 6, 5, 5 },
        { 5, 4, 3, 2, 2, 2, 2, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 6,-1, 5 },
        { 5, 4, 3, 2, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 7, 6, 5,-1 },
        { 5, 4, 3, 2, 1, 0, 1,-1, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 5 },
        { 5,-1,-1, 2, 1, 1, 1, 2,-1,-1, 5, 6, 7, 8, 8, 8, 7, 6, 5, 5 },
        { 5, 4, 3, 2, 2, 2, 2,-1, 3, 4, 5, 6,-1, 7, 7, 7, 7, 6, 5, 5 },
        { 5, 4, 3, 3, 3, 3,-1, 3, 3, 4, 5, 6, 6, 6, 6, 6, 6,-1, 5,-1 },
        { 5, 4, 4, 4, 4, 4,-1, 4, 4, 4, 5, 5, 5,-1, 5, 5, 5,-1, 5,-1 },
        { 5, 5, 5, 5, 5, 5, 5, 5,-1, 5,-1, 5, 5, 5, 5, 5, 5, 5, 5, 5 }
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grid size: ");
        int size = sc.nextInt();

        Grid grid = new Grid(size, elevationMap);

        System.out.print("Enter initial state of rover (x y fuel dir): ");
        int startX = sc.nextInt();
        int startY = sc.nextInt();
        int startFuel = sc.nextInt();
        String dir = sc.next();
        Direction startDir = switch(dir.toUpperCase()) {
            case "N" -> new North();
            case "S" -> new South();
            case "E" -> new East();
            case "W" -> new West();
            default -> new North();
        };

        Rover rover = new Rover(startX, startY, startFuel, startDir);

        System.out.print("Enter command string (M|L|R): ");
        String commands = sc.next();

        try {
            rover.executeCommands(commands.toUpperCase(), grid);
            System.out.println("All commands executed successfully");
        }
        catch (CollisionException | InvalidCommandException | LowFuelException | OutOfBoundsException e) {
            System.out.println("Stopping execution...");
            System.out.println(e.getMessage());
        }
    }
}
