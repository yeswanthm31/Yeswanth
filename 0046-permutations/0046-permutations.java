class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        return permutateList(list, nums);
    }

    static List<List<Integer>> permutateList(List<Integer> processed, int[] up) {
        if (up.length == 0) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        int num = up[0];
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i <= processed.size(); i++) {
            List<Integer> first = new ArrayList<>(processed.subList(0, i));
            List<Integer> second = new ArrayList<>(processed.subList(i, processed.size()));
            first.add(num);
            first.addAll(second);
            ans.addAll(permutateList(first, Arrays.copyOfRange(up, 1, up.length)));
        }

        return ans;
    }
}