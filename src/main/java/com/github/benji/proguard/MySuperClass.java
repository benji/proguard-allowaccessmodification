package com.github.benji.proguard;

public class MySuperClass {

	protected Object thething;

	protected boolean process(MySuperClass o) {
		return o.thething == null;
	}

}
