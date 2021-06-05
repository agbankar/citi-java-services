package design.laptop;

public class LapTop {

    private int ramSize;
    private String name;
    private boolean isPortable;


    static class LaptopBuilder {
        private int ramSize;
        private String name;
        private boolean isPortable;

        public LaptopBuilder(int ramSize, String name) {
            this.ramSize = 100;
            this.name = name;
        }

        public LaptopBuilder addPortablility() {
            this.isPortable = true;
            return this;
        }

        public LapTop build() {
            LapTop l = new LapTop();
            l.name = this.name;
            l.ramSize = this.ramSize;
            l.isPortable = this.isPortable;
            return l;

        }
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPortable() {
        return isPortable;
    }

    public void setPortable(boolean portable) {
        isPortable = portable;
    }

    public static void main(String[] args) {
        //laptop without portability
        LapTop l = new LaptopBuilder(10, "dell").build();
        System.out.println(l.name);
        //
        l = new LaptopBuilder(100, "HP").addPortablility().build();
        System.out.println(l.isPortable());

    }
}
