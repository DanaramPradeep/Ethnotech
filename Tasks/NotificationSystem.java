interface Notifications{
    void notify(String message);
}

class InstaNotification implements Notifications{
    public void notify(String message){
        System.out.println("Sending Insta Notification: "+message);
    }
}

class WhatsappNotification implements Notifications{
    public void notify(String message){
        System.out.println("Sending Whatsapp Notification: "+message);
    }
}

public class NotificationSystem{
    public static void main(String args[]){
        InstaNotification insta = new InstaNotification();
        WhatsappNotification wt = new WhatsappNotification();
        insta.notify("Hello how are you!!");
        wt.notify("Let's play FreeFire");
    }
}