package one.wangwei.java.rtti.innerclasses;

//: innerclasses/Parcel9.java
// An anonymous inner class that performs
// initialization. A briefer version of Parcel5.java.

/**
 * 如果想要在匿名内部类中使用外部定义的对象，那么编译器会要求其参数引用是fianl的
 * @author wangwei
 */
public class Parcel9 {
	// Argument must be final to use inside
	// anonymous inner class:
	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;

			@Override
			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania");
	}
} // /:~