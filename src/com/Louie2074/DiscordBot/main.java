package com.Louie2074.DiscordBot;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;


import javax.security.auth.login.LoginException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class main {
    public static JDA jda;
    public static String prefix = "-";





    public static void main(String[] args) throws LoginException, IOException, SAXException, ParserConfigurationException {
        token token = new token();
        jda = new JDABuilder(AccountType.BOT).setToken(token.getToken()).build();
        //jda.getPresence().setStatus(OnlineStatus.IDLE);
        jda.getPresence().setActivity(Activity.playing("MLG Fortnite"));
        jda.addEventListener(new commands());

    }
    }

