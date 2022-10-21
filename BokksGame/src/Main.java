

public class Main {
    public static void main(String[] args) {
        double oran1 = Math.random()*100;
        double oran2 = Math.random()*100;

        Fighter f1 = new Fighter("myke tyson",12,124,98,50, (int) oran1);
        Fighter f2 = new Fighter("bruce lee",9,117,86,50,(int) oran2);

        Match us = new Match(f1,f2,84,100);
        us.run();





    }
}