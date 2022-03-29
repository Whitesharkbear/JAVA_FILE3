package ch14;

public class EqualsTest {
	public int x;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EqualsTest) {
			EqualsTest var = (EqualsTest) obj;
			if (this.x == var.x) {
				return true;
			}
		}
		return false;
	}

}
