

/*
 * 
 * @ author Sam Keim - GitHub @SamTheEnby
 */

public class StringLab {

	public static void main(String[] args) {
		StringMethods strMthd = new StringMethods();
		
		System.out.println(strMthd.capitalize("blAZes"));
		
		System.out.println(strMthd.wheresWaldo("Striped Waldo!"));
		
		System.out.println(strMthd.firstThingsFirst("cat", "dog"));
		
		System.out.println(strMthd.firstThingsFirst("tree", "pine"));
		
		System.out.println(strMthd.reverse("happy"));
		
		System.out.println(strMthd.soLong("bean", "pea"));
		
		System.out.println(strMthd.soLong("tart","trap"));
		
		System.out.println(strMthd.afterMath("She aced the mathematics test!"));

		System.out.println(strMthd.afterMath("“My floor mat is so keen!"));
	
		System.out.println(strMthd.letterize("Java"));
	
		System.out.println(strMthd.camelCase("desert survival skills"));
	}
	

}
