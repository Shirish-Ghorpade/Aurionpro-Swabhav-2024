import com.sun.org.apache.bcel.internal.classfile.Method;

public class ReflectionOfString {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class stringClass = Class.forName("java.lang.String");
		System.out.println(stringClass.getName());
		System.out.println(stringClass.getSimpleName());
		System.out.println(stringClass.getSuperclass());
		
		java.lang.reflect.Method[] stringMethods = stringClass.getMethods();
		
		System.out.println("Methods");
		for(java.lang.reflect.Method method : stringMethods) {
			System.out.println(method.getName()+" "+method.getParameters());
		}
		System.out.println("Constructors");
		java.lang.reflect.Constructor[] stringConstructor = stringClass.getConstructors();
		
		for(java.lang.reflect.Constructor constructor : stringConstructor) {
			System.out.println(constructor.getName()+" "+constructor.getParameters());
		}
	}

}
