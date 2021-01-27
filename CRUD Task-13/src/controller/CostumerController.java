package controller;

import java.sql.Date;
import java.util.List;

import dao.CostumerImpl;
import dao.ICostumer;
import model.Costumer;

public class CostumerController {
	ICostumer eImpl = new CostumerImpl();

	public int addCostumer(int id, String name, Date dos, String s) {
		Costumer costumer = new Costumer(id, name, dos, s);
		return eImpl.addCostumer(costumer);
	}

	public List<Costumer> viewCostumer() {
		return eImpl.viewCostumer();
	}

	public int editCostumer(int id, String name, Date dos, String seatNo) {
		Costumer costumer = new Costumer(id, name, dos, seatNo);
		return eImpl.editCostumer(costumer);
	}

	public int removeCostumer(int id) {
		Costumer costumer = new Costumer();
		costumer.setId(id);
		return eImpl.removeCostumer(costumer);
	}


}
