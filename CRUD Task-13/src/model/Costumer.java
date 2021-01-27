package model;

import java.sql.Date;

public class Costumer {
  private int id;
  private String name;
  private Date dos;
  private String seatNo;

  public Costumer() {
    // TODO Auto-generated constructor stub
  }

  public Costumer(int id, String name, Date dos, String s) {
    super();
    this.id = id;
    this.name = name;
    this.dos = dos;
    this.seatNo = s;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDos() {
    return dos;
  }

  public void setDos(Date dos) {
    this.dos = dos;
  }

  public String getSeatNo() {
    return seatNo;
  }

  public void setSeatNo(String salary) {
    this.seatNo = salary;
  }

  @Override
  public String toString() {
    return "id=" + id + ", name=" + name + ", date=" + dos + ", seatNo=" + seatNo;
  }

}