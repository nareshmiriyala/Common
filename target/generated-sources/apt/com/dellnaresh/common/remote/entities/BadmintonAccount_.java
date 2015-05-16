package com.dellnaresh.common.remote.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BadmintonAccount.class)
public abstract class BadmintonAccount_ {

	public static volatile SingularAttribute<BadmintonAccount, String> purpose;
	public static volatile SingularAttribute<BadmintonAccount, Date> created;
	public static volatile SingularAttribute<BadmintonAccount, Long> moneyPaid;
	public static volatile SingularAttribute<BadmintonAccount, Long> id;
	public static volatile SingularAttribute<BadmintonAccount, Date> lastModified;
	public static volatile SingularAttribute<BadmintonAccount, BadmintonHire> hireId;
	public static volatile SingularAttribute<BadmintonAccount, Long> moneyRecieved;
	public static volatile SingularAttribute<BadmintonAccount, Player> playerId;

}

