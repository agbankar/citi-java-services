package design.builder;


public class Pizza {
    private String pizzType;
    private boolean cheese;
    private boolean extraCheese;

    public static class PizzaBuilder{
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

        public String getPizzType() {
            return pizzType;
        }

        public void setPizzType(String pizzType) {
            this.pizzType = pizzType;
        }

        public boolean isCheese() {
            return cheese;
        }

        public void setCheese(boolean cheese) {
            this.cheese = cheese;
        }

        public boolean isExtraCheese() {
            return extraCheese;
        }

        public void setExtraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
        }

        public Pizza build(){
            Pizza p = new Pizza();
            p.setCheese(this.isCheese());
            p.setExtraCheese(this.isExtraCheese());
            p.setPizzType(this.getPizzType());
            return p;

        }


    }

    public String getPizzType() {
        return pizzType;
    }

    public void setPizzType(String pizzType) {
        this.pizzType = pizzType;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public static void main(String[] args) {
        Pizza p= new PizzaBuilder("veg",true).addExtraCheese().build();
        System.out.println(p);

    }
}
