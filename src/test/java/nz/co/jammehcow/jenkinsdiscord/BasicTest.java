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
            wh.send();
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void pipelineDoesntThrow() {
        try {
            DiscordPipelineStep step = new DiscordPipelineStep("http://exampl.e");
            step.setTitle("Test title");
            DiscordPipelineStep.DiscordPipelineStepExecution execution =
                    new DiscordPipelineStep.DiscordPipelineStepExecution();
            execution.step = step;
            execution.listener = () -> System.out;
            execution.run();
        } catch (Exception e) {
            fail();
        }
    }
}
