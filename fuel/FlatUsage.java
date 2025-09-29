package fuel;

public class FlatUsage implements FuelUsage {
    @Override
    public int calcFuelUsage(int elevationDiff) {
        return 1;
    }
}
