package thirdVersion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import secondVersion.Item;

public class testMain {

	double a, b, c;
	
	public static void main(String[] args) {
		
		// the first window to get how many kinds of items
		JFrame frame0 = new JFrame("Number of items in order");
		frame0.setSize(400, 600);
		
		JPanel panel0 = new JPanel();
		panel0.setLayout(null);
		frame0.add(panel0);
		
		JLabel numItem = new JLabel("Number of items in order:");
		numItem.setBounds(120, 200, 150, 20);
		panel0.add(numItem);
		
		JTextField num = new JTextField();
		num.setBounds(120, 250, 150, 20);
		panel0.add(num);
		
		JButton next0 = new JButton("next");
		next0.setBounds(160, 300, 60, 20);
		next0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame0.dispose();
				
				// to give each item there attributes
				String[] itemName = new String[Integer.parseInt(num.getText())];
				String[] itemShape = new String[Integer.parseInt(num.getText())];
				List<double[]> dimensions = new ArrayList<double[]>(Integer.parseInt(num.getText()));
				double[] itemWeight = new double[Integer.parseInt(num.getText())];
				int[] itemQuantity = new int[Integer.parseInt(num.getText())];
				for (int i = 0; i < Integer.parseInt(num.getText()); i++) {
					
					//new frame
					JFrame frame = new JFrame("Items' information" + (i + 1));
					frame.setSize(400, 600);
					
					// new panel
					JPanel panel = new JPanel();
					panel.setLayout(null);
					frame.add(panel);
					
					// to get name
					JLabel getName = new JLabel("Name:");
					getName.setBounds(40, 40, 80, 20);
					panel.add(getName);
					JTextField name = new JTextField();
					name.setBounds(120, 40, 80, 20);
					panel.add(name);
					
					// to get weight
					JLabel getWeight = new JLabel("Weight:");
					getWeight.setBounds(40, 70, 80, 20);
					panel.add(getWeight);
					JTextField weight = new JTextField();
					weight.setBounds(120, 70, 80, 20);
					panel.add(weight);
					
					// to get quantity
					JLabel getQuantity = new JLabel("Quantity:");
					getQuantity.setBounds(40, 100, 80, 20);
					panel.add(getQuantity);
					JTextField quantity = new JTextField();
					quantity.setBounds(120, 100, 80, 20);
					panel.add(quantity);
					
					// to get shape
					JLabel getShape = new JLabel("Shape:");
					getShape.setBounds(40, 130, 80, 20);
					panel.add(getShape);
					JComboBox shape = new JComboBox();
					shape.addItem(" "); shape.addItem("Cubic"); shape.addItem("Rectangle"); shape.addItem("Pentagon"); shape.addItem("Cylinder");
					shape.setBounds(120, 130, 80, 20);
					panel.add(shape);
					
					// to get dimension
					JLabel getDimension = new JLabel("Dimension:");
					getDimension.setBounds(40, 160, 80, 20);
					panel.add(getDimension);
					JComboBox dimension = new JComboBox();
					dimension.addItem(" "); dimension.addItem("1"); dimension.addItem("2"); dimension.addItem("3");
					dimension.setBounds(120, 160, 80, 20);
					panel.add(dimension);
					
					// the ok button allows to get length, radius, width, height
					JButton ok = new JButton("ok");
					ok.setBounds(280, 200, 60, 20);
					panel.add(ok);
					ok.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (((String)shape.getSelectedItem()).equals("Cubic") && Integer.parseInt((String)dimension.getSelectedItem()) == 1) {
								JLabel getLength = new JLabel("length:");
								getLength.setBounds(40, 240, 80, 20);
								panel.add(getLength);
								JTextField length = new JTextField();
								length.setBounds(120, 240, 80, 20);
								panel.add(length);
							} else if (((String)shape.getSelectedItem()).equals("Rectangle") && Integer.parseInt((String)dimension.getSelectedItem()) == 3) {
								JLabel getLength = new JLabel("length:");
								getLength.setBounds(40, 240, 80, 20);
								panel.add(getLength);
								JTextField length = new JTextField();
								length.setBounds(120, 240, 80, 20);
								panel.add(length);
								JLabel getWidth = new JLabel("width:");
								getWidth.setBounds(40, 270, 80, 20);
								panel.add(getWidth);
								JTextField width = new JTextField();
								width.setBounds(120, 270, 80, 20);
								panel.add(width);
								JLabel getHeight = new JLabel("height:");
								getHeight.setBounds(40, 300, 80, 20);
								panel.add(getHeight);
								JTextField height = new JTextField();
								height.setBounds(120, 300, 80, 20);
								panel.add(height);
							} else if (((String)shape.getSelectedItem()).equals("Pentagon") && Integer.parseInt((String)dimension.getSelectedItem()) == 3) {
								JLabel getLength = new JLabel("length:");
								getLength.setBounds(40, 240, 80, 20);
								panel.add(getLength);
								JTextField length = new JTextField();
								length.setBounds(120, 240, 80, 20);
								panel.add(length);
								JLabel getRadius = new JLabel("radius:");
								getRadius.setBounds(40, 270, 80, 20);
								panel.add(getRadius);
								JTextField radius = new JTextField();
								radius.setBounds(120, 270, 80, 20);
								panel.add(radius);
								JLabel getHeight = new JLabel("height:");
								getHeight.setBounds(40, 300, 80, 20);
								panel.add(getHeight);
								JTextField height = new JTextField();
								height.setBounds(120, 300, 80, 20);
								panel.add(height);
							} else if (((String)shape.getSelectedItem()).equals("Cylinder") && Integer.parseInt((String)dimension.getSelectedItem()) == 2) {
								JLabel getRadius = new JLabel("radius:");
								getRadius.setBounds(40, 270, 80, 20);
								panel.add(getRadius);
								JTextField radius = new JTextField();
								radius.setBounds(120, 270, 80, 20);
								panel.add(radius);
								JLabel getHeight = new JLabel("height:");
								getHeight.setBounds(40, 300, 80, 20);
								panel.add(getHeight);
								JTextField height = new JTextField();
								height.setBounds(120, 300, 80, 20);
								panel.add(height);
							}
						}
					});
					
					// add a button
					JButton next = new JButton("next");
					next.setBounds(280, 500, 80, 20);
					panel.add(next);
					int j = i;
					next.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							// put the data to the array
							itemName[j] = name.getText();
							itemWeight[j] = Double.parseDouble(weight.getText());
							itemQuantity[j] = Integer.parseInt(quantity.getText());
							itemShape[j] = (String)shape.getSelectedItem();
							int dimSize = Integer.parseInt((String)dimension.getSelectedItem());
							double[] d = new double[dimSize];
							if (((String)shape.getSelectedItem()).equals("Cubic") && Integer.parseInt((String)dimension.getSelectedItem()) == 1) {
								
							} else if (((String)shape.getSelectedItem()).equals("Rectangle") && Integer.parseInt((String)dimension.getSelectedItem()) == 3) {
								
							} else if (((String)shape.getSelectedItem()).equals("Pentagon") && Integer.parseInt((String)dimension.getSelectedItem()) == 3) {
								
							} else if (((String)shape.getSelectedItem()).equals("Cylinder") && Integer.parseInt((String)dimension.getSelectedItem()) == 2) {
								
							}
							frame.dispose();
							//System.out.println(itemName[j]);
							
							if (j == Integer.parseInt(num.getText()) - 1){
								JFrame frame1 = new JFrame("Total Volume and Total Weight");
								frame1.setSize(400, 300);
								
								JPanel panel1 = new JPanel();
								panel1.setLayout(null);
								frame1.add(panel1);
								
								Item[] items = new Item[Integer.parseInt(num.getText())];
								for (int i = 0; i < items.length; i++) {
									//items[i] = new Item(itemName[i], itemShape[i], dimensions.get(i), itemWeight[i], itemQuantity[i]);
									items[i] = new Item(itemName[i], itemShape[i], itemWeight, itemWeight[i], itemQuantity[i]);
								}
								
								// total volume
								JLabel getTV = new JLabel("Total Volume:");
								getTV.setBounds(80, 60, 100, 20);
								panel1.add(getTV);
								JLabel tV = new JLabel("kg");
								tV.setBounds(220, 60, 100, 20);
								tV.setForeground(Color.BLUE);
								panel1.add(tV);
								
								// total weight
								JLabel getTW = new JLabel("Total Weight:");
								getTW.setBounds(80, 120, 100, 20);
								panel1.add(getTW);
								JLabel tW = new JLabel(totalWeight(items) + " kg");
								tW.setBounds(220, 120, 100, 20);
								tW.setForeground(Color.BLUE);
								panel1.add(tW);
								
								JButton next1 = new JButton("next");
								next1.setBounds(280, 220, 80, 20);
								panel1.add(next1);
								next.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										
									}
								});
								
								frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								frame1.setVisible(true);
							}
							
						}
					});
					
					// set frame visible
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
					
				}
				
			}
		});
		panel0.add(next0);
		
		frame0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame0.setVisible(true);
		
	}
	
	public static double totalVolume(Item[] order) {
		double volume = 0;
		if (order == null) return 0;
		else {
			for (int i = 0; i < order.length; i++) {
				volume += order[i].volume();
			}
			return volume;
		}
	}

	public static double totalWeight(Item[] order) {
		double weight = 0;
		if (order == null) return 0;
		else {
			for (int i = 0; i < order.length; i++) {
				weight += order[i].getmWeight() * order[i].getmQuantity();
			}
			return weight;
		}
	}

}
