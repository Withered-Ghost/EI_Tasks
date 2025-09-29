package fuel;

public class UpslopeUsage implements FuelUsage {
    @Override
    public int calcFuelUsage(int elevationDiff) {
        return 2 * elevationDiff;
    }
}
