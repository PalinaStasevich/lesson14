//Создайте класс Train,содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в коллекцию элементов типа Train, добавьте возможность сортировки элементов 
//коллекции по номерам поездов. Добавьте возможность вывода информации о поезде,
//номер которого введен пользователем. Добавьте возможность сортировки коллекции по пункту 
//назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени 
//отправления.

package lt.lhu.train.bean;

import java.util.Date;
import java.util.Objects;

public class Train {

	private int number;
	private String departurePlace;
	private Date departureTime;

	public Train() {

	}

	public Train(int number, String departurePlace, Date departureTime) {
		this.number = number;
		this.departurePlace = departurePlace;
		this.departureTime = departureTime;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDeparturePlace() {
		return departurePlace;
	}

	public void setDeparturePlace(String departurePlace) {
		this.departurePlace = departurePlace;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(departurePlace, departureTime, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(departurePlace, other.departurePlace)
				&& Objects.equals(departureTime, other.departureTime) && number == other.number;
	}

	@Override
	public String toString() {
		return "Train [number=" + number + ", departurePlace=" + departurePlace + ", departureTime=" + departureTime
				+ "]";
	}

}
