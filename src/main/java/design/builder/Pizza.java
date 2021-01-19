package design.builder;

import lombok.Data;

@Data
public class Pizza {
    private String pizzType;
    private boolean cheese;
    private boolean extraCheese;

    @Data
    private static class PizzaBuilder{
        private String pizzType;
        private boolean cheese;
        private boolean extraCheese;

        public PizzaBuilder(String pizzType, boolean cheese) {
            this.pizzType = pizzType;
            this.cheese = cheese;
        }
        public PizzaBuilder addExtraCheese(){
            this.extraCheese=true;
            return this;

        }

        public Pizza build(){
            Pizza p = new Pizza();
            p.setCheese(this.isCheese());
            p.setExtraCheese(this.isExtraCheese());
            p.setPizzType(this.getPizzType());
            return p;

        }

        public static void main(String[] args) {
            Pizza p= new PizzaBuilder("veg",true).addExtraCheese().build();
            System.out.println(p);

        }
    }


}
