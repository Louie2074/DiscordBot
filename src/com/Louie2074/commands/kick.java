package com.Louie2074.commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

public class kick extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if(args[0].equalsIgnoreCase("please")&&args[1].equalsIgnoreCase("kick")&&args[2].equalsIgnoreCase("me")){
            String target = event.getMember().getUser().getId();

            event.getGuild().kick(target).queue();
            event.getChannel().sendMessage("The lord and savior has smited this treacherous act with a kick").queue();




        }

    }
}
