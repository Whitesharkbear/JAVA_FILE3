package ch8;

public class ObjParamTest {
	ObjParam obj;

	void setObj(ObjParam _obj) {
		obj = _obj;
		obj.print();
	}

	ObjParam getObj() {
		obj.str = "return ObjParam";
		return obj;
	}

}
