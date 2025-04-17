package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {
		Car_Chapter15 car = new Car_Chapter15(1, 10);
		car.gearChange(3);
		System.out.println("ギア1から3に切り替えました");
		System.out.println("速度は時速" + car.getSpeed() + "kmです");
	}

}
