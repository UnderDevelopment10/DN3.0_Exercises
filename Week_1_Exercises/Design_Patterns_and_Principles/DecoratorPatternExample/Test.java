public class Test {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        
        emailNotifier.send("Hello via Email!");

        Notifier emailAndSMSNotifier = new SMSNotifierDecorator(emailNotifier);
        emailAndSMSNotifier.send("Hello via Email and SMS!");

        Notifier emailSMSAndSlackNotifier = new SlackNotifierDecorator(emailAndSMSNotifier);
        emailSMSAndSlackNotifier.send("Hello via email, SMS, and Slack!");
    }
}