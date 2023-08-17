public class Main {
    public static void main(String[] args) {

        BaseClass obj1 = new BaseClass(1);
        BaseClass obj2 = new BaseClass(2);
        BaseClass obj3 = new BaseClass(2);

        System.out.println("obj1's unique ID: " + obj1.getUniqueId());
        System.out.println("obj2's unique ID: " + obj2.getUniqueId());
        System.out.println("obj3's unique ID: " + obj3.getUniqueId());

        System.out.println("obj1's parent: " + obj1.getParent());
        System.out.println("obj2's parent: " + obj2.getParent());
        System.out.println("obj3's parent: " + obj3.getParent());

        System.out.println("obj1 equals obj2: " + obj1.equals(obj2));
        System.out.println("obj2 equals obj3: " + obj2.equals(obj3));
        System.out.println("obj3 equals obj3: " + obj3.equals(obj3));

        System.out.println("obj1 hash code: " + obj1.hashCode());
        System.out.println("obj2 hash code: " + obj2.hashCode());
        System.out.println("obj3 hash code: " + obj3.hashCode());
    }
}