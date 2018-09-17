package upec.groupe1.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Adresse.class)
public abstract class Adresse_ {

	public static volatile SingularAttribute<Adresse, Integer> Arr;
	public static volatile SingularAttribute<Adresse, String> streetName;
	public static volatile SingularAttribute<Adresse, AttachedZone> attachedZone;
	public static volatile SingularAttribute<Adresse, Integer> streetNum;
	public static volatile SingularAttribute<Adresse, Long> idAdresses;
	public static volatile SingularAttribute<Adresse, Double[]> geoPoint;

}

