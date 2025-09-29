package fuel;

public class DownslopeUsage implements FuelUsage {
    @Override
    public int calcFuelUsage(int elevationDiff) {
        return -1 * Math.abs(elevationDiff);
    }
}
