package com.dellnaresh.common.remote.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Users.class)
public abstract class Users_ {

	public static volatile SingularAttribute<Users, String> password;
	public static volatile CollectionAttribute<Users, UserRoles> userRolesCollection;
	public static volatile SingularAttribute<Users, Integer> login;
	public static volatile SingularAttribute<Users, String> username;
	public static volatile SingularAttribute<Users, Player> player;

}

