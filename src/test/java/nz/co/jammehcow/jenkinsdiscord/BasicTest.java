package nz.co.jammehcow.jenkinsdiscord;

import org.junit.Test;

import static org.junit.Assert.fail;

public class BasicTest {
    @Test
    public void webhookClassDoesntThrow() {
        try {
            DiscordWebhook wh = new DiscordWebhook("http://exampl.e");
            wh.setContent("content");
            wh.setDescription("desc");
            wh.setStatus(DiscordWebhook.StatusColor.GREEN);
        } catch (Exception e) {
            fail();
        }
    }
}
