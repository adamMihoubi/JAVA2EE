package upec.groupe1.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(VoteOffices.class)
public abstract class VoteOffices_ {

	public static volatile SingularAttribute<VoteOffices, String> number;
	public static volatile SingularAttribute<VoteOffices, Long> idVoteOffices;
	public static volatile SingularAttribute<VoteOffices, String> postalCode;
	public static volatile SingularAttribute<VoteOffices, String> caption;
	public static volatile SingularAttribute<VoteOffices, String> adress;
	public static volatile SingularAttribute<VoteOffices, Double[]> geoPoint;

}

