package constructor;

public class ThisKeyword {
	
		int age;
		String name;
		// here we used this keyword for call instance variable
		ThisKeyword(int age, String name){
			this.age = age;
			this.name = name;
		}
		void show() {
			System.out.println(age+ " "+name);
		}
		public static void main(String[] args) {
			ThisKeyword d=new ThisKeyword(20, "Vivek");
			ThisKeyword d1=new ThisKeyword(25, "Suhel");
			ThisKeyword d2=new ThisKeyword(21, "Zoha");
			d.show();
			d1.show();
			d2.show();
		}
}