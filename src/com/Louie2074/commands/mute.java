package com.Louie2074.commands;
import java.util.Random;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class mute extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        int num = (int) (Math.random() * 4);
        String user = event.getMember().getUser().getName();
        if(event.getMember().getUser().getName().equals("Louie")) {
            event.getChannel().sendMessage("You are amazing Louis").queue();
        }
        else if(!event.getMember().getUser().getName().equals("Samuel Nasby")){
            if(num==1){
                event.getChannel().sendMessage("Shut up "+user).queue();
            }
            if(num==0){
                event.getChannel().sendMessage("I dont recall giving you permission to speak "+user).queue();
            }
            if(num==2){
                event.getChannel().sendMessage("No one cares "+user).queue();

            }
            if(num==3){
                event.getChannel().sendMessage("I didnt ask for your opinion "+user).queue();
            }

        }
    }
}
