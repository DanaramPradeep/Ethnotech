class Post{
    String data;
    Post prev;
    Post next;
    Post(String data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}

class SocialmediaDemo{
    Post head, tail, current;
    void insertpost(String data){
        Post newpost=new Post(data);
        if(head==null){
            head=newpost;
            tail=newpost;
            current=newpost;
        }
        else{
            tail.next=newpost;
            newpost.prev=tail;
            tail=newpost;
            current=newpost;
        }
    }
    void nextpost(){
        if(current!=null && current.next!=null){
            current=current.next;
            System.out.println("Current post: "+current.data);
        }
        else{
            System.out.println("No next post available.");
        }
    }
    void previouspost(){
         if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Current post: "+current.data);
        } else {
            System.out.println("No previous post.");
        }
    }
    void deletepost(String content){
        Post temp = head;
        while (temp != null) {
            if (temp.data.equals(content)) {
                if (temp == head)
                    head = temp.next;
                if (temp == tail)
                    tail = temp.prev;
                if (temp.prev != null)
                    temp.prev.next = temp.next;
                if (temp.next != null)
                    temp.next.prev = temp.prev;
                System.out.println(content + " deleted.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Post not found.");
    }
    void insertSponsoredPost(String content) {
        insertpost("[SPONSORED] " + content);
    }
    void showcurrentpost() {
        if (current != null)
            System.out.println("Current post: " + current.data);
        else
            System.out.println("No posts in feed.");
    }
}

public class SocialmediapostDLL{
    public static void main(String args[]){
        SocialmediaDemo feed=new SocialmediaDemo();
        feed.insertpost("Hello, Good Morning!!");
        feed.insertpost("MITS");
        feed.insertpost("ethnotech post");
        feed.insertSponsoredPost("Buy Premium Membership");
        feed.showcurrentpost();
        System.out.println("\nScrolling Next:");
        feed.nextpost();
        feed.nextpost();
        System.out.println("\nScrolling Previous:");
        feed.previouspost();
        System.out.println("\nDeleting a Post:");
        feed.deletepost("MITS");
        System.out.println("\nFeed After Deletion:");
        feed.showcurrentpost();
        feed.nextpost();
        feed.nextpost();
    }
}