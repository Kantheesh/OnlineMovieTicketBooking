package util;

public class Query {
  public static String adminAuthentication = "select * from admin where userName=? and password=?";
  public static String addCostumer = "insert into costumer values(?,?,?,?)";
  public static String viewCostumer = "select * from costumer";
  public static String editCostumer = "update costumer set name=?,dateOfShow=?,seatNo=? where id=?";
  public static String removeCostumer = "delete from costumer where id=?";
}
