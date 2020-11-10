package JavaAdvancedLecture6.ExProblem8;

public class Sorter {

    ////extend-ваш а COMMAND LIST, пишейки го преди VOID!               ///нека да приема директно инфото от съседния клас(който е лист)!
    public static<E extends Comparable<E>>                                  void sort(CustomList<E> list) {
        for (int i = 0; i < list.size; i++) {
            E current = list.get(i);
            for (int j = i + 1 ; j < list.size; j++) {
                E target = list.get(j);
                if (current.compareTo(target) > 0) {
                    list.swap(i, j);
                }
            }
        }




    }
}