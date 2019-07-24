package callingInterfaceStaticMethodsFromImplementationClass;

public class InterfImpl implements Interf{

	public static void main(String[] args) {
		
		InterfImpl impl = new InterfImpl();
		
		// compiler gives warning here. because we can not override static methods
		//impl.test();
		
		
		// calling interface static method
		Interf.test();
	}
}
