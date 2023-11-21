package JPA.application;

import JPA.model.entities.Pessoa;

public class Program {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1, "Kauã", "Kauã@gmail.com");
        Pessoa p2 = new Pessoa(1, "Nary", "Nary@gmail.com");
        Pessoa p3 = new Pessoa(1, "Gleice", "kaua@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
