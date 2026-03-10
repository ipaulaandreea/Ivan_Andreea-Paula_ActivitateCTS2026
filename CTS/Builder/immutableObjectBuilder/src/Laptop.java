public final class Laptop {
    private final String brand;
    private final String cpu;
    private final int ramGb;
    private final String color;

    private Laptop(Builder b) {
        this.brand = b.brand;
        this.cpu = b.cpu;
        this.ramGb = b.ramGb;
        this.color = b.color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ramGb=" + ramGb +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder {
        private final String brand;
        private final String cpu;
        private int ramGb = 16;
        private String color;

        public Builder(String brand, String cpu){
            this.brand = brand;
            this.cpu = cpu;
        }

        public Builder ramGb(int ramGb){
            this.ramGb = ramGb;
            return this;
        }

        public Builder color(String color){
            this.color = color;
            return this;
        }

        public Laptop build(){
            return new Laptop(this);
        }
    }
}
