import org.jpl7.*;
import org.jpl7.fli.term_t;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Query q1 =  new Query(
                "consult",
                new Term[] {new Atom("test.pl")}

        );

        System.out.println( "consult " + (q1.hasSolution() ? "succeeded" : "failed"));

        Query q2 = new Query(
                "child_of",
                new Term[] {new Atom("steve"), new Atom("joe")}
        );

        System.out.println( "Steve is a child of Joe: " + (q2.hasSolution() ? "True" : "False"));

        Variable X = new Variable("X");
        Query q3 = new Query(
                "descendent_of",
                new Term[] {X, new Atom("ralf")}
        );

        Map<String, Term>[] solutions;
        solutions = q3.allSolutions();

        System.out.println("::: Descendants of Ralf :::");
        for(Map<String, Term> solution : solutions)
            System.out.println(solution.get("X"));
    }

}
