package ch8;

public class ObjParamMain {

	public static void main(String[] args) {
		ObjParam myObj = new ObjParam();
		myObj.str = "hello param";
		
		ObjParamTest test = new ObjParamTest();
		test.setObj(myObj);
		ObjParam retParam = test.getObj();
		System.out.println("new str:" + retParam.str);
	}

}
