package geturl;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.JLabel;
import javax.swing.JButton;

public class OpenURL_view {

	private JFrame frame;
	private JTextPane textPane;
	private String line = 
			"_______________________________________________________________________";
	private String line_1 = "__________________________________________________";
	private String line_2 = "______________________";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpenURL_view window = new OpenURL_view();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public OpenURL_view() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("人民网区块链资讯");
		frame.getContentPane().setBackground(new Color(238, 238, 238));
		frame.setBounds(100, 100, 1150, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("网址：");
		textPane = new JTextPane();
		

		JLabel label_1 = new JLabel("标题：");
		JTextPane textPane_1 = new JTextPane();

		JLabel label_2 = new JLabel("时间：");
		JTextPane textPane_2 = new JTextPane();
		

		JButton btnGet = new JButton("GET");
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URL url = null;
				try {
					url = 
						new URL("http://blockchain.people"
								+ ".com.cn/GB/421538/421540/index.html");
				} catch (MalformedURLException e1) {
					e1.printStackTrace();
				}
				//截取ul
				String[] str = null;
				try {
					str = OpenURL.get(url).split("clearfix");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				for (int i = 0; i<str.length;i++) {
					System.out.println(str[i]);
				}
				//获取有效的ul字段
				System.out.println("有效ul字段="+str[8]);
				// 网址
				String[] website = str[8].split("'");
				for (int i = 0; i<website.length;i++) {
					if(i%2==1) {
						textPane.setText(textPane.getText()
								+"http://blockchain.people.com.cn"+website[i]
								+"\n"+line+"\n");
					}
				}
				//标题
				String[] left = str[8].split("<li>");
				for(int i=2;i<left.length;i++) {
					textPane_1.setText(textPane_1.getText()
							+left[i].substring(left[i].indexOf("html' >")
									+7, left[i].indexOf("</a>"))
							+"\n"+line_1+"\n");
				}
				//时间
				for(int i=2;i<left.length;i++) {
					textPane_2.setText(textPane_2.getText()
							+left[i].substring(left[i].indexOf("<i>")
									+3, left[i].indexOf("</i>"))
							+"\n"+line_2+"\n");
				}
			}
		});
		
		//获取文本中的网址，分别添加到对应的点击事件中
		JButton button = new JButton("访问");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] web = textPane.getText().split(line);
				OpenBrowser.button(web[0].trim());
			}
		});
		
		JButton button_1 = new JButton("访问");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] web = textPane.getText().split(line);
				OpenBrowser.button(web[1].trim());
			}
		});
		
		JButton button_2 = new JButton("访问");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] web = textPane.getText().split(line);
				OpenBrowser.button(web[2].trim());
			}
		});
		
		JButton button_3 = new JButton("访问");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] web = textPane.getText().split(line);
				OpenBrowser.button(web[3].trim());
			}
		});
		
		JButton button_4 = new JButton("访问");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] web = textPane.getText().split(line);
				OpenBrowser.button(web[4].trim());
			}
		});
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(32)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label)
								.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1)
								.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textPane_2, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(button, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_1)))
								.addComponent(label_2)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(508)
							.addComponent(btnGet)))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(label)
						.addComponent(label_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textPane)
						.addComponent(textPane_1)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addComponent(textPane_2))
					.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
					.addComponent(btnGet)
					.addGap(34))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	
}
