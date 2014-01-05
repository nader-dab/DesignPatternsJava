import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import javax.print.attribute.standard.MediaSize.Other;


public class Main {

	public static void main(String[] args) {
		
		Class reflectClass = UFOEnemyShip.class;
		
		String className = reflectClass.getName();
		
		System.out.println(className + "\n");
		
		int classModifier = reflectClass.getModifiers();
		
		// isAbstract, isFinal, isInterface, isPrivate, isProtected
		// isStatic, isStrict, isSynchronized, isVolatile
		
		System.out.println("Is public: " + Modifier.isPublic(classModifier) + "\n");
	
		Class[] interfaces = reflectClass.getInterfaces();
		
		Class classSuper = reflectClass.getSuperclass();
		
		System.out.println(classSuper.getName() + "\n");
		
		Method[] classMethods = reflectClass.getMethods();
		
		for (Method method : classMethods) {
			
			System.out.println("Method Name: " + method.getName());
			
			if(method.getName().startsWith("get")){
				
				System.out.println("Getter Method");
				
			} else if (method.getName().startsWith("set")){
				
				System.out.println("Setter Method");
			}
			
			System.out.println("return Type: " + method.getReturnType());
			
			Class[] parameterType = method.getParameterTypes();
			
			System.out.println("Parameters");
			
			for (Class parameter : parameterType) {
				
				System.out.println(parameter.getName());
			}
			
			System.out.println();
		}
		
		Constructor constructor = null;
		
		Object constructor2 = null;
		
		try {
			
			constructor = reflectClass.getConstructor(new Class[] { int.class, String.class});
			
			constructor2 = reflectClass
					.getConstructor(new Class[] { int.class, String.class })
					.newInstance(12, "random string");
			
			
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {

			e.printStackTrace();
		}
		
		Class[] constructParameters = constructor.getParameterTypes();
		
		for (Class parameter : constructParameters) {
			
			System.out.println(parameter.getName());
		}
		
		UFOEnemyShip newEnemyShip = null;
		
		try {
			newEnemyShip = (UFOEnemyShip) constructor.newInstance(43, "lolololo");
		} catch (InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Field privateStringName = null;
		
		UFOEnemyShip enemyShip = new UFOEnemyShip(66, "wat eva");
		
		try {
			String idCodeString = "idcode";
			
			privateStringName = UFOEnemyShip.class.getDeclaredField(idCodeString);
			
			privateStringName.setAccessible(true);
			
			String valueOfName = (String) privateStringName.get(enemyShip);
			
			System.out.println("Private Field Name: " + valueOfName);
			
			
			String methodName = "getPrivate";
			
			Method privateMethod = UFOEnemyShip.class.getDeclaredMethod(methodName, null);
			
			privateMethod.setAccessible(true);
			
			String privateReturnValue = (String) privateMethod.invoke(enemyShip, null);
			
			System.out.println("EnemyShip private method: " + privateReturnValue);
			
			
			Class[] methodParameters = new Class[] { Integer.TYPE, String.class };
			
			Object[] params = new Object[] { new Integer(10), new String("Pesho") };
			
			Method othePrivateMethod = UFOEnemyShip.class.getDeclaredMethod("getOtherPrivate", methodParameters);
			
			othePrivateMethod.setAccessible(true);
			
			String otherReturnValue = (String) othePrivateMethod.invoke(enemyShip, params);
			
			System.out.println("Other private method: " + otherReturnValue);
			
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
