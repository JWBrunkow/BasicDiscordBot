import me.Events.PenaldoListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import javax.security.auth.login.LoginException;

public class DiscordBot extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {

        JDA bot = JDABuilder.createDefault(APIKey.key) // Create this variable and class  in the same directory, and do not add to version control
                .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .setActivity(Activity.playing("in a farmers league"))
                .addEventListeners(new PenaldoListener())
                .build();
    }
}

