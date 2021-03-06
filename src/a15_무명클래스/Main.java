package a15_무명클래스;
/**
 * 
 * 무명, 익명 클래스
 *
 */

/* new AnonymousClass() { } 의 중괄호안의 부분과 동일한 기능
 * class Test extends AnonymousClass{
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		
	}
} 
	선언해놓은 클래스이기에, 여러번 재사용 가능
	Test test1 = new Test();
	Test test2 = new Test();
	Test test3 = new Test();

*/ 

public class Main {
	//추상 클래스는 상속하여서 override를 해주어야 사용 가능하지만
	//*new AnonymousClass() { } 의 중괄호 안에서 재정의해주면서 눈에는 보이지않지만, 상속된 클래스가 하나 만들어진것*
	//이 클래스를 딱 한번만 생성할때 사용 --> 재사용 불가
	public static void main(String[] args) {
		AnonymousClass anonymousClass = new AnonymousClass() {
			
			@Override
			public void showInfo() {
				System.out.println("test1");
				
			}
		};
		
		//여러선언은 가능
		AnonymousClass anonymousClass2 = new AnonymousClass() {
			
			@Override
			public void showInfo() {
				System.out.println("test2");
				
			}
		};
		anonymousClass.showInfo();
		anonymousClass2.showInfo();

	}

}
