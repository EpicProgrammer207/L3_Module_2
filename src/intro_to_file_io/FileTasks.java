package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FileTasks implements ActionListener{
JFrame frame;
JPanel panel;
JButton addTask;
JButton removeTask;
JButton save;
JButton load;
ArrayList<String> list = new ArrayList<>();
	public static void main(String[] args) {
	FileTasks fileTask = new FileTasks();
	fileTask.start();
}
void start() {
	frame = new JFrame();
	panel = new JPanel();
	addTask = new JButton("Add Task");
	removeTask = new JButton("Remove Task");
	save = new JButton("Save");
	load = new JButton("Load");
	addTask.addActionListener(this);
	removeTask.addActionListener(this);
	save.addActionListener(this);
	load.addActionListener(this);
	panel.add(addTask);
	panel.add(removeTask);
	panel.add(save);
	panel.add(load);
	frame.add(panel);
	frame.pack();
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {

JButton buttonPressed = (JButton) e.getSource();
if(buttonPressed == addTask) {
	String task = JOptionPane.showInputDialog("Gimee a Task");
	list.add(task);
	
}
else if(buttonPressed == removeTask) {
	String numtoString= JOptionPane.showInputDialog("Which number task would you like to remove?");
	int arraylistnum = Integer.parseInt(numtoString);
    int actualarraylistnum = arraylistnum-=1;
    list.remove(actualarraylistnum);
    
}
else if(buttonPressed == save) {
	try {
		FileWriter fw = new FileWriter("src/intro_to_file_io/taskList.txt");
	for(String s: list) {
		fw.write("\n" + s);
	}
	fw.close();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
else if(buttonPressed == load) {
	String yed="";
	
	list.clear();
	try {
	BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/taskList.txt"));
	
		String line = br.readLine();
	while(line!=null) {
		list.add(line);
		line = br.readLine();
	}
} catch (FileNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
	for(String s: list) {
		yed= yed + s;
		JOptionPane.showMessageDialog(null, "\n"+yed);
	}
	
}
}}
