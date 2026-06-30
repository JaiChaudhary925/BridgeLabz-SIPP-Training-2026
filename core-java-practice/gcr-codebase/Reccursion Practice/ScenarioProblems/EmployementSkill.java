import java.util.*;

class EmployementSkill {

    public void findTeams(int[] arr, int target, int index, List<Integer> current) {
        
        // Base case: target achieved
        if (target == 0) {
            System.out.println(current);
            return;
        }

        // Base case: out of bounds or target negative
        if (index == arr.length || target < 0) {
            return;
        }

        // Include current element
        current.add(arr[index]);
        findTeams(arr, target - arr[index], index + 1, current);

        // Backtrack (remove last element)
        current.remove(current.size() - 1);

        // Exclude current element
        findTeams(arr, target, index + 1, current);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] arr = {2, 3, 5, 7};
        int target = 10;

        obj.findTeams(arr, target, 0, new ArrayList<>());
    }
}