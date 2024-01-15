public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        var firstBoxerMass = 78.2;
        var secondBoxerMass = 82.7;
        System.out.println(firstBoxerMass + secondBoxerMass);
        System.out.println(secondBoxerMass - firstBoxerMass);
        System.out.println(secondBoxerMass - firstBoxerMass);
        System.out.println(secondBoxerMass % firstBoxerMass);

        var timeWork = 640;
        var timeWorkPeople = 8;
        var people = timeWork / timeWorkPeople;
        System.out.println("всего работников компании - " + people + " человек");
        System.out.println("Если в компании работает "+ (people + 94) + " человек, то всего " +(timeWorkPeople*(people+94))+ " часов работы может быть поделено между сотрудниками");


    }
}