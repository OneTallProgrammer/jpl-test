child_of(joe, ralf).
child_of(mark, ralf). 
child_of(mary, tom). 
child_of(steve, joe).
descendent_of(X, Y) :- 
    child_of(X, Y). 
descendent_of(X, Y) :- 
    child_of(Z, Y), 
    descendent_of(X, Z).