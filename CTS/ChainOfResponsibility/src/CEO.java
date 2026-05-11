class CEO extends Handler {

    @Override
    public void handleRequest(int amount) {
        if (amount <= 10000) {
            System.out.println("CEO approved: " + amount);
        } else {
            System.out.println("Request rejected");
        }
    }
}