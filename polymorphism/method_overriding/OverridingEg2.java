package polymorphism.method_overriding;

class Sports{
	String getName() {
		return "Generic Sports";
	}
	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in " + getName());
	}
}
class Football extends Sports{
	@Override
	String getName() {
		return "Football Class";
	}
	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in " + getName());
	}
}
public class OverridingEg2 {
	public static void main(String[] args) {
		Sports c1 = new Sports();
		Football c2 = new Football();
		System.out.println(c1.getName());
		c1.getNumberOfTeamMembers();
		System.out.println(c2.getName());
		c2.getNumberOfTeamMembers();
	}
}
