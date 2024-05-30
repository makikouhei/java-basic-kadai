package java_kadai015;

public class Car_Chapter15 {
	//ギアの値
		private int gear = 1;
		//時速
		private int speed = 10;


		public void gearChange(final int afterGear) {
			this.gear = afterGear;
			if(this.gear >= 1 == this.gear <= 5) {
				speed = this.gear * 10;
			} else {
				speed = 10;
			}
		}
		public void run() {
			System.out.println("車の時速は" + this.speed + "㎞です");

		}

}
