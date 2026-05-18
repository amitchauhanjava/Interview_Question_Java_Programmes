package org.example.object_class;


public class EqualMethodEx {
	private int id;

	public EqualMethodEx(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		EqualMethodEx example = (EqualMethodEx) obj;
		return id == example.id;
	}
}

//
//	public class EqualMethodEx {
//		public void main(String[] args) {
//			EqualMethodEx ex1 = new EqualMethodEx(1);
//			EqualMethodEx ex2 = new EqualMethodEx(2);
//
//			System.out.println(ex1.equals(ex2));
//		}
//	}
