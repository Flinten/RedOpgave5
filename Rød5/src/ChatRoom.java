import java.util.ArrayList;

/**
 * Created by Ejer on 09-05-2018.
 */
public class ChatRoom {

    private static ArrayList<ChatUser> list = new ArrayList<>();

    //De 3 metoder forneden bruger mediator pattern
    //Denne class bruger mediator pattern.
    //Hver enkelte ChatUser bruger denne class til at snakke sammen
    public static void showMessage(ChatUser chatUser, String message){
        System.out.println("You wrote: "+": "+message);
    }
    //Vi adder ChatUsers til den statiske liste
    public static void addChatUser(ChatUser chatUser){
        list.add(chatUser);
    }
    //Her sender vi beskeder til alle ChatUsers ved at iterorer igennem Arraylisten
    //Vi bruger if statement så Chetuseren som sender beskeden ikke selv modtager beskeden
    public static void sendMessage(ChatUser user, String message){
        for (ChatUser chatUser: list) {
            if(chatUser != user) {
                chatUser.reciveMessage(user.getUserId() + " wrote: " + message);
            }
        }
    }
}
