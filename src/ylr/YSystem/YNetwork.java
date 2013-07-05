package ylr.YSystem;

import android.app.Activity;
import android.net.ConnectivityManager;

/**
 * 网络相关操作包封装。
 * 另外需要权限
 * <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
 * @author 董帅 创建时间：2013年4月16日 13时03分57秒
 *
 */
public class YNetwork 
{
	public YNetwork() 
	{
		
	}
	
	/**
	 * 检查设备是否连接了无线网络。
	 * @param a 使用的Activity。
	 * @return 链接返回true，否则返回false。
	 */
	public static boolean isConnectToWifi(Activity a)
	{
		ConnectivityManager con = (ConnectivityManager)a.getSystemService(Activity.CONNECTIVITY_SERVICE);
		return con.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnectedOrConnecting();
	}
	
	/**
	 * 检查设备是否连接到了3G网络。
	 * @param a
	 * @return
	 */
	public static boolean isConnectToMobile(Activity a)
	{
		ConnectivityManager con = (ConnectivityManager)a.getSystemService(Activity.CONNECTIVITY_SERVICE);
		return con.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).isConnectedOrConnecting();
	}
}
