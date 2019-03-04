package geturl;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
 
public class OpenURL {
	/**
	 * 获取网页上的源码
	 * 
	 * @throws IOException
	 */
	public static String get(URL url) throws IOException {
		String times = null;
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setConnectTimeout(5 * 1000);
		InputStream read = conn.getInputStream();
		byte[] infor = new byte[1024];
		int len = 0;
		while ((len = read.read(infor)) != -1) {
			// 指定网页的编码格式，防止乱码
			times += new String(infor, 0, len, "gbk");
		}
		read.close();
		return times;
	}
}
