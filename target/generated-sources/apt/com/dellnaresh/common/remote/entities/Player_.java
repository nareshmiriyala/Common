package com.dellnaresh.common.remote.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Player.class)
public abstract class Player_ {

	public static volatile SingularAttribute<Player, String> lastName;
	public static volatile SingularAttribute<Player, String> address;
	public static volatile SingularAttribute<Player, Date> endDate;
	public static volatile CollectionAttribute<Player, BadmintonHire> badmintonHireCollection;
	public static volatile SingularAttribute<Player, Short> active;
	public static volatile SingularAttribute<Player, String> emailID;
	public static volatile SingularAttribute<Player, Date> joiningDate;
	public static volatile SingularAttribute<Player, Users> users;
	public static volatile SingularAttribute<Player, String> firstName;
	public static volatile SingularAttribute<Player, String> middleName;
	public static volatile CollectionAttribute<Player, BadmintonAccount> badmintonAccountCollection;
	public static volatile SingularAttribute<Player, Integer> id;
	public static volatile SingularAttribute<Player, Long> contactNo;

}

