class Director extends Handler {

    @Override
    public void handleRequest(int amount) {
        if (amount <= 5000) {
            System.out.println("Director approved: " + amount);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(amount);
        }
    }
}