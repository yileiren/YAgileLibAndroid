package ylr.YSystem;

import android.content.ContentResolver;
import android.provider.Settings.Secure;

/**
 * 硬件相关操作类。
 * @author 董帅 2013年3月24日 21时29分37秒
 *
 */
public class YHardware
{
	/**
	 * 获取android设备ID。
	 * @param resolver 使用的contentprovider实例。
	 * @return 设备ID。
	 */
	public static String getAndroidID(ContentResolver resolver)
	{
		return Secure.getString(resolver, Secure.ANDROID_ID);
	}
}
