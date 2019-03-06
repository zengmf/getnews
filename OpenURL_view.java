package geturl;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private String line_1 = 
			"________________________________________________________________";
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
		frame.setTitle("区块链资讯");
		frame.getContentPane().setBackground(new Color(238, 238, 238));
		frame.setBounds(100, 100, 1300, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("网址：");
		textPane = new JTextPane();
		

		JLabel label_1 = new JLabel("标题：");
		JTextPane textPane_1 = new JTextPane();
		JTextPane textPane_2 = new JTextPane();
		

		JButton btnGet = new JButton("GET");
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 人民网区块链资讯
				 */
				//截取ul
				String[] str = null;
				try {
					str = OpenURL.run().split("clearfix");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
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
				
				/*
				 * 科技快报网
				 */
				// 网址
				String[] str_0 = null;
				try {
					str_0 = OpenURL.run_1().split("aid=");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				for (int i = 1; i<str_0.length;i++) {
					textPane.setText(textPane.getText()
							+"http://www.citreport.com/content/"
							+str_0[i].substring(0, str_0[i].indexOf("&amp"))
							+"-1.html"+"\n"+line+"\n");
				}
				//标题
				String[] str_1 = null;
				try {
					str_1 = OpenURL.run_1().split("<h3>");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				for(int i=1;i<str_1.length;i++) {
					textPane_1.setText(textPane_1.getText()
							+str_1[i].substring(0, str_1[i].indexOf("</h3>"))
							+"\n"+line_1+"\n");
				}
				//时间
				String[] str_2 = null;
				try {
					str_2 = OpenURL.run_1().split("<span class=\"time\">");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				for(int i=1;i<str_2.length;i++) {
					textPane_2.setText(textPane_2.getText()+
							str_2[i].substring(0, str_2[i].indexOf("</span>"))
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
		
		JButton button_5 = new JButton("访问");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] web = textPane.getText().split(line);
				OpenBrowser.button(web[5].trim());
			}
		});
		
		JButton button_6 = new JButton("访问");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] web = textPane.getText().split(line);
				OpenBrowser.button(web[6].trim());
			}
		});
		
		JButton button_7 = new JButton("访问");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] web = textPane.getText().split(line);
				OpenBrowser.button(web[7].trim());
			}
		});
		
		JButton button_8 = new JButton("访问");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] web = textPane.getText().split(line);
				OpenBrowser.button(web[8].trim());
			}
		});
		
		JButton button_9 = new JButton("访问");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] web = textPane.getText().split(line);
				OpenBrowser.button(web[9].trim());
			}
		});
		
		JButton button_10 = new JButton("访问");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] web = textPane.getText().split(line);
				OpenBrowser.button(web[10].trim());
			}
		});
		
		JButton button_11 = new JButton("访问");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] web = textPane.getText().split(line);
				OpenBrowser.button(web[11].trim());
			}
		});
		
		JButton button_12 = new JButton("访问");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] web = textPane.getText().split(line);
				OpenBrowser.button(web[12].trim());
			}
		});
		
		JButton button_13 = new JButton("访问");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] web = textPane.getText().split(line);
				OpenBrowser.button(web[13].trim());
			}
		});
		
		JButton button_14 = new JButton("访问");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] web = textPane.getText().split(line);
				OpenBrowser.button(web[14].trim());
			}
		});
		
		JLabel label_3 = new JLabel("人民网资讯：");
		
		JLabel label_4 = new JLabel("科技网资讯：");
		
		JLabel lblNewLabel = new JLabel("文章发布时间：");
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_3)
						.addComponent(label_4))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1)
								.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 444, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textPane_2, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_1)
										.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblNewLabel))
							.addContainerGap(16, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(80)
							.addComponent(btnGet))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(label_1)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_3)
							.addGap(147)
							.addComponent(label_4)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textPane_1, GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(8)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(14)
									.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
								.addComponent(textPane_2, GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
								.addComponent(textPane))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnGet)
							.addGap(20))))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
