package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Costumer;
import util.Db;
import util.Query;

public class CostumerImpl implements ICostumer {
  PreparedStatement pst = null;
  ResultSet rs = null;
  int result = 0;

  @Override
  public int addCostumer(Costumer costumer) {
    try {
      pst = Db.getCon().prepareStatement(Query.addCostumer);
      pst.setInt(1, costumer.getId());
      pst.setString(2, costumer.getName());
      pst.setDate(3, costumer.getDos());
      pst.setString(4, costumer.getSeatNo());
      result = pst.executeUpdate();
    } catch (ClassNotFoundException | SQLException e) {
      result = 0;
    } finally {
      try {
        Db.getCon().close();
        pst.close();
      } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    return result;
  }

  @Override
  public List<Costumer> viewCostumer() {
    List<Costumer> costumer = new ArrayList<Costumer>();
    try {
      pst = Db.getCon().prepareStatement(Query.viewCostumer);
      rs = pst.executeQuery();
      while (rs.next()) {
        Costumer e = new Costumer(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4));
        costumer.add(e);
      }

    } catch (ClassNotFoundException | SQLException e) {
      try {
        Db.getCon().close();
        pst.close();
        rs.close();
      } catch (ClassNotFoundException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      } catch (SQLException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }

    }
    return costumer;
  }

  @Override
  public int editCostumer(Costumer costumer) {
    try {
      pst = Db.getCon().prepareStatement(Query.editCostumer);
      pst.setInt(4, costumer.getId());
      pst.setString(1, costumer.getName());
      pst.setDate(2, costumer.getDos());
      pst.setString(3, costumer.getSeatNo());
      result = pst.executeUpdate();
    } catch (ClassNotFoundException | SQLException e) {
      result = 0;
    } finally {
      try {
        Db.getCon().close();
        pst.close();
      } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    return result;
  }

  @Override
  public int removeCostumer(Costumer costumer) {
    try {
      pst = Db.getCon().prepareStatement(Query.removeCostumer);
      pst.setInt(1, costumer.getId());
      result = pst.executeUpdate();
    } catch (ClassNotFoundException | SQLException e) {
      result = 0;
    } finally {
      try {
        Db.getCon().close();
        pst.close();
      } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    return result;
  }

}

