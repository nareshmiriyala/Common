package com.dellnaresh.common.remote.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BadmintonHire.class)
public abstract class BadmintonHire_ {

	public static volatile SingularAttribute<BadmintonHire, Date> dateHired;
	public static volatile SingularAttribute<BadmintonHire, String> courtName;
	public static volatile SingularAttribute<BadmintonHire, Long> moneyPaid;
	public static volatile SingularAttribute<BadmintonHire, Date> startTime;
	public static volatile CollectionAttribute<BadmintonHire, BadmintonAccount> badmintonAccountCollection;
	public static volatile SingularAttribute<BadmintonHire, Long> id;
	public static volatile SingularAttribute<BadmintonHire, Date> endTime;
	public static volatile SingularAttribute<BadmintonHire, Player> payer;

}

