package br.unicamp.beans;

import br.unicamp.beans.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-08-12T19:09:42")
@StaticMetamodel(Problem.class)
public class Problem_ { 

    public static volatile SingularAttribute<Problem, Long> id;
    public static volatile SingularAttribute<Problem, String> description;
    public static volatile ListAttribute<Problem, User> userGroup;
    public static volatile SingularAttribute<Problem, String> problemName;

}