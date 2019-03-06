package geturl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenURL {
	public static void main(String[] args) throws Exception {
		System.out.println(run_1());
	}

    public static String run() throws Exception {
    	StringBuffer sbu = new StringBuffer(); 
        URL url = new URL("http://blockchain.people"
				+ ".com.cn/GB/421538/421540/index.html");// 根据链接（字符串格式），生成一个URL对象

        HttpURLConnection urlConnection = (HttpURLConnection) url
                .openConnection();// 打开URL

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                urlConnection.getInputStream(), "gb2312"));// 得到输入流，即获得了网页的内容
        String line; // 读取输入流的数据，并显示
        while ((line = reader.readLine()) != null) {
        	sbu.append(line);  
            sbu.append("\n");
        }
        reader.close();
		return sbu.toString();
    }
    
    public static String run_1() throws Exception {
    	StringBuffer sbu = new StringBuffer(); 
        URL url = new URL("http://www.citreport.com/blockchain/blcnews/");

        HttpURLConnection urlConnection = (HttpURLConnection) url
                .openConnection();// 打开URL

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                urlConnection.getInputStream(), "utf-8"));// 得到输入流，即获得了网页的内容
        String line; // 读取输入流的数据，并显示
        while ((line = reader.readLine()) != null) {
        	sbu.append(line);  
            sbu.append("\n");
        }
        reader.close();
		return sbu.toString();
    }
}