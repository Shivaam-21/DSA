import java.util.*;

class Subsetsum2 {

    public void func(int ind, int nums[], List<Integer> ds, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(ds));
        for (int i = ind; i < nums.length; i++) {
            if (i != ind && nums[i] == nums[i - 1]) continue;
            ds.add(nums[i]);
            func(i + 1, nums, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> Subsetsum2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        func(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    // ✅ INPUT + OUTPUT added here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        int n = sc.nextInt();

        // input array
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Subsetsum2 sol = new Subsetsum2();
        List<List<Integer>> result = sol.Subsetsum2(nums);

        // print output
        System.out.println(result);
    }
}
