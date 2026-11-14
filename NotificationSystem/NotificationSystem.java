package NotificationSystem;

public class NotificationSystem {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        email.send("Hello!");
        sms.send("Hello!");
    }
}