/**
 * Created by Ejer on 09-05-2018.
 */
public class ChatUser {

    private String UserId;

    public ChatUser(String userId) {
        UserId = userId;
        //Vi adder denne bruger til den statiske liste i ChatRoom
        ChatRoom.addChatUser(this);
    }
    //getter
    public String getUserId() {
        return UserId;
    }
    //setter
    public void setUserId(String userId) {
        UserId = userId;
    }
    //Bruger ChatRoom statiske metode til at videre sende beskeden til de andre ChatUsers
    //Beskeden bliver parameter overført samt nøjagtig dette ChatUser objekt ved at bruge keyword this
    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
        ChatRoom.sendMessage(this,message);
    }
    //Printer den modtagende besked
    public void reciveMessage(String message){
        System.out.println(message);
    }
}
