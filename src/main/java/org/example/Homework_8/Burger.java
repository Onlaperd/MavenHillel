package Homework_8;

public class Burger {
    String bun;
    String meat;
    String meat2;
    String cheese;
    String salad;
    String mayonnaise;



    public Burger(String bun, String meat, String cheese, String salad, String mayonnaise){
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;

        System.out.println("склад звичайного бургера: " + bun + ", " + meat + ", " + cheese + ", " + salad + ", "
                + mayonnaise);
    }
    public Burger(String bun, String meat, String cheese, String salad){
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;

        System.out.println("склад дієтичного бургера: " + bun + ", " + meat + ", " + cheese + ", " + salad);
    }

    public Burger(String bun, String meat, String meat2, String cheese, String salad, String mayonnaise){
        this.bun = bun;
        this.meat = meat;
        this.meat2 = meat2;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;

        System.out.println("склад бургера з подвійним мясом: " + bun + ", " + meat + ", " + meat2 + ", " + cheese + ", "
                + salad + ", " + mayonnaise);
    }

}
