package com.Louie2074.commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class praise extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        if(event.getMember().getUser().getName().equals("Louie")){
            event.getChannel().sendMessage("You are awesome").queue();
        }
    }

}
