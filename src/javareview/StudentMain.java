package javareview;

public class StudentMain {
    // psvm : shortcut
    public static void main(String[] args) {
        Student Kwan = new Student(1,"Kwan");
        Student Kate = new Student(2,"Kate");
       // System.out.println(Kwan.getId() + " : "+ Kwan.getName());
        System.out.println(Kwan.toString());
        System.out.println(Kate.toString());
        // System.out.println(Kate.getId() + " : "+ Kate.getName());
        Kwan.setMidtermScore(10);
        Kwan.setFinalScroe(8);
        System.out.println("Kwan 's total = " + Kwan.getTotalScore());


//        int x = 5;
//        Student Kwan = new Student();
//        Kwan.id = 1;
//        Kwan.name = "Kwan";
//        Student Kate = new Student();
//        Kate.id = 2;
//        Kate.name = "Kate";
//        System.out.println(Kwan.id + " : "+ Kwan.name);
//        System.out.println(Kate.id + " : "+ Kate.name);
//        Kwan.midtermScore = 10;
//        Kwan.finalScroe = 8;
//        System.out.println("Kwan 's total = " + Kwan.getTotalScore());
//        Student s = Kwan;
//        s.id = 100;
//        System.out.println(Kwan.id + " : "+ Kwan.name);
//        s = Kate;
//        Student ploy;
    }
}
