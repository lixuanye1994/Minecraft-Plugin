package codetest;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Testplugin �̳�  Bukkit ��������
 * @author lee
 */

public class Testplugin extends JavaPlugin {
	private final EventHandle playerLandJ = new EventHandle(this);
	 @Override  //��д��Ϸ�еĻ���
	    public void onEnable() {
			 //�������ɹ���ʾ��
			 getLogger().info("����ɹ�!");
			 
			 //ע������¼�
			 PluginManager GM = getServer().getPluginManager();
			 GM.registerEvents(playerLandJ, this);
			 //getServer().getPluginManager().registerEvents(new EventHandle(), this);
		 
	    }
	    
	    @Override
	    public void onDisable() {
	        // ���ж��ʱҪִ�еĴ��� δʵ��
	    }
	
}