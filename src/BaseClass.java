import java.util.Objects;
public class BaseClass {

    private static int nextUniqueId = 1; // static: associated with the class itself
    private final int uniqueId; // final: cannot be changed once it is assigned.
    private final int parent;

    public BaseClass(int parent) {
        this.uniqueId = nextUniqueId++;
        this.parent = parent;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public int getParent() {
        return parent;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BaseClass baseClass = (BaseClass) obj;
        return parent == baseClass.parent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueId);
    }

}
