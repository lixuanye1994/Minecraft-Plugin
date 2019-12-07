package codetest;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * EventHandle 接口为  Listener 用于监听服务器玩家情况
 * @author lee
 */

public class EventHandle implements Listener {
	
	//将主程序Testplugin.java设置成插件，实例化
	 private final Testplugin plugin;
	 public EventHandle(Testplugin instance) {
	        plugin = instance;
	    }

	@EventHandler
	public void onJoin(PlayerJoinEvent  event) {
	    // 监听玩家加入游戏后服务端执行操作
		
		//游戏界面
		event.setJoinMessage(event.getPlayer().getName()+"进入游戏了，快跑吧！");
		//后台日志
		plugin.getLogger().info(event.getPlayer().getName() + " 进入游戏了，快跑吧 :D");
	}
}
