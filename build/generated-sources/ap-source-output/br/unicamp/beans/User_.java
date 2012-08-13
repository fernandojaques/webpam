package br.unicamp.beans;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-08-12T19:09:42")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Long> id;
    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SetAttribute<User, String> authorizations;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, String> password;

}