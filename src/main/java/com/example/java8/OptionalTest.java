package com.example.java8;

public class OptionalTest {

    public static void main(String[] args) {
        // isPresent() orElseGet()  map()  orElse()
		/*Optional<String> name = Optional.ofNullable("a");
		System.out.println(name.isPresent());
//		  public T orElseGet(Supplier<? extends T> other)  Supplier 函数式接口方法 T get();
		System.out.println(name.orElseGet( () -> "b"));
//		public<U> Optional<U> map(Function<? super T, ? extends U> mapper)	Function接口方法  R apply(T t)
		System.out.println(name.map(p -> "hey"+p).orElse("hey wang"));

		//常用方式
		String a = Optional.ofNullable("").orElse("b");
		Optional.ofNullable("test1").ifPresent(str -> System.out.println(str));
		Optional.ofNullable("test2").map(str -> "hey " + str).orElse("hey XX");
*/


        System.out.println(92000 / 30000);
//		System.out.println(3 % 3);
//		System.out.println(5 / 2);
//		System.out.println(5 % 2);

//		int a = 1;
//
//		System.out.println(a++);

//		System.out.println(++a);
    }

}
