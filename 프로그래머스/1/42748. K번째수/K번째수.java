import java.util.*;
import java.util.stream.Collectors;



class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> arrayList = Arrays.stream(array)
                                        .boxed()
                                        .collect(Collectors.toList());

        List<List<Integer>> commandsList = Arrays.stream(commands)
                                                 .map(row -> Arrays.stream(row)
                                                                   .boxed()
                                                                   .collect(Collectors.toCollection(ArrayList::new))
                                                 )
                                                 .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < commandsList.size(); i++) {
            List<Integer> command = commandsList.get(i);
            List<Integer> boxedArrayList = new ArrayList<>(arrayList.subList(command.get(0) - 1, command.get(1)));

            result.add(boxedArrayList.stream().sorted().collect(Collectors.toList()).get(command.get(2) - 1));
        }

        return result.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}