import java.util.*;

public class Directory implements FSComponent {
    private String name;
    private List<FSComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FSComponent component) {
        children.add(component);
    }

    public void remove(FSComponent component) {
        children.remove(component);
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Directory: " + name);
        for (FSComponent child : children) {
            child.showDetails(indent + "   ");
        }
    }
}
