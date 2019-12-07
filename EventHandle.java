package codetest;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * EventHandle �ӿ�Ϊ  Listener ���ڼ���������������
 * @author lee
 */

public class EventHandle implements Listener {
	
	//��������Testplugin.java���óɲ����ʵ����
	 private final Testplugin plugin;
	 public EventHandle(Testplugin instance) {
	        plugin = instance;
	    }

	@EventHandler
	public void onJoin(PlayerJoinEvent  event) {
	    // ������Ҽ�����Ϸ������ִ�в���
		
		//��Ϸ����
		event.setJoinMessage(event.getPlayer().getName()+"������Ϸ�ˣ����ܰɣ�");
		//��̨��־
		plugin.getLogger().info(event.getPlayer().getName() + " ������Ϸ�ˣ����ܰ� :D");
	}
}
