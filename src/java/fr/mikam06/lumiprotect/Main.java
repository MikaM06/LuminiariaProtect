package fr.mikam06.lumiprotect;

import fr.mikam06.lumiprotect.listener.CommandProcess;
import net.md_5.bungee.api.plugin.Plugin;


public class Main extends Plugin {
    @Override
    public void onEnable() {
        System.out.println("[UnderBlockedCmd] 1.0.0 is starting");
        getProxy().getPluginManager().registerListener(this, new CommandProcess());
    }
    @Override
    public void onDisable() {
        System.out.println("[UnderBlockedCmd] 1.0.0 is shutting down");
    }
}