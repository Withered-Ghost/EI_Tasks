import java.util.*;
import rover.*;
import command.*;
import fuel.*;

public class Simulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rover r = new Rover();
        r.setFuelUsage(new UpslopeUsage());
        ArrayList<Command> cmds = new ArrayList<Command>();
        cmds.add(new TurnRight());
        cmds.add(new Move());
        cmds.add(new Move());
        cmds.add(new TurnRight());
        cmds.add(new Move());
        cmds.add(new TurnLeft());
        cmds.add(new Move());

        for(Command cmd : cmds) {
            cmd.execute(r, 1);
            System.out.println(r.getStats());
        }
        sc.close();
    }
}
