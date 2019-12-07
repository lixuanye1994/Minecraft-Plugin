package codetest;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Testplugin 继承  Bukkit 开发测试
 * @author lee
 */

public class Testplugin extends JavaPlugin {
	private final EventHandle playerLandJ = new EventHandle(this);
	 @Override  //重写游戏中的机制
	    public void onEnable() {
			 //插件载入成功提示语
			 getLogger().info("载入成功!");
			 
			 //注册监听事件
			 PluginManager GM = getServer().getPluginManager();
			 GM.registerEvents(playerLandJ, this);
			 //getServer().getPluginManager().registerEvents(new EventHandle(), this);
		 
	    }
	    
	    @Override
	    public void onDisable() {
	        // 插件卸载时要执行的代码 未实现
	    }
	
}