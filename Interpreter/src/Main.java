import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.*;

// Used to convert one representation of data into another
// The Context contains the information that will be interpreted
// The Expression is an abstract class that defines all the methods
// needed to perform the different conversions
// The Terminal or Concrete Expressions provide specific conversions
// on different types of data
public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		String  questionAsked = JOptionPane.showInputDialog(frame, "What is your Question");
	
		ConversionContext question = new ConversionContext(questionAsked);
		
		String fromConversion  = question.getFromConversion();
		
		String toConversion  = question.getToConversion();
		
		double quantity = question.getQuantity();
		
		try {
			Class tempClass = Class.forName(fromConversion);
			
			Constructor con = tempClass.getConstructor();
			
			Object convertFrom = (Expression) con.newInstance();
			
			Class[] methodParams = new Class[] { double.class };
			
			Method conversionMethod = tempClass.getMethod(toConversion, methodParams);
			
			Object[] params = new Object[] { new Double(quantity) };
			
			String toQuantity = (String) conversionMethod.invoke(convertFrom, params);
			
			String answerToQues = question.getResponse() + toQuantity + " " + toConversion;
			
			JOptionPane.showMessageDialog(null, answerToQues);
			
			frame.dispose();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
