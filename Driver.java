import java.util.HashSet;
import java.util.Set;

public class Driver {

    public static void main(String[] args) {
        RealCube realCube = new RealCube(); // possible colors are w, y, r, g, b, o
        realCube.e1.colors.add('w');
        realCube.e1.colors.add('r');
        realCube.e2.colors.add('w');
        realCube.e2.colors.add('g');
        realCube.e3.colors.add('w');
        realCube.e3.colors.add('b');
        realCube.e4.colors.add('w');
        realCube.e4.colors.add('o');
        realCube.e5.colors.add('y');
        realCube.e5.colors.add('r');
        realCube.e6.colors.add('y');
        realCube.e6.colors.add('g');
        realCube.e7.colors.add('y');
        realCube.e7.colors.add('b');
        realCube.e8.colors.add('y');
        realCube.e8.colors.add('o');
        realCube.e9.colors.add('r');
        realCube.e9.colors.add('g');
        realCube.e10.colors.add('r');
        realCube.e10.colors.add('b');
        realCube.e11.colors.add('o');
        realCube.e11.colors.add('g');
        realCube.e12.colors.add('o');
        realCube.e12.colors.add('b');
        realCube.c1.colors.add('w');
        realCube.c1.colors.add('b');
        realCube.c1.colors.add('o');
        realCube.c2.colors.add('w');
        realCube.c2.colors.add('b');
        realCube.c2.colors.add('r');
        realCube.c3.colors.add('w');
        realCube.c3.colors.add('g');
        realCube.c3.colors.add('o');
        realCube.c4.colors.add('w');
        realCube.c4.colors.add('g');
        realCube.c4.colors.add('r');
        realCube.c5.colors.add('y');
        realCube.c5.colors.add('b');
        realCube.c5.colors.add('o');
        realCube.c6.colors.add('y');
        realCube.c6.colors.add('b');
        realCube.c6.colors.add('r');
        realCube.c7.colors.add('y');
        realCube.c7.colors.add('g');
        realCube.c7.colors.add('o');
        realCube.c8.colors.add('y');
        realCube.c8.colors.add('g');
        realCube.c8.colors.add('r');

        ImpossibleCube icube = new ImpossibleCube(); // each edge has 2-4 possible color sets, stored in an ArrayList
        icube.e1options.add(new Edge('o', 'w'));
        icube.e1options.add(new Edge('o', 'y'));
        icube.e1options.add(new Edge('g', 'w'));
        icube.e1options.add(new Edge('g', 'y'));
        icube.e2options.add(new Edge('w', 'b'));
        icube.e2options.add(new Edge('r', 'w'));
        icube.e2options.add(new Edge('g', 'r'));
        icube.e3options.add(new Edge('y', 'b'));
        icube.e3options.add(new Edge('y', 'r'));
        icube.e4options.add(new Edge('g', 'o'));
        icube.e4options.add(new Edge('g', 'y'));
        icube.e4options.add(new Edge('o', 'w'));
        icube.e5options.add(new Edge('g', 'o'));
        icube.e5options.add(new Edge('b', 'r'));
        icube.e6options.add(new Edge('y', 'b'));
        icube.e6options.add(new Edge('y', 'r'));
        icube.e6options.add(new Edge('r', 'b'));
        icube.e7options.add(new Edge('g', 'y'));
        icube.e7options.add(new Edge('g', 'w'));
        icube.e8options.add(new Edge('y', 'g'));
        icube.e8options.add(new Edge('y', 'o'));
        icube.e8options.add(new Edge('r', 'g'));
        icube.e9options.add(new Edge('b', 'o'));
        icube.e10options.add(new Edge('r', 'b'));
        icube.e10options.add(new Edge('o', 'g'));
        icube.e11options.add(new Edge('w', 'b'));
        icube.e11options.add(new Edge('r', 'w'));
        icube.e12options.add(new Edge('o', 'w'));
        icube.e12options.add(new Edge('r', 'w'));

        icube.c1options.add(new Corner('g', 'y', 'o'));
        icube.c1options.add(new Corner('g', 'y', 'r'));
        icube.c2options.add(new Corner('b', 'w', 'o'));
        icube.c2options.add(new Corner('b', 'w', 'r'));
        icube.c2options.add(new Corner('b', 'y', 'o'));
        icube.c2options.add(new Corner('b', 'y', 'r'));
        icube.c3options.add(new Corner('b', 'y', 'r'));
        icube.c3options.add(new Corner('g', 'w', 'r'));
        icube.c3options.add(new Corner('b', 'y', 'o'));
        icube.c3options.add(new Corner('g', 'w', 'o'));
        icube.c4options.add(new Corner('g', 'w', 'r'));
        icube.c5options.add(new Corner('b', 'y', 'r'));
        icube.c5options.add(new Corner('b', 'w', 'o'));
        icube.c6options.add(new Corner('g', 'y', 'r'));
        icube.c6options.add(new Corner('b', 'y', 'r'));
        icube.c6options.add(new Corner('g', 'w', 'r'));
        icube.c6options.add(new Corner('b', 'w', 'r'));
        icube.c7options.add(new Corner('g', 'y', 'o'));
        icube.c7options.add(new Corner('b', 'w', 'o'));
        icube.c8options.add(new Corner('b', 'y', 'o'));
        icube.c8options.add(new Corner('g', 'y', 'o'));
        icube.c8options.add(new Corner('b', 'w', 'o'));
        icube.c8options.add(new Corner('g', 'w', 'o'));

        Set<Piece> masterSet = new HashSet<>(); //the exact list of pieces a real cube has
        masterSet.add(realCube.e1);
        masterSet.add(realCube.e2);
        masterSet.add(realCube.e3);
        masterSet.add(realCube.e4);
        masterSet.add(realCube.e5);
        masterSet.add(realCube.e6);
        masterSet.add(realCube.e7);
        masterSet.add(realCube.e8);
        masterSet.add(realCube.e9);
        masterSet.add(realCube.e10);
        masterSet.add(realCube.e11);
        masterSet.add(realCube.e12);
        masterSet.add(realCube.c1);
        masterSet.add(realCube.c2);
        masterSet.add(realCube.c3);
        masterSet.add(realCube.c4);
        masterSet.add(realCube.c5);
        masterSet.add(realCube.c6);
        masterSet.add(realCube.c7);
        masterSet.add(realCube.c8);

        // now, for each icube edge list, pick one of the edges and add it to a new set of edges
        // then, compare that new set to the master set; if they are equal, then the new set is a solution to the icube

        // call for all possible combinations
        StatsTracker st = new StatsTracker(0);
        for (int a1 = 0; a1 < 4; a1++) {
            for (int a2 = 0; a2 < 3; a2++) {
                for (int a3 = 0; a3 < 2; a3++) {
                    for (int a4 = 0; a4 < 3; a4++) {
                        for (int a5 = 0; a5 < 2; a5++) {
                            for (int a6 = 0; a6 < 3; a6++) {
                                for (int a7 = 0; a7 < 2; a7++) {
                                    for (int a8 = 0; a8 < 3; a8++) {
                                        for (int a9 = 0; a9 < 1; a9++) {
                                            for (int a10 = 0; a10 < 2; a10++) {
                                                for (int a11 = 0; a11 < 2; a11++) {
                                                    for (int a12 = 0; a12 < 2; a12++) {
                                                        for (int c1 = 0; c1 < 2; c1++) {
                                                            for (int c2 = 0; c2 < 4; c2++) {
                                                                for (int c3 = 0; c3 < 4; c3++) {
                                                                    for (int c4 = 0; c4 < 1; c4++) {
                                                                        for (int c5 = 0; c5 < 2; c5++) {
                                                                            for (int c6 = 0; c6 < 4; c6++) {
                                                                                for (int c7 = 0; c7 < 2; c7++) {
                                                                                    for (int c8 = 0; c8 < 4; c8++) {
                                                                                        testCombination(st, realCube, icube, masterSet, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, c1, c2, c3, c4, c5, c6, c7, c8);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }

        st.printSolutions();
        System.out.println(st.getCounter() + " total combinations tested.");
        System.out.println(st.getNumSolutions() + " possible solutions found.");
    }

    public static void testCombination(StatsTracker st, RealCube realCube, ImpossibleCube icube, Set<Piece> masterSet, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10, int a11, int a12, int c1, int c2, int c3, int c4, int c5, int c6, int c7, int c8) {
        Set<Piece> testSet = new HashSet<>();
        testSet.add(icube.e1options.get(a1));
        testSet.add(icube.e2options.get(a2));
        testSet.add(icube.e3options.get(a3));
        testSet.add(icube.e4options.get(a4));
        testSet.add(icube.e5options.get(a5));
        testSet.add(icube.e6options.get(a6));
        testSet.add(icube.e7options.get(a7));
        testSet.add(icube.e8options.get(a8));
        testSet.add(icube.e9options.get(a9));
        testSet.add(icube.e10options.get(a10));
        testSet.add(icube.e11options.get(a11));
        testSet.add(icube.e12options.get(a12));
        testSet.add(icube.c1options.get(c1));
        testSet.add(icube.c2options.get(c2));
        testSet.add(icube.c3options.get(c3));
        testSet.add(icube.c4options.get(c4));
        testSet.add(icube.c5options.get(c5));
        testSet.add(icube.c6options.get(c6));
        testSet.add(icube.c7options.get(c7));
        testSet.add(icube.c8options.get(c8));

        //System.out.println((testSet.size()));
        //System.out.println("test set edges:");
        for (Piece t : testSet) {
            //System.out.println(t.colors);
        }
        //System.out.println("real edges:");
        for (Piece t : masterSet) {
            //System.out.println(t.colors);
        }

        st.increment();

        // now compare to master set one piece at a time
        boolean matchingIsPossible = true;
        Piece removeFromMaster = new Edge();
        Piece removeFromTest = new Edge();
        while (!(masterSet.isEmpty()) && matchingIsPossible) {
            for (Piece m : masterSet) {
                //System.out.println("testing master piece " + m.colors);
                if (matchingIsPossible) {
                    boolean matchExists = false;
                    for (Piece t : testSet) {
                        if (t.isSameAs(m)) {
                            removeFromMaster = m;
                            removeFromTest = t;
                            matchExists = true;
                            //System.out.println("match found");
                            break;
                        }
                    }
                    if (matchExists) {
                        break;
                    }
                    if (!matchExists) matchingIsPossible = false;
                    //System.out.println(matchingIsPossible);
                }
            }
            if (matchingIsPossible) {
                masterSet.remove(removeFromMaster);
                testSet.remove(removeFromTest);
            }
        }
        if (matchingIsPossible) {
            //System.out.println("Matching found! after " + nb.getCounter() + " combinations for inputs " + a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6 + " " + a7 + " " + a8 + " " + a9 + " " + a10 + " " + a11 + " " + a12);
            String sol  = "Matching found after " + st.getCounter() + " combinations! ";
            sol += (("e1: " + icube.e1options.get(a1).colors + "; "));
            sol += (("e2: " + icube.e2options.get(a2).colors + "; "));
            sol += (("e3: " + icube.e3options.get(a3).colors + "; "));
            sol += (("e4: " + icube.e4options.get(a4).colors + "; "));
            sol += (("e5: " + icube.e5options.get(a5).colors + "; "));
            sol += (("e6: " + icube.e6options.get(a6).colors + "; "));
            sol += (("e7: " + icube.e7options.get(a7).colors + "; "));
            sol += (("e8: " + icube.e8options.get(a8).colors + "; "));
            sol += (("e9: " + icube.e9options.get(a9).colors + "; "));
            sol += (("e10: " + icube.e10options.get(a10).colors + "; "));
            sol += (("e11: " + icube.e11options.get(a11).colors + "; "));
            sol += (("e12: " + icube.e12options.get(a12).colors + "; "));
            sol += (("c1: " + icube.c1options.get(c1).colors + "; "));
            sol += (("c2: " + icube.c2options.get(c2).colors + "; "));
            sol += (("c3: " + icube.c3options.get(c3).colors + "; "));
            sol += (("c4: " + icube.c4options.get(c4).colors + "; "));
            sol += (("c5: " + icube.c5options.get(c5).colors + "; "));
            sol += (("c6: " + icube.c6options.get(c6).colors + "; "));
            sol += (("c7: " + icube.c7options.get(c7).colors + "; "));
            sol += (("c8: " + icube.c8options.get(c8).colors));
            st.addSolution(sol);
            st.incrementNumSolutions();
        }
        if (st.getCounter() % 10000000 == 0) {
            System.out.println(st.getCounter() + " combinations tested.");
        }

        masterSet.clear();
        masterSet.add(realCube.e1);
        masterSet.add(realCube.e2);
        masterSet.add(realCube.e3);
        masterSet.add(realCube.e4);
        masterSet.add(realCube.e5);
        masterSet.add(realCube.e6);
        masterSet.add(realCube.e7);
        masterSet.add(realCube.e8);
        masterSet.add(realCube.e9);
        masterSet.add(realCube.e10);
        masterSet.add(realCube.e11);
        masterSet.add(realCube.e12);
        masterSet.add(realCube.c1);
        masterSet.add(realCube.c2);
        masterSet.add(realCube.c3);
        masterSet.add(realCube.c4);
        masterSet.add(realCube.c5);
        masterSet.add(realCube.c6);
        masterSet.add(realCube.c7);
        masterSet.add(realCube.c8);
    }
}
