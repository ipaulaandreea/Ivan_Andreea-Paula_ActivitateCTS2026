void main() {
Laptop l1 = new Laptop.Builder("Dell", "i5").ramGb(32).build();
    System.out.println(l1.toString());
    Laptop l2 = new Laptop.Builder("Asus", "i7").color("blue").build();
    System.out.println(l2.toString());
}
