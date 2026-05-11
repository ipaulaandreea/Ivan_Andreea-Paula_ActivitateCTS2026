class Manager extends Handler {

    @Override
    public void handleRequest(int amount) {
        if (amount <= 1000) {
            System.out.println("Manager approved: " + amount);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(amount);
        }
    }
}