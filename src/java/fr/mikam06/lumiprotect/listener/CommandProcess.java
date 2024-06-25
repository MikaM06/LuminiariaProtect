package fr.mikam06.lumiprotect.listener;

import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class CommandProcess implements Listener  {
    @EventHandler
    public void onChat(ChatEvent event) {
        ProxiedPlayer player = (ProxiedPlayer) event.getSender();
        String serverName = player.getServer().getInfo().getName();

        if (serverName.equals("Auth")) {
            if (event.getMessage().toLowerCase().contains("/server") || event.getMessage().toLowerCase().contains("/hub") || event.getMessage().toLowerCase().contains("/lobby") || event.getMessage().toLowerCase().contains("/send")){
                event.setCancelled(true);
                TextComponent message = new TextComponent("§cVous ne pouvez pas utiliser cette commande sur ce serveur.");
                player.sendMessage(message);
            }
        }
    }
}