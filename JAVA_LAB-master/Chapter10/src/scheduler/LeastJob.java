package scheduler;

<<<<<<< HEAD
=======
// 현재 상담업무가 없거나 상담대기가 가장 작은 상담원에게 배분합니다.
>>>>>>> 4abdbc8 (d)
public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
<<<<<<< HEAD

		System.out.println("�긽�떞 �쟾�솕瑜� �닚�꽌���濡� ���湲곗뿴�뿉�꽌 媛��졇�샃�땲�떎 ");
=======
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
		
>>>>>>> 4abdbc8 (d)
	}

	@Override
	public void sendCallToAgent() {
<<<<<<< HEAD

		System.out.println(" �쁽�옱 �긽�떞�뾽臾닿�� �뾾嫄곕굹 �긽�떞���湲곌�� 媛��옣 �쟻��� �긽�떞�썝�뿉寃� �븷�떦�빀�땲�떎 . ");

=======
		System.out.println("현재 상담업무가 없거나 상담대기가 가장 작은 상담원에게 할당합니다.");
		
>>>>>>> 4abdbc8 (d)
	}

}
