package p0213;

public interface Action {
	//interface는 메서드의 선언만 가능하며 구현은 불가능하다(바디를 만들 수 없다)
	//interface에서 메서드의 접근제어자는 public만 가능하다, 즉 안쓰면 public
	void eat();
	void play();
	void work();
}

