package lt.lhu.train.main;

import java.util.Date;
import java.util.Scanner;

import lt.lhu.train.bean.Depo;
import lt.lhu.train.bean.Month;
import lt.lhu.train.bean.Train;
import lt.lhu.train.logic.DepoLogic;
import lt.lhu.train.view.DepoView;

public class Main {

	public static void main(String[] args) {
		Date d1 = new Date(2022 - 1900, Month.MARCH, 13, 15, 30);
		Date d2 = new Date(2022 - 1900, Month.DECEMBER, 1, 20, 15);
		Date d3 = new Date(2022 - 1900, Month.MAY, 6, 14, 45);
		Date d4 = new Date(2022 - 1900, Month.JANUARY, 15, 10, 10);
		Date d5 = new Date(2022 - 1900, Month.SEPTEMBER, 20, 20, 30);
		Date d6 = new Date(2022 - 1900, Month.FEBRUARY, 4, 16, 25);
		Date d7 = new Date(2022 - 1900, Month.OCTOBER, 9, 12, 30);
		Date d8 = new Date(2022 - 1900, Month.JULE, 17, 18, 15);
		Date d9 = new Date(2022 - 1900, Month.APRIL, 8, 12, 45);
		Date d10 = new Date(2022 - 1900, Month.JUNE, 23, 16, 30);

		Train tr1 = new Train(27, "Brest", d1);
		Train tr2 = new Train(44, "Pinsk", d2);
		Train tr3 = new Train(36, "Brest", d3);
		Train tr4 = new Train(11, "Grodno", d4);
		Train tr5 = new Train(18, "Mogilev", d5);
		Train tr6 = new Train(23, "Gomel", d6);
		Train tr7 = new Train(46, "Vitebsk", d7);
		Train tr8 = new Train(78, "Gomel", d8);
		Train tr9 = new Train(90, "Turov", d9);
		Train tr10 = new Train(65, "Soligorsk", d10);

		Depo depo = new Depo();

		depo.addTrains(tr1);
		depo.addTrains(tr2);
		depo.addTrains(tr3);
		depo.addTrains(tr4);
		depo.addTrains(tr5);
		depo.addTrains(tr6);
		depo.addTrains(tr7);
		depo.addTrains(tr8);
		depo.addTrains(tr9);
		depo.addTrains(tr10);

		DepoLogic logic = new DepoLogic();
		DepoView view = new DepoView();
		logic.sortByNumber(depo);
		view.print(depo);
		System.out.println();
		logic.sortByDepartureAndTime(depo);
		view.print(depo);
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер поезда");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Ошибка. Введите номер поезда: ");
		}
		int number = sc.nextInt();
		logic.findNumber(number, depo);
		view.printNumber(number, depo);

	}

}
