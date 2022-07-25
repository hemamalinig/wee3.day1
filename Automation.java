
public class Automation extends MultipleLangauge implements Language, TestTool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation auto = new Automation();
		auto.Java();
		auto.Selenium();
		auto.ruby();
		auto.python();			
	}
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java method from interface Language");
	}
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium method from interface TestTool");		
	}
	@Override
	public void python() {
		// TODO Auto-generated method stub
		System.out.println("implemented phyton method form abstract class");	
	}

}
