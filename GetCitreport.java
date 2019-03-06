package geturl;

public class GetCitreport {
	
	public static void GetNews() throws Exception {
		// 网址
		String[] str = OpenURL.run_1().split("aid=");
		for (int i = 1; i<str.length;i++) {
			System.out.println("http://www.citreport.com/content/"
		+str[i].substring(0, str[i].indexOf("&amp"))+"-1.html");
		}
		//标题
		String[] str_1 = OpenURL.run_1().split("<h3>");
		for(int i=1;i<str_1.length;i++) {
			System.out.println(str_1[i].substring(0, str_1[i].indexOf("</h3>")));
		}
		//时间
		String[] str_2 = OpenURL.run_1().split("<span class=\"time\">");
		for(int i=1;i<str_2.length;i++) {
			System.out.println(str_2[i].substring(0, str_2[i].indexOf("</span>")));
		}
	}
	
}
