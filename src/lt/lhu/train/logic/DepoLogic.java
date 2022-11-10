package lt.lhu.train.logic;

import java.util.List;
import java.util.Scanner;

import lt.lhu.train.bean.Depo;
import lt.lhu.train.bean.Train;

public class DepoLogic {
	public List<Train> sortByNumber(Depo depo) {
		boolean flag = false;
		while (!flag) {
			flag = true;
			for (int i = 0; i < depo.getTrains().size() - 1; i++) {
				if (depo.getTrains().get(i + 1).getNumber() < depo.getTrains().get(i).getNumber()) {
					Train temp = new Train();
					temp = depo.getTrains().get(i);
					depo.getTrains().set(i, depo.getTrains().get(i + 1));
					depo.getTrains().set(i + 1, temp);
					flag = false;
				}
			}
		}
		return null;
	}

	public void sortByDepartureAndTime(Depo depo) {
		boolean flag = false;
		while (!flag) {
			flag = true;
			for (int i = 0; i < depo.getTrains().size() - 1; i++) {
				int x = depo.getTrains().get(i + 1).getDeparturePlace()
						.compareTo(depo.getTrains().get(i).getDeparturePlace());
				if (x < 0) {
					Train temp1 = new Train();
					temp1 = depo.getTrains().get(i);
					depo.getTrains().set(i, depo.getTrains().get(i + 1));
					depo.getTrains().set(i + 1, temp1);
					flag = false;
				}
			}
		}

		flag = false;
		while (!flag) {
			flag = true;
			for (int j = 0; j < depo.getTrains().size() - 1; j++) {
				int x2 = depo.getTrains().get(j + 1).getDeparturePlace()
						.compareTo(depo.getTrains().get(j).getDeparturePlace());
				if (x2 == 0) {
					int x3 = depo.getTrains().get(j + 1).getDepartureTime()
							.compareTo(depo.getTrains().get(j).getDepartureTime());
					if (x3 < 0) {
						Train temp2 = new Train();
						temp2 = depo.getTrains().get(j);
						depo.getTrains().set(j, depo.getTrains().get(j + 1));
						depo.getTrains().set(j + 1, temp2);
						flag = false;
					}
				}
			}
		}
	}

	public String findNumber(int number, Depo depo) {
		Depo findNumberDepo = new Depo();
		String s = "Нет поезда с таким номером";
		for (int i = 0; i < depo.getTrains().size(); i++) {
			if (number == depo.getTrains().get(i).getNumber()) {
				findNumberDepo.addTrains(depo.getTrains().get(i));
				s = findNumberDepo.toString();
			}
		}
		return s;
	}
}
