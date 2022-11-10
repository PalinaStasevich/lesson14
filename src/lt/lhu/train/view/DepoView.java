package lt.lhu.train.view;

import lt.lhu.train.bean.Depo;
import lt.lhu.train.bean.Train;
import lt.lhu.train.logic.DepoLogic;

public class DepoView {
	public void print(Depo depo) {
		for (Train i : depo.getTrains()) {
			System.out.print(i);
			System.out.println();
		}
	}
	public void printNumber(int number, Depo depo)  {
		DepoLogic logic = new DepoLogic();
		System.out.println(logic.findNumber(number, depo));
	}
}
