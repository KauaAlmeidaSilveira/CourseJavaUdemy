package Fundamentals.GenericsSetMap;

public class BasicEqualsHashCode {
    public static void main(String[] args) {

        String a = "Maria";
        String b = "Alex";

        System.out.println(a.equals(b));
        System.out.println(a.equals("Maria"));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }
}
