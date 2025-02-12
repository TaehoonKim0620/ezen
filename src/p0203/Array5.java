package p0203;

public class Array5 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		// nums의 반복문을 사용해서 2,4,6,8,10,12,14,16,18,20 입력하면됩니다.
		for(int i=0;i<nums.length;i++) {
			nums[i] = (i+1) * 2;
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
	// 무조건 외워야될거
	// 참조,기본, 등등
	// if문 / for문 / 연산자 산술,비교,논리,증감,대입,삼항
	// 
}
