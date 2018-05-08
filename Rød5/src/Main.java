public class Main {

    public static void main(String[] args2) {
        // Disse ChatUser objekter kunne lige så godt være Chat bruger som opretter forbindelse med TCP
        ChatUser chatUser1 = new ChatUser("Casper");
        ChatUser chatUser2 = new ChatUser("Trine");
        ChatUser chatUser3 = new ChatUser("Jonas");
        ChatUser chatUser4 = new ChatUser("Anton");

        //Sender besked
        chatUser1.sendMessage("Hej Allesammen!!");

    }
}
