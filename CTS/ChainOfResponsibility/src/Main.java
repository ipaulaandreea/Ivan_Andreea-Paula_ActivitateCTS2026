public class Main {
    public static void main(String[] args) {

        Handler manager = new Manager();
        Handler director = new Director();
        Handler ceo = new CEO();

        manager.setNextHandler(director);
        director.setNextHandler(ceo);

        manager.handleRequest(500);
        manager.handleRequest(3000);
        manager.handleRequest(8000);
        manager.handleRequest(15000);
    }
}