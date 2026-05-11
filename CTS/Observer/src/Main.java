public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer email = new EmailSubscriber();
        Observer sms = new SmsSubscriber();

        agency.addObserver(email);
        agency.addObserver(sms);

        agency.publishNews("Exam starts at 10:00");

        agency.removeObserver(sms);

        agency.publishNews("Room changed to 201");
    }
}