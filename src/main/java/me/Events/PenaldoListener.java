package me.Events;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import java.util.ArrayList;
import java.util.List;


public class PenaldoListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        // keys are to be phrases used frequently and their responses. Later methods can add to this
        ArrayList<String> penaldoPhrases = new ArrayList<>();
        penaldoPhrases.add("penaldo");
        penaldoPhrases.add("tap-in");
        penaldoPhrases.add("tap in");
        penaldoPhrases.add("book of facts");
        penaldoPhrases.add("farmers league");
        penaldoPhrases.add("farmer's league");
        penaldoPhrases.add("in my book");

        String response = "SIUUUUUUU";

        if (!event.getAuthor().isBot()) {
            String messageSent = event.getMessage()
                                      .getContentRaw()
                                      .toLowerCase();

            for (String listItem : penaldoPhrases){
                if(messageSent.contains(listItem)){
                    Member member = event.getMember();
                    assert member != null;
                    List<Role> roleList = member.getRoles();
                    event.getChannel()
                         .sendMessage(response)
                         .queue();

                   //if(roleList.isEmpty()){

                }
            }
        }
    }
}
