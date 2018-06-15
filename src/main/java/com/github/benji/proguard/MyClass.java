package com.github.benji.proguard;

public class MyClass extends MySuperClass {

	@Override
	protected boolean process(MySuperClass o) {
		return o.thething == null;
	}

}
