package capter3;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal<String> {

	@Override
	protected String initialValue() {
		return new Date().getTime()+"";
	}

	@Override
	protected String childValue(String parentValue) {
		return parentValue + " 我在子线程加的~!";
	}
	
}
