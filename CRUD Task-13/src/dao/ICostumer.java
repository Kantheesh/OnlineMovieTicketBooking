package dao;

import java.util.List;

import model.Costumer;

public interface ICostumer {
  public int addCostumer(Costumer costumer);

  public List<Costumer> viewCostumer();

  public int editCostumer(Costumer costumer);

  public int removeCostumer(Costumer costumer);
}