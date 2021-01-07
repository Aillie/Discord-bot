package discordbot.Hank;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.channel.category.CategoryCreateEvent;
import net.dv8tion.jda.api.events.channel.category.update.CategoryUpdateNameEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Hank extends ListenerAdapter {
	
	public static void main(String[] args) throws LoginException, InterruptedException
	{
		JDA jda = JDABuilder.createDefault("Nzk1MzE0NTQ4OTE0NzgyMjY5.X_HkZA.KJgpAqHgocRZRdoSFM1JP7ijQbU")
				.addEventListeners(new Hank())
				.addEventListeners(new messageHandler())
				.addEventListeners(new categoryHandler())
				.addEventListeners(new textChannelHandler())
				.addEventListeners(new voiceChannelHandler())
				.build();
	}
	
	@Override
	public void onReady(ReadyEvent event)
	{
		System.out.println("Hank is ready!");
		System.out.println(event.getJDA().getToken());
	}
}
