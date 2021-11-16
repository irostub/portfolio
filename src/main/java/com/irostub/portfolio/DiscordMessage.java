package com.irostub.portfolio;

import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Setter(value = AccessLevel.PRIVATE)
public class DiscordMessage {
    private String username = "hookMessage";
    private List<Embeds> embeds = new ArrayList<>();

    @Data
    static class Embeds {
        private String title = "New Line Posted!";
        private int color = 9633791;
        private List<Fields> fields = new ArrayList<>();

        public Embeds(List<Fields> fields) {
            this.fields = fields;
        }
    }

    @AllArgsConstructor
    @Data
    static class Fields{
        private String name;
        private String value;
    }

    public static DiscordMessage createMessage(String username, String email, String desc){
        List<Fields> fields = new ArrayList<Fields>(
                Arrays.asList(
                        new Fields("username", username),
                        new Fields("email", email),
                        new Fields("description", desc))
        );

        Embeds embeds = new Embeds(fields);
        DiscordMessage message = new DiscordMessage();
        message.embeds.add(embeds);
        return message;
    }
}
