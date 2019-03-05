package geturl;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenBrowser {
	public static void button(String strings) {
		try {
			Desktop desktop = Desktop.getDesktop();
			if (Desktop.isDesktopSupported()
					&& desktop.isSupported(Desktop.Action.BROWSE)) {
				URI uri = new URI(strings);
				desktop.browse(uri);
			}
		} catch (IOException e1) {
			System.out.println(e1);
		} catch (URISyntaxException e) {
			System.out.println(e);
		}
	}
	
		
}
