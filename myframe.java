/*THIS IS AN EXAMPLE OF COMBOBOX
 * 
 */

package combobox;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.lang.model.element.Element;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class myframe extends JFrame implements ActionListener{
    JFrame myframe;
    String[] combochoices;
    JComboBox<String> combobox;
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    myframe(){
	
	int maxlength=0,wdth=100;
	combochoices= new String[] {"Tesla", "Jaguar","Mercidese","BMW"};
	myframe=new JFrame();
	
	myframe.setLayout(new FlowLayout());
	myframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
	combobox=new JComboBox<String>(combochoices);
	combobox.addActionListener(this);
	combobox.addItem("Tata");
	combobox.insertItemAt("Maruti", 0);
	combobox.addItem("Maximum length to try width of combobox");
	ComboBoxModel<String> tempary = combobox.getModel();
	
	System.out.println("Item at position 0->"+combobox.getItemAt(0));
	System.out.println("Total items -->"+combobox.getItemCount());
	System.out.println("Maximum rows without scroll bar"+combobox.getMaximumRowCount());
	// how many maximum rows can be displayed without scroll bar
	
	combobox.setFont(new Font ("Serg UI", Font.PLAIN,24));
	combobox.setSelectedIndex(0); // this will set default display to the item which you want
	
	myframe.add(combobox);
	myframe.pack(); // this is must because after adding the combobox it will resize the frame to size accordingly.
	myframe.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	if(e.getSource()==combobox) {
	    System.out.print("Current Selected Item ->");
	    System.out.println(combobox.getSelectedItem());
	}
  }
}
