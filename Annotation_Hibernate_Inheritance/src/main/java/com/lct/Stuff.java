package com.lct;

import javax.persistence.*;
/*报错连接数据库后点数据库上面同步更新就解决了*/
@Entity
@Table(name = "stuff")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)//继承类型策略，单表继承

//区分列名称，区分类型，字符串
@DiscriminatorColumn(name="type",discriminatorType= DiscriminatorType.STRING)
@DiscriminatorValue(value="stuff")

public class Stuff {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)

  @Column(name = "id")
  private int id;

  @Column(name = "name")
  private String name;

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
}