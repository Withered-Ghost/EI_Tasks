import java.util.*;

import direction.Direction;
import direction.North;
import rover.*;

public class Simulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Direction d = new North();
        System.out.println(d.getDir());
        sc.close();
    }
}
