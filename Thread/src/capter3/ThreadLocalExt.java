package capter3;

public class ThreadLocalExt extends ThreadLocal<String> {

	@Override
	protected String initialValue() {
		return "����Ĭ��ֵ ��һ��get����Ϊnull";
	}

	
}
