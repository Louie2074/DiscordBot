package com.Louie2074.DiscordBot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class commands extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){

      /*  if(event.getMember().getUser().getName().equals("Louie")){
            event.getChannel().sendMessage("titties").queue();
        } */

        //String[] args = event.getMessage().getContentRaw().split(" ");
    if(event.getMessage().getContentRaw().equalsIgnoreCase("hello nasby")){
        EmbedBuilder info = new EmbedBuilder();
        info.setTitle("Samuelson Nasbany");
        info.setImage("https://louie2074.github.io/mercantilism/pictures/IMG_1965.JPG");
        info.setDescription("Even though I am no longer here, my spirit lives on through the boys, and this discord bot");
        info.addField("Creator","God", false);
        info.setFooter("Copyright 2020", event.getMember().getUser().getAvatarUrl());
        event.getChannel().sendTyping().queue();

        event.getChannel().sendMessage(info.build()).queue();
        info.clear();
    }

    }
}
